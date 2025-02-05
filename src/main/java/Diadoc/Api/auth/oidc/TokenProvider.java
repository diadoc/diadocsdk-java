package Diadoc.Api.auth.oidc;

/**
 * This interface is expected to have a thread-safe implementation.
 * Implementations must ensure safe concurrent access when retrieving tokens.
 */
public interface TokenProvider {
    String getToken();
}
