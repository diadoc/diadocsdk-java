package Diadoc.Api.auth;

import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.CredentialsProvider;

/**
 * A temporary fallback authentication manager to maintain backward compatibility.
 *
 * <p>This class serves as a stub implementation of {@link AuthManager} when migrating
 * authentication mechanisms (e.g., from API key-based authentication to OIDC authentication).
 * It does not support authentication operations and will throw {@link UnsupportedOperationException}
 * when any method is invoked.</p>
 *
 * <p>Usage of this class should be temporary and replaced with a proper authentication mechanism.</p>
 */
public class FallbackAuthManager extends AuthManager {
    public FallbackAuthManager() {
        super("EMPTY");
    }

    @Override
    public AuthenticateClient createAuthenticateClient(DiadocHttpClient httpClient) {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication manager operations for OIDC authentication.");
    }

    @Override
    public CredentialsProvider getCredentialsProvider() {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication manager operations for OIDC authentication.");
    }

    @Override
    public AuthenticationType getAuthenticationType() {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication manager operations for OIDC authentication.");
    }

    @Override
    public boolean isAuthenticated() {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication manager operations for OIDC authentication.");
    }

    @Override
    public void setCredentials(String authToken) {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication manager operations for OIDC authentication.");
    }

    @Override
    public void clearCredentials() {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication manager operations for OIDC authentication.");
    }
}