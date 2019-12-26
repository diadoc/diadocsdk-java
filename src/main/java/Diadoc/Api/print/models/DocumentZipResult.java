package Diadoc.Api.print.models;

import Diadoc.Api.Proto.Documents.DocumentZipProtos;

import static Diadoc.Api.Proto.Documents.DocumentZipProtos.*;

public class DocumentZipResult {
    private int retryAfter;
    private DocumentZipGenerationResult documentZip;

    public DocumentZipResult(DocumentZipGenerationResult documentZip)
    {
        this.documentZip = documentZip;
        this.retryAfter = 0;
    }

    public DocumentZipResult(int retryAfter)
    {
        this.retryAfter = retryAfter;
    }

    public boolean hasContent() { return documentZip != null; }
    public DocumentZipGenerationResult getDocumentZip() { return documentZip; }
    public int getRetryAfter() { return retryAfter; }
}
