package Diadoc.Api.auth;

import Diadoc.Api.CertificateHelper;
import Diadoc.Api.Proto.LoginPasswordProtos;
import Diadoc.Api.crypt.TokenDecryptManager;
import Diadoc.Api.crypt.exceptions.CertificateNotFoundException;
import Diadoc.Api.crypt.exceptions.TokenDecryptException;
import Diadoc.Api.exceptions.DiadocSdkException;
import Diadoc.Api.helpers.Tools;
import Diadoc.Api.httpClient.DiadocHttpClient;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.jetbrains.annotations.Nullable;

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
       authenticate(login, password, null, null);
    }

    public void authenticate(String login, String password, @Nullable String key, @Nullable String id) throws DiadocSdkException {
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
            addServiceHeaders(request, key, id);

            var response = diadocHttpClient.performRequest(request);
            authManager.setCredentials(new String(response, UTF_8));
        } catch (IOException | URISyntaxException e) {
            throw new DiadocSdkException(e);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #authenticateAutoConfirm(X509Certificate, String, String, Boolean)}
     * or {@link #authenticate(X509Certificate, String, String)}
     */
    @Deprecated
    public void authenticate(X509Certificate currentCert, boolean autoConfirm) throws DiadocSdkException {
        if (autoConfirm) {
            authenticateAutoConfirm(currentCert, null, null, null);
        }
        else {
            authenticate(currentCert, null, null);
        }
    }

    public byte[] authenticateAutoConfirm(X509Certificate currentCert, @Nullable String key, @Nullable String id, @Nullable Boolean saveBinding) throws DiadocSdkException {
        try {
            authManager.clearCredentials();

            var request = RequestBuilder
                    .post(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(V_3_AUTHENTICATE)
                            .addParameter("type", "certificate")
                            .build())
                    .addHeader("Content-Type", "application/octet-stream")
                    .setEntity(new ByteArrayEntity(currentCert.getEncoded()));
            addServiceHeaders(request, key, id);
            var response = diadocHttpClient.performRequest(request);

            String token = getDecryptedToken(response, currentCert);
            confirmAuthenticationByCertificate(currentCert, token, saveBinding);

            return response;
        } catch (URISyntaxException | IOException | CertificateEncodingException | TokenDecryptException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    public byte[] authenticate(X509Certificate currentCert, @Nullable String key, @Nullable String id) throws DiadocSdkException {
        try {
            authManager.clearCredentials();

            var request = RequestBuilder
                    .post(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(V_3_AUTHENTICATE)
                            .addParameter("type", "certificate")
                            .build())
                    .addHeader("Content-Type", "application/octet-stream")
                    .setEntity(new ByteArrayEntity(currentCert.getEncoded()));
            addServiceHeaders(request, key, id);
            var response = diadocHttpClient.performRequest(request);

            return response;
        } catch (URISyntaxException | IOException | CertificateEncodingException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    public void authenticateByKey(String key, String id) throws DiadocSdkException {
        try {
            authManager.clearCredentials();

            var request = RequestBuilder
                    .post(new URIBuilder(diadocHttpClient.getBaseUrl())
                            .setPath(V_3_AUTHENTICATE)
                            .addParameter("type", "trust")
                            .build()
                    );
            addServiceHeaders(request, key, id);
            var response = diadocHttpClient.performRequest(request);
            authManager.setCredentials(new String(response, UTF_8));
        } catch (URISyntaxException | IOException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #authenticateAutoConfirm(X509Certificate, String, String, Boolean)}
     */
    @Deprecated
    public void authenticate(X509Certificate currentCert) throws DiadocSdkException {
        authenticateAutoConfirm(currentCert, null, null, null);
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #confirmAuthenticationByCertificate(X509Certificate, String, Boolean)}
     */
    @Deprecated
    public void confirmAuthenticationByCertificate(X509Certificate currentCert, String token) throws DiadocSdkException {
        confirmAuthenticationByCertificate(currentCert, token, null);
    }

    public void confirmAuthenticationByCertificate(X509Certificate currentCert, String token,@Nullable Boolean saveBinding) throws DiadocSdkException {
        try {
            var uri = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V3/AuthenticateConfirm")
                    .addParameter("token", token);
            Tools.addParameterIfNotNull(uri, "saveBinding", saveBinding);
            var request = RequestBuilder.post(uri.build()).setEntity(new ByteArrayEntity(currentCert.getEncoded()));
            var response = diadocHttpClient.performRequest(request);

            authManager.setCredentials(StringUtils.newStringUtf8(response));
        } catch (URISyntaxException | CertificateEncodingException | IOException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    public byte[] authenticate(String thumbprint, boolean autoConfirm,  @Nullable String key, @Nullable String id, @Nullable Boolean saveBinding) throws DiadocSdkException {
        try {
            var userCertificate = CertificateHelper.getCertificateByThumbprint(thumbprint);
            if (autoConfirm) {
                return authenticateAutoConfirm(userCertificate, key, id, saveBinding);
            }
            return authenticate(userCertificate, key, id);
        } catch (CertificateNotFoundException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    public void confirmAuthenticationByCertificateThumbprint(String thumbprint, String token, @Nullable Boolean saveBinding) throws DiadocSdkException {
        try {
            var uri = new URIBuilder(diadocHttpClient.getBaseUrl())
                    .setPath("/V3/AuthenticateConfirm")
                    .addParameter("token", token)
                    .addParameter("thumbprint", thumbprint);
            Tools.addParameterIfNotNull(uri, "saveBinding", saveBinding);
            var request = RequestBuilder.post(uri.build());
            var response = diadocHttpClient.performRequest(request);

            authManager.setCredentials(StringUtils.newStringUtf8(response));
        } catch (URISyntaxException | IOException ex) {
            throw new DiadocSdkException(ex);
        }
    }

    private String getDecryptedToken(byte[] encryptedToken, X509Certificate currentCert) throws TokenDecryptException {
        return StringUtils.newStringUtf8(Base64.encodeBase64(TokenDecryptManager.decryptToken(encryptedToken, currentCert)));
    }

    private void addServiceHeaders(RequestBuilder requestBuilder, @Nullable String key, @Nullable String id) {
        if (!Tools.isNullOrEmpty(key)) {
            requestBuilder.addHeader("X-Diadoc-ServiceKey", key);
            if (Tools.isNullOrEmpty(id))
                throw new IllegalArgumentException("id");
            requestBuilder.addHeader("X-Diadoc-ServiceUserId", id);
        }
    }

    /**
     * @deprecated Method is deprecated and is planned to delete
    * Information
     * <a href="https://developer.kontur.ru/docs/diadoc-api/http/removal/GetExternalServiceAuthInfo.html">link to getExternalServiceAuthInfo</a>
     */
    @Deprecated
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