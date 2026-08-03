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
    private final Object tokenRefreshLock = new Object();

    private volatile CachedToken cachedToken;

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
        CachedToken token = cachedToken;
        if (isValid(token)) {
            return token.accessToken();
        }
        synchronized (tokenRefreshLock) {
            token = cachedToken;
            if (isValid(token)) {
                return token.accessToken();
            }
            return fetchAndCacheToken();
        }
    }

    public String refresh() {
        synchronized (tokenRefreshLock) {
            return fetchAndCacheToken();
        }
    }

    private static boolean isValid(@Nullable CachedToken token) {
        return token != null && System.currentTimeMillis() < token.expiresAtMillis();
    }

    private String fetchAndCacheToken() {
        try {
            OidcTokenResponse response = OidcAuthenticator.authenticateWithOidc(
                    clientId, clientSecret, refreshToken, oidcBaseUrl, proxyHost, connectionSettings);
            long expiresAtMillis = System.currentTimeMillis()
                    + response.getExpiresIn() * 1000L
                    - EXPIRATION_SAFETY_MARGIN_MILLIS;
            CachedToken token = new CachedToken(response.getAccessToken(), expiresAtMillis);
            cachedToken = token;
            return token.accessToken();
        } catch (DiadocSdkException e) {
            throw new OidcTokenRefreshException(e);
        }
    }

    private static final class CachedToken {
        private final String accessToken;
        private final long expiresAtMillis;

        private CachedToken(String accessToken, long expiresAtMillis) {
            this.accessToken = accessToken;
            this.expiresAtMillis = expiresAtMillis;
        }

        private String accessToken() {
            return accessToken;
        }

        private long expiresAtMillis() {
            return expiresAtMillis;
        }
    }
}