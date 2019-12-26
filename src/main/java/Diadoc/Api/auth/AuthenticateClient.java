package Diadoc.Api.auth;

import Diadoc.Api.Proto.LoginPasswordProtos;
import Diadoc.Api.crypt.TokenDecryptManager;
import Diadoc.Api.crypt.exceptions.TokenDecryptException;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

import static Diadoc.Api.Proto.ExternalServiceAuthInfoProtos.*;
import static java.nio.charset.StandardCharsets.*;

public class AuthenticateClient {
    private static final String V_3_AUTHENTICATE = "/V3/Authenticate";
    private AuthManager authManager;
    private DiadocHttpClient diadocHttpClient;

    public AuthenticateClient(AuthManager authManager, DiadocHttpClient diadocHttpClient) {
        this.authManager = authManager;
        this.diadocHttpClient = diadocHttpClient;
    }

    public void authenticate(String sid) throws DiadocSdkException {
        try {
            authManager.clearCredentials();
            var request = RequestBuilder
                    .post(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(V_3_AUTHENTICATE)
                            .addParameter("type", "sid")
                            .build())
                    .addHeader("Content-Type", "text/plain")
                    .setEntity(new ByteArrayEntity(sid.getBytes()));

            var response = diadocHttpClient.performRequest(request);
            authManager.setCredentials(new String(response, UTF_8));
        } catch (URISyntaxException | IOException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    public void authenticate(String login, String password) throws DiadocSdkException {
        try {
            authManager.clearCredentials();

            var request = RequestBuilder
                    .post(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(V_3_AUTHENTICATE)
                            .addParameter("type", "password")
                            .build())
                    .setEntity(new ByteArrayEntity(
                            LoginPasswordProtos.LoginPassword
                                    .newBuilder()
                                    .setLogin(login)
                                    .setPassword(password)
                                    .build()
                                    .toByteArray()));

            var response = diadocHttpClient.performRequest(request);
            authManager.setCredentials(new String(response, UTF_8));
        } catch (IOException | URISyntaxException e) {
            throw new DiadocSdkException(e);
        }

    }

    public void authenticate(X509Certificate currentCert, boolean autoConfirm) throws DiadocSdkException {
        try {
            authManager.clearCredentials();

            var request = RequestBuilder
                    .post(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(V_3_AUTHENTICATE)
                            .addParameter("type", "certificate")
                            .build())
                    .addHeader("Content-Type", "application/octet-stream")
                    .setEntity(new ByteArrayEntity(currentCert.getEncoded()));

            var response = diadocHttpClient.performRequest(request);

            if (autoConfirm) {
                String token = getDecryptedToken(response, currentCert);
                confirmAuthenticationByCertificate(currentCert, token);
            }
        } catch (URISyntaxException | IOException | CertificateEncodingException | TokenDecryptException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    public void authenticate(X509Certificate currentCert) throws DiadocSdkException {
        authenticate(currentCert, true);
    }

    public void confirmAuthenticationByCertificate(X509Certificate currentCert, String token) throws DiadocSdkException {
        try {
            var request = RequestBuilder.post(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/V3/AuthenticateConfirm")
                            .addParameter("token", token)
                            .build())
                    .setEntity(new ByteArrayEntity(currentCert.getEncoded()));

            var response = diadocHttpClient.performRequest(request);

            authManager.setCredentials(StringUtils.newStringUtf8(response));
        } catch (URISyntaxException | CertificateEncodingException | IOException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    private String getDecryptedToken(byte[] encryptedToken, X509Certificate currentCert) throws TokenDecryptException {
        return StringUtils.newStringUtf8(Base64.encodeBase64(TokenDecryptManager.decryptToken(encryptedToken, currentCert)));
    }

    public ExternalServiceAuthInfo getExternalServiceAuthInfo(String key) throws DiadocSdkException {
        if (key == null) {
            throw new IllegalArgumentException("key");
        }
        try {
            var request = RequestBuilder.get(
                    new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath("/GetExternalServiceAuthInfo")
                            .addParameter("key", key)
                            .build());
            var response = diadocHttpClient.performRequest(request);
            return ExternalServiceAuthInfo.parseFrom(response);
        } catch (URISyntaxException | IOException ex) {
            throw new DiadocSdkException(ex);
        }
    }
}
