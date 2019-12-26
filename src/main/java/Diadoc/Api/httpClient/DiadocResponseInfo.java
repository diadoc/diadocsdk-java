package Diadoc.Api.httpClient;

import org.jetbrains.annotations.Nullable;

public class DiadocResponseInfo {
    @Nullable
    private byte[] content;
    @Nullable
    private Integer retryAfter;

    private int statusCode;

    @Nullable
    private String reason;

    @Nullable
    private String fileName;

    @Nullable
    private String contentType;

    public DiadocResponseInfo(
            @Nullable byte[] content,
            @Nullable Integer retryAfter,
            int statusCode,
            @Nullable String reason,
            @Nullable String fileName,
            @Nullable String contentType) {
        this.content = content;
        this.retryAfter = retryAfter;
        this.statusCode = statusCode;
        this.reason = reason;
        this.fileName = fileName;
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    @Nullable
    public byte[] getContent() {
        return content;
    }

    @Nullable
    public Integer getRetryAfter() {
        return retryAfter;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Nullable
    public String getReason() {
        return reason;
    }

    public String getContentType() {
        return contentType;
    }

    public static DiadocResponseInfo success(byte[] content, int statusCode) {
        return new DiadocResponseInfo(content, null, statusCode, null, null, null);
    }

    public static DiadocResponseInfo file(byte[] content, int statusCode, String fileName, String contentType){
        return new DiadocResponseInfo(content, null, statusCode, null, fileName, contentType);
    }

    public static DiadocResponseInfo fail(int statusCode, String reason, @Nullable Integer retryAfter) {
        return new DiadocResponseInfo(null, retryAfter, statusCode, reason, null, null);
    }


}
