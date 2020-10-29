package Diadoc.Api.print.models;

public class PrintFormResult {
    private int retryAfter;
    private PrintFormContent content;

    public PrintFormResult(PrintFormContent content) {
        this.content = content;
        this.retryAfter = 0;
    }

    public PrintFormResult(int retryAfter) {
        this.retryAfter = retryAfter;
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
}