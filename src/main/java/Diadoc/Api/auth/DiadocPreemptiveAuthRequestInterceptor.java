package Diadoc.Api.auth;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;

public class DiadocPreemptiveAuthRequestInterceptor implements HttpRequestInterceptor {

    public void process(final HttpRequest request, final HttpContext context) {
        AuthState authState = (AuthState) context.getAttribute(HttpClientContext.TARGET_AUTH_STATE);
        // If no auth scheme has been initialized yet
        if (authState.getAuthScheme() == null) {
            CredentialsProvider credentialsProvider = (CredentialsProvider) context.getAttribute(HttpClientContext.CREDS_PROVIDER);
            HttpHost targetHost = (HttpHost) context.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
            AuthScope authScope = new AuthScope(targetHost.getHostName(), targetHost.getPort());
            // Obtain credentials matching the target host
            Credentials credentials = credentialsProvider.getCredentials(authScope);
            // If found, generate BasicScheme preemptively
            if (credentials != null) {
                authState.update(new DiadocAuthScheme(), credentials);
            }
        }
    }
}
