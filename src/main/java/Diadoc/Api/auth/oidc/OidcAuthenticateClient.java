package Diadoc.Api.auth.oidc;

import Diadoc.Api.Proto.ExternalServiceAuthInfoProtos;
import Diadoc.Api.auth.AuthenticateClient;
import Diadoc.Api.exceptions.DiadocSdkException;

import java.security.cert.X509Certificate;

public class OidcAuthenticateClient extends AuthenticateClient {

    public OidcAuthenticateClient() {
        super(null, null);
    }

    @Override
    public void authenticate(String sid) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public void authenticate(String login, String password) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public void authenticate(X509Certificate currentCert, boolean autoConfirm) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public String authenticateWithoutAutoConfirm(X509Certificate currentCert) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public String authenticateWithoutAutoConfirm(String thumbprint) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public void authenticateByThumbprint(String thumbprint) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public void confirmAuthenticationByCertificateThumbprint(String thumbprint, String token) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public void authenticate(X509Certificate currentCert) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public void confirmAuthenticationByCertificate(X509Certificate currentCert, String token) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

    @Override
    public ExternalServiceAuthInfoProtos.ExternalServiceAuthInfo getExternalServiceAuthInfo(String key) throws DiadocSdkException {
        throw new UnsupportedOperationException("Cannot determine Diadoc authentication operations for OIDC authentication.");
    }

}
