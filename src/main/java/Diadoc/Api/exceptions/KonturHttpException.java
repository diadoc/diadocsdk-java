package Diadoc.Api.exceptions;

import org.apache.http.client.HttpResponseException;
import org.jetbrains.annotations.Nullable;

public class KonturHttpException extends HttpResponseException {
    @Nullable
    private final String traceId;
    private final String responseBody;

    public KonturHttpException(int statusCode, String responseBody, @Nullable String traceId) {
        super(statusCode, buildMessage(statusCode, responseBody, traceId));
        this.responseBody = responseBody;
        this.traceId = traceId;
    }

    private static String buildMessage(int statusCode, String responseBody, String traceId) {
        return String.format("HTTP %d: %s (TraceId: %s)",
                statusCode,
                responseBody != null ? responseBody : "",
                traceId != null ? traceId : ""
        );
    }

    public String getResponseBody() {
        return responseBody;
    }

    @Nullable
    public String getTraceId() {
        return traceId;
    }
}
