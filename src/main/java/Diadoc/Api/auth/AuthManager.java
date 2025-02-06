package Diadoc.Api.auth;

import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.auth.AuthScope;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

public class AuthManager implements IAuthManager {
    private volatile boolean isAuthenticated;
    private final String apiClientId;
    private final CredentialsProvider credentialsProvider;

    public AuthManager(String apiClientId) {
        if (Tools.isNullOrEmpty(apiClientId)) {
            throw new IllegalArgumentException("ApiClientId cannot be empty or null");
        }
        this.apiClientId = apiClientId;
        isAuthenticated = false;
        credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocCredentials(apiClientId, null));
    }

    @Override
    public AuthenticateClient createAuthenticateClient(DiadocHttpClient httpClient) {
        return new AuthenticateClient(this, httpClient);
    }

    @Override
    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    @Override
    public AuthenticationType getAuthenticationType() {
        return AuthenticationType.DIADOC;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setCredentials(String authToken) {
        isAuthenticated = authToken != null;
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocCredentials(apiClientId, authToken));
    }

    public void clearCredentials() {
        isAuthenticated = false;
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocCredentials(apiClientId, null));
    }
}
