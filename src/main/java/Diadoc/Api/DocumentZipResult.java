package Diadoc.Api;

import Diadoc.Api.Proto.Documents.DocumentZipProtos;

public class DocumentZipResult {
    private int retryAfter;
    private DocumentZipProtos.DocumentZipGenerationResult documentZip;

    public DocumentZipResult(DocumentZipProtos.DocumentZipGenerationResult documentZip)
    {
        this.documentZip = documentZip;
        this.retryAfter = 0;
    }

    public DocumentZipResult(int retryAfter)
    {
        this.retryAfter = retryAfter;
    }

    public boolean hasContent() { return documentZip != null; }
    public DocumentZipProtos.DocumentZipGenerationResult getDocumentZip() { return documentZip; }
    public int getRetryAfter() { return retryAfter; }
}
