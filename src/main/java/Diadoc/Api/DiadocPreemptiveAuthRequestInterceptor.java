package Diadoc.Api;

import java.io.IOException;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

public class DiadocPreemptiveAuthRequestInterceptor implements HttpRequestInterceptor {

    public void process(final HttpRequest request, final HttpContext context) throws HttpException, IOException {
        AuthState authState = (AuthState) context.getAttribute(ClientContext.TARGET_AUTH_STATE);
        // If no auth scheme has been initialized yet
        if (authState.getAuthScheme() == null) {
            CredentialsProvider credentialsProvider = (CredentialsProvider) context.getAttribute(ClientContext.CREDS_PROVIDER);
            HttpHost targetHost = (HttpHost) context.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
            AuthScope authScope = new AuthScope(targetHost.getHostName(), targetHost.getPort());
            // Obtain credentials matching the target host
            Credentials credentials = credentialsProvider.getCredentials(authScope);
            // If found, generate BasicScheme preemptively
            if (credentials != null) {
                authState.setAuthScheme(new DiadocAuthScheme());
                authState.setCredentials(credentials);
            }
        }
    }
}
