package Diadoc.Api.httpClient;

import Diadoc.Api.ConnectionSettings;
import Diadoc.Api.auth.DiadocCredentials;
import Diadoc.Api.exceptions.DiadocException;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.jetbrains.annotations.Nullable;

import javax.mail.internet.ContentDisposition;
import javax.mail.internet.ParseException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.concurrent.TimeoutException;

public class DiadocHttpClient {

    protected CloseableHttpClient httpClient;

    private final String baseUrl;

    private final String apiClientId;

    private final CredentialsProvider credentialsProvider;

    private boolean isAuthenticated = false;

    public DiadocHttpClient(
            String apiClientId,
            String baseUrl,
            @Nullable HttpHost proxyHost,
            @Nullable ConnectionSettings connectionSettings) {
        this(apiClientId, baseUrl, DefaultHttpClientBuilder.defaultClient(proxyHost, connectionSettings));
    }

    public DiadocHttpClient(String apiClientId, String baseUrl, DefaultHttpClientBuilder clientBuilder) {
        if (baseUrl == null) {
            throw new IllegalArgumentException("url");
        }

        this.apiClientId = apiClientId;
        this.baseUrl = baseUrl;

        credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocCredentials(apiClientId, null));

        httpClient = clientBuilder.build(credentialsProvider);
    }


    public String getBaseUrl() {
        return baseUrl;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setCredentials(String authToken) {
        isAuthenticated = (authToken != null);
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocCredentials(apiClientId, authToken));
    }

    public void clearCredentials(){
        isAuthenticated = false;
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocCredentials(apiClientId, null));
    }

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    protected CloseableHttpResponse performCall(RequestBuilder requestBuilder) throws IOException {
        return performCall(createRequest(requestBuilder));
    }

    protected CloseableHttpResponse performCall(HttpUriRequest request) throws IOException {
        return httpClient.execute(request);
    }

    public byte[] performRequest(RequestBuilder requestBuilder) throws IOException {
        try (var response = performCall(requestBuilder)) {
            return getResponseBytes(response);
        }
    }

    public GeneratedFile performRequestWithGeneratedFile(RequestBuilder requestBuilder) throws IOException, ParseException {
        try (var response = performCall(requestBuilder)) {
            return new GeneratedFile(tryGetHttpResponseFileName(response), getResponseBytes(response));
        }
    }

    public FileContent performRequestWithFileContent(RequestBuilder requestBuilder) throws IOException {
        try (var response = performCall(requestBuilder)) {
            return new FileContent(getResponseBytes(response), tryGetFileContentName(response));
        }
    }

    public DiadocResponseInfo getResponse(RequestBuilder requestBuilder) throws IOException {
        try (var response = performCall(requestBuilder)) {
            return getResponse(response);
        }
    }

    public DiadocResponseInfo getRawResponse(RequestBuilder requestBuilder) throws IOException, ParseException {
        try (var response = performCall(requestBuilder)) {
            return getRawResponse(response);
        }
    }

    private byte[] getResponseBytes(HttpResponse response) throws IOException {
        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            throw new HttpResponseException(
                    response.getStatusLine().getStatusCode(),
                    new String(IOUtils.toByteArray(response.getEntity().getContent())));
        }
        return IOUtils.toByteArray(response.getEntity().getContent());
    }

    private DiadocResponseInfo getResponse(HttpResponse response) throws IOException {
        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            return DiadocResponseInfo.fail(
                    response.getStatusLine().getStatusCode(),
                    new String(IOUtils.toByteArray(response.getEntity().getContent())),
                    tryGetRetryAfter(response));
        }
        return DiadocResponseInfo.success(IOUtils.toByteArray(response.getEntity().getContent()), response.getStatusLine().getStatusCode());
    }

    private DiadocResponseInfo getRawResponse(HttpResponse response) throws IOException, ParseException {
        var statusCode = response.getStatusLine().getStatusCode();
        if (statusCode < HttpStatus.SC_OK || statusCode >= HttpStatus.SC_BAD_REQUEST) {
            throw new HttpResponseException(
                    statusCode,
                    new String(IOUtils.toByteArray(response.getEntity().getContent())));
        }
        return new DiadocResponseInfo(
                response.getEntity() != null && response.getEntity().getContent() != null
                        ? IOUtils.toByteArray(response.getEntity().getContent())
                        : null,
                tryGetRetryAfter(response),
                statusCode,
                response.getStatusLine().getReasonPhrase(),
                tryGetHttpResponseFileName(response),
                tryGetContentType(response));
    }

    protected HttpUriRequest createRequest(RequestBuilder requestBuilder) {
        var requestConfig = RequestConfig.custom().setAuthenticationEnabled(false).build();
        return requestBuilder.setConfig(requestConfig).build();
    }

    protected HttpUriRequest createWaitRequest(String path, String taskId) throws URISyntaxException {
        return createRequest(RequestBuilder.get(
                new URIBuilder(baseUrl)
                        .setPath(path)
                        .addParameter("taskId", taskId)
                        .build()));
    }

    @Nullable
    private static String tryGetContentType(HttpResponse response) {
        if (response.getEntity() != null && response.getEntity().getContentType() != null) {
            return response.getEntity().getContentType().getValue();
        }
        return null;
    }

    public byte[] waitTaskResult(String path, String taskId, @Nullable Integer timeoutInMillis) throws DiadocSdkException {
        if (timeoutInMillis == null) {
            timeoutInMillis = 5 * 60 * 1000;
        }
        var timeLimit = new Date(new Date().getTime() + timeoutInMillis).getTime();

        try {
            while (true) {
                try (var response = performCall(createWaitRequest(path, taskId))) {
                    var statusCode = response.getStatusLine().getStatusCode();
                    if (statusCode == HttpStatus.SC_NO_CONTENT) {
                        if (new Date().getTime() > timeLimit) {
                            throw new TimeoutException(String.format("Can't GET '%s'. Timeout %ds expired.", path, timeLimit / 1000));
                        }
                        var retryAfter = tryGetRetryAfter(response);
                        int delayInSeconds = retryAfter != null
                                ? Math.min(retryAfter, 15)
                                : 15;
                        Thread.sleep(delayInSeconds * 1000);
                        continue;
                    }
                    if (statusCode != HttpStatus.SC_OK) {
                        throw new DiadocException(response.getStatusLine().getReasonPhrase(), statusCode, tryGetDiadocErrorCode(response));
                    }
                    return getResponseBytes(response);
                }
            }
        } catch (IOException | URISyntaxException | TimeoutException | InterruptedException | DiadocException e) {
            e.printStackTrace();
            throw new DiadocSdkException(e);
        }
    }

    @Nullable
    private static Integer tryGetRetryAfter(HttpResponse response) {
        Header[] retryAfterHeaders = response.getHeaders(HttpHeaders.RETRY_AFTER);
        if (retryAfterHeaders.length > 0) {
            String retryAfterStr = retryAfterHeaders[0].getValue();
            if (!Tools.isNullOrEmpty(retryAfterStr)) {
                return Integer.parseInt(retryAfterStr);
            }
        }
        return null;
    }

    @Nullable
    private static String tryGetDiadocErrorCode(HttpResponse webResponse) {
        Header[] errorCodeHeaders = webResponse.getHeaders("X-Diadoc-ErrorCode");
        if (errorCodeHeaders.length > 0) {
            return errorCodeHeaders[0].getValue();
        }
        return null;
    }

    @Nullable
    private static String tryGetHttpResponseFileName(HttpResponse webResponse) throws ParseException {
        Header[] dispositions = webResponse.getHeaders("Content-Disposition");
        if (dispositions == null || dispositions.length == 0)
            return null;
        return new ContentDisposition(dispositions[0].getValue()).getParameter("filename");
    }

    @Nullable
    private static String tryGetFileContentName(HttpResponse response) {
        Header fileNameHeader = response.getFirstHeader("X-Diadoc-FileName");
        return fileNameHeader == null ? null : fileNameHeader.getValue();
    }
}
