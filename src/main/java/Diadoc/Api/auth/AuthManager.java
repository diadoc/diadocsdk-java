package Diadoc.Api.auth;

import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.CredentialsProvider;

public class AuthManager {

    private final DiadocHttpClient diadocHttpClient;

    public AuthManager(DiadocHttpClient diadocHttpClient) {
        this.diadocHttpClient = diadocHttpClient;
    }

    public CredentialsProvider getCredentialsProvider() {
        return diadocHttpClient.getCredentialsProvider();
    }

    public boolean isAuthenticated() {
        return diadocHttpClient.isAuthenticated();
    }

    public void setCredentials(String authToken) {
        diadocHttpClient.setCredentials(authToken);
    }

    public void clearCredentials(){
        diadocHttpClient.clearCredentials();
    }

}
