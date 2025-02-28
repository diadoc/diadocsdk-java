package Diadoc.Api.print.models;

import Diadoc.Api.Proto.Documents.DocumentProtocolProtos;
import org.jetbrains.annotations.Nullable;

public class DocumentProtocolResult {
    private final int retryAfter;

    @Nullable
    private final DocumentProtocolProtos.DocumentProtocol documentProtocol;

    @Nullable
    private final String traceId;

    public DocumentProtocolResult(DocumentProtocolProtos.DocumentProtocol documentProtocol)
    {
        this.documentProtocol = documentProtocol;
        this.retryAfter = 0;
        this.traceId = null;
    }

    public DocumentProtocolResult(int retryAfter)
    {
        this.documentProtocol = null;
        this.retryAfter = retryAfter;
        this.traceId = null;
    }

    private DocumentProtocolResult(DocumentProtocolResultBuilder builder) {
        this.documentProtocol = builder.documentProtocol;
        this.retryAfter = builder.retryAfter;
        this.traceId = builder.traceId;
    }

    public static class DocumentProtocolResultBuilder {
        private DocumentProtocolProtos.DocumentProtocol documentProtocol;
        private int retryAfter = 0;
        private String traceId;

        public DocumentProtocolResultBuilder withDocumentProtocol(DocumentProtocolProtos.DocumentProtocol documentProtocol) {
            this.documentProtocol = documentProtocol;
            return this;
        }

        public DocumentProtocolResultBuilder withRetryAfter(int retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        public DocumentProtocolResultBuilder withTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DocumentProtocolResult build() {
            return new DocumentProtocolResult(this);
        }
    }

    public static DocumentProtocolResultBuilder builder() {
        return new DocumentProtocolResultBuilder();
    }

    public boolean hasContent() { return documentProtocol != null; }
    @Nullable
    public DocumentProtocolProtos.DocumentProtocol getDocumentProtocol() { return documentProtocol; }

    @Nullable
    public String getTraceId() {
        return traceId;
    }

    public int getRetryAfter() { return retryAfter; }
}
