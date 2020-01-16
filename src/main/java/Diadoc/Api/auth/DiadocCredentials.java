package Diadoc.Api.auth;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.BasicUserPrincipal;
import org.apache.http.auth.Credentials;
import org.apache.http.util.LangUtils;
import org.jetbrains.annotations.Nullable;

import java.security.Principal;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class DiadocCredentials implements Credentials {

    private final BasicUserPrincipal principal;
    private final String authToken;

    /**
     * The constructor with the Diadoc API client ID.
     *
     * @param apiClientId the Diadoc API client ID
     */
    public DiadocCredentials(String apiClientId)
    {
        this(apiClientId, null);
    }

    /**
     * The constructor with the Diadoc API client ID and auth token arguments.
     *
     * @param apiClientId the Diadoc API client ID
     * @param authToken the Diadoc authorization token
     */
    public DiadocCredentials(String apiClientId, @Nullable String authToken) {
        super();
        if (apiClientId == null) {
            throw new IllegalArgumentException("ApiClientId may not be null");
        }
        this.principal = new BasicUserPrincipal(apiClientId);
        this.authToken = authToken;
    }

    public Principal getUserPrincipal() {
        return this.principal;
    }

    public String getApiClientId() {
        return this.principal.getName();
    }

    public String getAuthToken() {
        return this.authToken;
    }

    public String getPassword() {
        return null;
    }

    @Override
    public int hashCode() {
        return this.principal.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (o instanceof DiadocCredentials) {
            DiadocCredentials that = (DiadocCredentials) o;
            if (LangUtils.equals(this.principal, that.principal) && LangUtils.equals(this.authToken, that.authToken)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.principal.toString();
    }

}
