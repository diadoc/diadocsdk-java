package Diadoc.Api.httpClient;

import Diadoc.Api.ConnectionSettings;
import Diadoc.Api.exceptions.DiadocException;
import Diadoc.Api.auth.DiadocPreemptiveAuthRequestInterceptor;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.EnvironmentHelpers;
import Diadoc.Api.helpers.Tools;
import org.apache.commons.io.IOUtils;
import org.apache.http.*;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustAllStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.jetbrains.annotations.Nullable;

import javax.mail.internet.ContentDisposition;
import javax.mail.internet.ParseException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.concurrent.TimeoutException;

public class DiadocHttpClient {

    private CloseableHttpClient httpClient;
    private String baseUrl;
    private String solutionInfo;

    public DiadocHttpClient(
            CredentialsProvider credentialsProvider,
            String baseUrl,
            @Nullable HttpHost proxyHost,
            @Nullable ConnectionSettings connectionSettings) {
        var sslSocketFactory = getTrustfulSslSocketFactory();

        var connectionManager = new PoolingHttpClientConnectionManager(
                RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("https", sslSocketFactory)
                        .register("http", new PlainConnectionSocketFactory())
                        .build());
        if(connectionSettings != null) {
            connectionManager.setMaxTotal(connectionSettings.getMaxTotalConnections());
            connectionManager.setDefaultMaxPerRoute(connectionSettings.getMaxConnectionsPerRoute());
        }
        var httpClientBuilder = HttpClients
                .custom()
                .setSSLSocketFactory(sslSocketFactory)
                .setConnectionManager(connectionManager)
                .setUserAgent(EnvironmentHelpers.getUserAgentString())
                .addInterceptorFirst(new DiadocPreemptiveAuthRequestInterceptor())
                .addInterceptorLast(new ContentLengthInterceptor())
                .setDefaultCredentialsProvider(credentialsProvider);

        if (proxyHost != null) {
            httpClientBuilder.setProxy(proxyHost);
        }

        httpClient = httpClientBuilder.build();
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setSolutionInfo(String solutionInfo) {
        this.solutionInfo = solutionInfo;
    }

    public byte[] performRequest(RequestBuilder requestBuilder) throws IOException {
        try (var response = httpClient.execute(createRequest(requestBuilder))) {
            return getResponseBytes(response);
        }
    }

    public GeneratedFile performRequestWithGeneratedFile(RequestBuilder requestBuilder) throws IOException, ParseException {
        try (var response = httpClient.execute(createRequest(requestBuilder))) {
            return new GeneratedFile(tryGetHttpResponseFileName(response), getResponseBytes(response));
        }
    }

    public FileContent performRequestWithFileContent(RequestBuilder requestBuilder) throws IOException {
        try (var response = httpClient.execute(createRequest(requestBuilder))) {
            return new FileContent(getResponseBytes(response), tryGetFileContentName(response));
        }
    }

    public DiadocResponseInfo getResponse(RequestBuilder requestBuilder) throws IOException {
        try (var response = httpClient.execute(createRequest(requestBuilder))) {
            return getResponse(response);
        }
    }

    public DiadocResponseInfo getRawResponse(RequestBuilder requestBuilder) throws IOException, ParseException {
        try (var response = httpClient.execute(createRequest(requestBuilder))) {
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

    private HttpUriRequest createRequest(RequestBuilder requestBuilder) {
        var requestConfig = RequestConfig.custom().setAuthenticationEnabled(false).build();
        if (solutionInfo != null && !solutionInfo.isEmpty()) {
            requestBuilder.setHeader("X-Solution-Info", solutionInfo);
        }
        return requestBuilder.setConfig(requestConfig).build();
    }

    private HttpUriRequest createWaitRequest(String path, String taskId) throws URISyntaxException {
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

    private static SSLConnectionSocketFactory getTrustfulSslSocketFactory() {
        try {
            var ctx = SSLContextBuilder.create().loadTrustMaterial(new TrustAllStrategy()).build();
            return new SSLConnectionSocketFactory(ctx, NoopHostnameVerifier.INSTANCE);
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
            e.printStackTrace();
            throw new RuntimeException("Can't create ssl connection factory", e);
        }
    }

    public byte[] waitTaskResult(String path, String taskId, @Nullable Integer timeoutInMillis) throws DiadocSdkException {
        if (timeoutInMillis == null) {
            timeoutInMillis = 5 * 60 * 1000;
        }
        var timeLimit = new Date(new Date().getTime() + timeoutInMillis).getTime();

        try {
            while (true) {
                try (var response = httpClient.execute(createWaitRequest(path, taskId))) {
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
