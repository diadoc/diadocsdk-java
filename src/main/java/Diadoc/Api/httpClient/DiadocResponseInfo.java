package Diadoc.Api.httpClient;

import org.jetbrains.annotations.Nullable;

public class DiadocResponseInfo {
    @Nullable
    private final byte[] content;
    @Nullable
    private final Integer retryAfter;

    private final int statusCode;

    @Nullable
    private final String reason;

    @Nullable
    private final String fileName;

    @Nullable
    private final String contentType;

    @Nullable
    private final String traceId;

    public DiadocResponseInfo(
            @Nullable byte[] content,
            @Nullable Integer retryAfter,
            int statusCode,
            @Nullable String reason,
            @Nullable String fileName,
            @Nullable String contentType) {
        this(new DiadocResponseInfoBuilder()
                .content(content)
                .retryAfter(retryAfter)
                .statusCode(statusCode)
                .reason(reason)
                .fileName(fileName)
                .contentType(contentType)
        );
    }

    public DiadocResponseInfo(DiadocResponseInfoBuilder builder) {
        this.content = builder.content;
        this.retryAfter = builder.retryAfter;
        this.statusCode = builder.statusCode;
        this.reason = builder.reason;
        this.fileName = builder.fileName;
        this.contentType = builder.contentType;
        this.traceId = builder.traceId;
    }

    public static class DiadocResponseInfoBuilder {
        private byte[] content;
        private Integer retryAfter;
        private int statusCode;
        private String reason;
        private String fileName;
        private String contentType;
        private String traceId;

        public DiadocResponseInfoBuilder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public DiadocResponseInfoBuilder content(@Nullable byte[] content) {
            this.content = content;
            return this;
        }

        public DiadocResponseInfoBuilder retryAfter(@Nullable Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        public DiadocResponseInfoBuilder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public DiadocResponseInfoBuilder fileName(@Nullable String fileName) {
            this.fileName = fileName;
            return this;
        }

        public DiadocResponseInfoBuilder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public DiadocResponseInfoBuilder traceId(@Nullable String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DiadocResponseInfo build() {
            return new DiadocResponseInfo(this);
        }
    }
    
    @Nullable
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

    @Nullable
    public String getContentType() {
        return contentType;
    }

    @Nullable
    public String getTraceId() {
        return traceId;
    }

    public static DiadocResponseInfo success(byte[] content, int statusCode) {
        return new DiadocResponseInfo(content, null, statusCode, null, null, null);
    }

    public static DiadocResponseInfo file(byte[] content, int statusCode, String fileName, String contentType){
        return new DiadocResponseInfo(content, null, statusCode, null, fileName, contentType);
    }

    /**
     * @deprecated Method is deprecated
     * Use {@link #fail(int, String, Integer, String)}
     * 
     */
    @Deprecated
    public static DiadocResponseInfo fail(int statusCode, String reason, @Nullable Integer retryAfter) {
        return new DiadocResponseInfo.DiadocResponseInfoBuilder()
                .statusCode(statusCode)
                .reason(reason)
                .retryAfter(retryAfter)
                .build();
    }

    public static DiadocResponseInfo fail(int statusCode, String reason, @Nullable Integer retryAfter, @Nullable String traceId) {
        return new DiadocResponseInfo.DiadocResponseInfoBuilder()
                .statusCode(statusCode)
                .reason(reason)
                .retryAfter(retryAfter)
                .traceId(traceId)
                .build();
    }

}
