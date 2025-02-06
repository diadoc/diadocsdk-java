package Diadoc.Api.auth.oidc;

import Diadoc.Api.helpers.Tools;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.impl.auth.RFC2617Scheme;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;


@Contract()
public class OidcAuthScheme extends RFC2617Scheme {

    private volatile boolean complete;

    /**
     * Default constructor for the Diadoc authentication scheme.
     */
    public OidcAuthScheme() {
        super();
    }


    /**
     * Returns textual designation of the OIDC authentication scheme.
     *
     * @return <code>OIDC</code>
     */
    @Override
    public String getSchemeName() {
        return "OIDC";
    }

    /**
     * Processes the challenge.
     *
     * @param header the challenge header
     * @throws org.apache.http.auth.MalformedChallengeException
     *          is thrown if the authentication challenge
     *          is malformed
     */
    @Override
    public void processChallenge(final Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        complete = true;
    }

    /**
     * Returns <tt>false</tt>. OIDC authentication scheme is request based.
     *
     * @return <tt>false</tt>.
     */
    @Override
    public boolean isConnectionBased() {
        return false;
    }

    /**
     * Tests if the authentication process has been completed.
     *
     * @return <tt>true</tt> if authorization has been processed,
     *         <tt>false</tt> otherwise.
     */
    @Override
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * Produces standart authorization header for the given set of {@link org.apache.http.auth.Credentials}.
     *
     * @param credentials The set of credentials to be used for authentication; must be of type DiadocOidcCredentials
     * @param request     The request being authenticated
     * @return a OIDC authorization string
     * @throws org.apache.http.auth.AuthenticationException
     *                                     if authorization string cannot
     *                                     be generated due to an authentication failure
     */
    @Override
    public Header authenticate(Credentials credentials, HttpRequest request) throws AuthenticationException {
        if (credentials == null) {
            throw new AuthenticationException("Credentials may not be null");
        }
        if (!(credentials instanceof DiadocOidcCredentials)) {
            throw new AuthenticationException("Credentials must be of type DiadocOidcCredentials");
        }
        if (request == null) {
            throw new AuthenticationException("HTTP request may not be null");
        }

        return authenticate((DiadocOidcCredentials) credentials);
    }

    /**
     * Returns a Diadoc <tt>Authorization</tt> header value for the given
     * {@link DiadocOidcCredentials}.
     *
     * @param credentials The credentials to encode.
     * @return a Diadoc authorization header
     */
    private Header authenticate(final DiadocOidcCredentials credentials) throws AuthenticationException {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }

        String bearerToken = credentials.getTokenProvider().getToken();
        if (Tools.isNullOrEmpty(bearerToken)) {
            throw new AuthenticationException("Bearer token may not be null or empty");
        }

        String prefix = ": Bearer ";
        int capacity = AUTH.WWW_AUTH_RESP.length() + prefix.length() + bearerToken.length();

        CharArrayBuffer buffer = new CharArrayBuffer(capacity);
        buffer.append(AUTH.WWW_AUTH_RESP);
        buffer.append(prefix);
        buffer.append(bearerToken);

        return new BufferedHeader(buffer);
    }
}

