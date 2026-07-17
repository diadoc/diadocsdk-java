package Diadoc.Api.auth.oidc;

import Diadoc.Api.ConnectionSettings;
import Diadoc.Api.exceptions.DiadocSdkException;
import org.apache.http.HttpHost;
import org.jetbrains.annotations.Nullable;

public class OidcRefreshTokenProvider implements TokenProvider {

    private static final long EXPIRATION_SAFETY_MARGIN_MILLIS = 60_000;

    private final String clientId;
    private final String clientSecret;
    private final String refreshToken;
    private final String oidcBaseUrl;
    private final HttpHost proxyHost;
    private final ConnectionSettings connectionSettings;

    private volatile String cachedAccessToken;
    private volatile long cachedAccessTokenExpiresAtMillis;

    public OidcRefreshTokenProvider(String clientId, String clientSecret, String refreshToken) {
        this(clientId, clientSecret, refreshToken, null, null, null);
    }

    public OidcRefreshTokenProvider(String clientId, String clientSecret, String refreshToken, @Nullable String oidcBaseUrl) {
        this(clientId, clientSecret, refreshToken, oidcBaseUrl, null, null);
    }

    public OidcRefreshTokenProvider(
            String clientId,
            String clientSecret,
            String refreshToken,
            @Nullable String oidcBaseUrl,
            @Nullable HttpHost proxyHost,
            @Nullable ConnectionSettings connectionSettings) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
        this.oidcBaseUrl = oidcBaseUrl;
        this.proxyHost = proxyHost;
        this.connectionSettings = connectionSettings;
    }

    @Override
    public String getToken() {
        if (isCachedTokenValid()) {
            return cachedAccessToken;
        }
        synchronized (this) {
            if (isCachedTokenValid()) {
                return cachedAccessToken;
            }
            return fetchAndCacheToken();
        }
    }

    public String refresh() {
        synchronized (this) {
            return fetchAndCacheToken();
        }
    }

    private boolean isCachedTokenValid() {
        return cachedAccessToken != null && System.currentTimeMillis() < cachedAccessTokenExpiresAtMillis;
    }

    private String fetchAndCacheToken() {
        try {
            OidcTokenResponse response = OidcAuthenticator.authenticateWithOidc(
                    clientId, clientSecret, refreshToken, oidcBaseUrl, proxyHost, connectionSettings);
            cachedAccessToken = response.getAccessToken();
            cachedAccessTokenExpiresAtMillis = System.currentTimeMillis()
                    + response.getExpiresIn() * 1000L
                    - EXPIRATION_SAFETY_MARGIN_MILLIS;
            return cachedAccessToken;
        } catch (DiadocSdkException e) {
            throw new OidcTokenRefreshException(e);
        }
    }
}