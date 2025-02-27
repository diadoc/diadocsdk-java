package Diadoc.Api.crypt.exceptions;

public class CertificateNotFoundException extends Exception {
    public CertificateNotFoundException(String message) {
        super(message);
    }

    public CertificateNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}