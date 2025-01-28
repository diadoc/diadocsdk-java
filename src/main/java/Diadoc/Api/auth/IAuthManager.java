package Diadoc.Api.auth;

import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.http.client.CredentialsProvider;

public interface IAuthManager {

    AuthenticateClient createAuthenticateClient(DiadocHttpClient httpClient);

    CredentialsProvider getCredentialsProvider();

    AuthenticationType getAuthenticationType();
}
