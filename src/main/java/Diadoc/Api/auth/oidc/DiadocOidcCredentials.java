package Diadoc.Api.auth.oidc;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.BasicUserPrincipal;
import org.apache.http.auth.Credentials;

import java.security.Principal;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class DiadocOidcCredentials implements Credentials {

    private final TokenProvider tokenProvider;
    private final Principal userPrincipal;

    public DiadocOidcCredentials(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
        this.userPrincipal = new BasicUserPrincipal("DefaultUser");
    }


    public TokenProvider getTokenProvider() {
        return tokenProvider;
    }

    @Override
    public Principal getUserPrincipal() {
        return userPrincipal;
    }

    @Override
    public String getPassword() {
        return "";
    }
}
