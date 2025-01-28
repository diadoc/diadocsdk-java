package Diadoc.Api.auth.oidc;

import java.util.Objects;

/**
 * Default implementation
 */
public class ContainerTokenProvider implements TokenProvider {

    private volatile String token;

    @Override
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContainerTokenProvider that = (ContainerTokenProvider) o;
        return Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(token);
    }

}
