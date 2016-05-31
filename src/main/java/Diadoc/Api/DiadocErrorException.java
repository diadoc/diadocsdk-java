package Diadoc.Api;

import java.io.IOException;

public class DiadocErrorException extends IOException {
    private int httpStatusCode;
    private String errorCode;

    public DiadocErrorException(String message, int httpStatusCode, String errorCode) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
