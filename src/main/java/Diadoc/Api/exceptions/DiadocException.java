package Diadoc.Api.exceptions;

import org.jetbrains.annotations.Nullable;

public class DiadocException extends Exception {
    private final int httpStatusCode;
    @Nullable
    private final String errorCode;
    @Nullable
    private final String traceId;

    public DiadocException(String message, int httpStatusCode, String errorCode) {
        this(message, httpStatusCode, errorCode, null);
    }

    public DiadocException(String message, int httpStatusCode) {
        this(message, httpStatusCode, null, null);
    }

    public DiadocException(String message, int httpStatusCode, @Nullable String errorCode, @Nullable String traceId) {
        super(message);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
        this.traceId = traceId;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    @Nullable
    public String getErrorCode() {
        return errorCode;
    }

    @Nullable
    public String getTraceId() {
        return traceId;
    }
}
