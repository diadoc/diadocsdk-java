package Diadoc.Api.shelf;

public class PutPartResponse {
    private int statusCode;
    private String reason;
    private byte[] content;


    public PutPartResponse(int statusCode, String reason, byte[] content) {
        this.statusCode = statusCode;
        this.reason = reason;
        this.content = content;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getReason() {
        return reason;
    }

    public byte[] getContent() {
        return content;
    }
}
