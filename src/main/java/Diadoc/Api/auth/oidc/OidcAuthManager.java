package Diadoc.Api.auth.oidc;

import Diadoc.Api.auth.AuthenticateClient;
import Diadoc.Api.auth.AuthenticationType;
import Diadoc.Api.auth.IAuthManager;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.auth.AuthScope;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

import java.util.Objects;

public class OidcAuthManager implements IAuthManager {

    private final TokenProvider tokenProvider;
    private final CredentialsProvider credentialsProvider;

    public OidcAuthManager(TokenProvider tokenProvider) {
        Objects.requireNonNull(tokenProvider, "tokenProvider cannot be null");
        this.tokenProvider = tokenProvider;
        credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new DiadocOidcCredentials(tokenProvider));
    }

    @Override
    public AuthenticateClient createAuthenticateClient(DiadocHttpClient httpClient) {
        return new OidcAuthenticateClient();
    }

    @Override
    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    @Override
    public AuthenticationType getAuthenticationType() {
        return AuthenticationType.OIDC;
    }

    public TokenProvider getTokenProvider() {
        return tokenProvider;
    }
}
