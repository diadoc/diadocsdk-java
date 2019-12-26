package Diadoc.Api.auth;

import org.apache.http.auth.AuthScope;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

public class AuthManager {
    private boolean isAuthenticated = false;
    private String apiClientId;
    private CredentialsProvider credentialsProvider;

    public AuthManager(String apiClientId) {
        this.apiClientId = apiClientId;
        credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocCredentials(apiClientId, null));
    }

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
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
}
