package Diadoc.Api.exceptions;

import org.jetbrains.annotations.Nullable;

public class DiadocException extends Exception {
    private int httpStatusCode;
    private String errorCode;

    public DiadocException(String message, int httpStatusCode, String errorCode) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
    }

    public DiadocException(String message, int httpStatusCode) {
        super(message);
        this.httpStatusCode = httpStatusCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    @Nullable
    public String getErrorCode() {
        return errorCode;
    }
}
