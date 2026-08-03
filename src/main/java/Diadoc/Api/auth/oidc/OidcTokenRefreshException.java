package Diadoc.Api.auth.oidc;

public class OidcTokenRefreshException extends RuntimeException {

    public OidcTokenRefreshException(Throwable cause) {
        super("Can't get access-token by refresh-token", cause);
    }
}