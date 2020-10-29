package Diadoc.Api.print.models;

import Diadoc.Api.helpers.Tools;

import java.io.IOException;

public class PrintFormContent {
    private String contentType;
    private byte[] bytes;
    private String fileName;

    public PrintFormContent(String contentType, String fileName, byte[] bytes) {
        this.contentType = contentType;
        this.fileName = fileName;
        this.bytes = bytes;
    }

    public String getContentType() {
        return contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void saveToFile(String path) throws IOException {
        Tools.WriteAllBytes(path, getBytes());
    }
}
