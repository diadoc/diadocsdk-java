package Diadoc.Api.auth;

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
public class DiadocAuthScheme extends RFC2617Scheme {

    private volatile boolean complete;

    /**
     * Default constructor for the Diadoc authentication scheme.
     */
    public DiadocAuthScheme() {
        super();
        this.complete = false;
    }

    /**
     * Returns textual designation of the Diadoc authentication scheme.
     *
     * @return <code>Diadoc</code>
     */
    public String getSchemeName() {
        return "Diadoc";
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
        this.complete = true;
    }

    /**
     * Tests if the authentication process has been completed.
     *
     * @return <tt>true</tt> if authorization has been processed,
     *         <tt>false</tt> otherwise.
     */
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * Returns <tt>false</tt>. Diadoc authentication scheme is request based.
     *
     * @return <tt>false</tt>.
     */
    public boolean isConnectionBased() {
        return false;
    }

    /**
     * Produces Diadoc authorization header for the given set of {@link org.apache.http.auth.Credentials}.
     *
     * @param credentials The set of credentials to be used for authentication; must be of type DiadocCredentials
     * @param request     The request being authenticated
     * @return a Diadoc authorization string
     * @throws org.apache.http.auth.AuthenticationException
     *                                     if authorization string cannot
     *                                     be generated due to an authentication failure
     */
    public Header authenticate(
            final Credentials credentials,
            final HttpRequest request) throws AuthenticationException {

        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }
        if (!(credentials instanceof DiadocCredentials)) {
            throw new IllegalArgumentException("Credentials must be of type DiadocCredentials");
        }
        if (request == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }

        return authenticate((DiadocCredentials) credentials);
    }

    /**
     * Returns a Diadoc <tt>Authorization</tt> header value for the given
     * {@link DiadocCredentials}.
     *
     * @param credentials The credentials to encode.
     * @return a Diadoc authorization header
     */
    public static Header authenticate(final DiadocCredentials credentials) {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("ddauth_api_client_id=");
        sb.append(credentials.getApiClientId());
        if (credentials.getAuthToken() != null) {
            sb.append(",ddauth_token=");
            sb.append(credentials.getAuthToken());
        }

        CharArrayBuffer buffer = new CharArrayBuffer(128);
        buffer.append(AUTH.WWW_AUTH_RESP);
        buffer.append(": DiadocAuth ");
        buffer.append(sb.toString());

        return new BufferedHeader(buffer);
    }

}