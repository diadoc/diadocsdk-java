package Diadoc.Api.auth.oidc;

import Diadoc.Api.exceptions.DiadocSdkException;

public class OidcRefreshTokenProvider implements TokenProvider {

    private final String clientId;
    private final String clientSecret;
    private final String refreshToken;
    private final String oidcBaseUrl;

    private volatile String cachedAccessToken;

    public OidcRefreshTokenProvider(String clientId, String clientSecret, String refreshToken) {
        this(clientId, clientSecret, refreshToken, null);
    }

    public OidcRefreshTokenProvider(String clientId, String clientSecret, String refreshToken, String oidcBaseUrl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.oidcBaseUrl = oidcBaseUrl;
    }

    @Override
    public String getToken() {
        String token = cachedAccessToken;
        if (token != null) {
            return token;
        }
        synchronized (this) {
            token = cachedAccessToken;
            if (token != null) {
                return token;
            }
            return fetchAndCacheToken();
        }
    }

    public String refresh() {
        synchronized (this) {
            return fetchAndCacheToken();
        }
    }

    private String fetchAndCacheToken() {
        try {
            String token = oidcBaseUrl == null
                    ? OidcAuthenticator.authenticateWithOidc(clientId, clientSecret, refreshToken)
                    : OidcAuthenticator.authenticateWithOidc(clientId, clientSecret, refreshToken, oidcBaseUrl);
            cachedAccessToken = token;
            return token;
        } catch (DiadocSdkException e) {
            throw new OidcTokenRefreshException(e);
        }
    }
}