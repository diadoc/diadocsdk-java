package Diadoc.Api.crypt.exceptions;

public class TokenDecryptException extends Exception {
    public TokenDecryptException(Exception ex) {
        super(ex);
    }
}
