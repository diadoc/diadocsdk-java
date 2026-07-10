package Diadoc.Api.auth.oidc;

import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import com.google.gson.Gson;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public final class OidcAuthenticator {

    private static final String DEFAULT_OIDC_BASE_URL = "https://identity.kontur.ru";
    private static final String OIDC_TOKEN_ENDPOINT_PATH = "/connect/token";

    private OidcAuthenticator() {
    }

    public static String authenticateWithOidc(String clientId, String clientSecret, String refreshToken) throws DiadocSdkException {
        return authenticateWithOidc(clientId, clientSecret, refreshToken, DEFAULT_OIDC_BASE_URL);
    }

    public static String authenticateWithOidc(String clientId, String clientSecret, String refreshToken, String oidcBaseUrl) throws DiadocSdkException {
        if (Tools.isNullOrEmpty(clientId)) {
            throw new IllegalArgumentException("clientId cannot be empty or null");
        }
        if (Tools.isNullOrEmpty(clientSecret)) {
            throw new IllegalArgumentException("clientSecret cannot be empty or null");
        }
        if (Tools.isNullOrEmpty(refreshToken)) {
            throw new IllegalArgumentException("refreshToken cannot be empty or null");
        }

        String baseUrl = Tools.isNullOrEmpty(oidcBaseUrl) ? DEFAULT_OIDC_BASE_URL : oidcBaseUrl;
        OidcTokenResponse response = performOidcTokenRequest(baseUrl, clientId, clientSecret, refreshToken);
        return response.getAccessToken();
    }

    private static OidcTokenResponse performOidcTokenRequest(String baseUrl, String clientId, String clientSecret, String refreshToken) throws DiadocSdkException {
        List<NameValuePair> parameters = new ArrayList<>();
        parameters.add(new BasicNameValuePair("grant_type", "refresh_token"));
        parameters.add(new BasicNameValuePair("refresh_token", refreshToken));
        parameters.add(new BasicNameValuePair("client_id", clientId));
        parameters.add(new BasicNameValuePair("client_secret", clientSecret));

        HttpPost request = new HttpPost(baseUrl + OIDC_TOKEN_ENDPOINT_PATH);
        request.setEntity(new UrlEncodedFormEntity(parameters, StandardCharsets.UTF_8));

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse httpResponse = httpClient.execute(request)) {
            String json = EntityUtils.toString(httpResponse.getEntity(), StandardCharsets.UTF_8);

            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != 200) {
                throw new DiadocSdkException(
                        "OIDC token endpoint returned status " + statusCode + ". Response body: " + json);
            }

            return parseOidcTokenResponse(json);
        } catch (IOException e) {
            throw new DiadocSdkException(e);
        }
    }

    private static OidcTokenResponse parseOidcTokenResponse(String json) throws DiadocSdkException {
        OidcTokenResponse result = new Gson().fromJson(json, OidcTokenResponse.class);
        if (result == null || Tools.isNullOrEmpty(result.getAccessToken())) {
            throw new DiadocSdkException("OIDC token endpoint returned response without access_token. Response body: " + json);
        }
        return result;
    }
}