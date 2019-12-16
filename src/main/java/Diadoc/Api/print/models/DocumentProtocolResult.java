package Diadoc.Api.print.models;

import Diadoc.Api.Proto.Documents.DocumentProtocolProtos;

public class DocumentProtocolResult {
    private int retryAfter;
    private DocumentProtocolProtos.DocumentProtocol documentProtocol;

    public DocumentProtocolResult(DocumentProtocolProtos.DocumentProtocol documentProtocol)
    {
        this.documentProtocol = documentProtocol;
        this.retryAfter = 0;
    }

    public DocumentProtocolResult(int retryAfter)
    {
        this.retryAfter = retryAfter;
    }

    public boolean hasContent() { return documentProtocol != null; }
    public DocumentProtocolProtos.DocumentProtocol getDocumentProtocol() { return documentProtocol; }
    public int getRetryAfter() { return retryAfter; }
}
