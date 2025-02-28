package Diadoc.Api.print.models;

import org.jetbrains.annotations.Nullable;

public class PrintFormResult {
    private final int retryAfter;
    @Nullable
    private final PrintFormContent content;

    @Nullable
    private final String traceId;

    public PrintFormResult(PrintFormContent content) {
        this(0, content, null);
    }

    public PrintFormResult(int retryAfter) {
        this(retryAfter, null, null);
    }

    public PrintFormResult(int retryAfter, @Nullable PrintFormContent content, @Nullable String traceId) {
        this.retryAfter = retryAfter;
        this.content = content;
        this.traceId = traceId;
    }

    public boolean HasContent() {
        return content != null;
    }

    public PrintFormContent getContent() {
        return content;
    }

    public int getRetryAfter() {
        return retryAfter;
    }

    @Nullable
    public String getTraceId() {
        return traceId;
    }
}