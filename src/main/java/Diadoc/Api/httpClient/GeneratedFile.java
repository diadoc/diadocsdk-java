package Diadoc.Api.httpClient;

import Diadoc.Api.helpers.Tools;

import java.io.IOException;

public class GeneratedFile {
    private String fileName;
    private byte[] content;

    public GeneratedFile(String fileName, byte[] content) {
        this.fileName = fileName;
        this.content = content;
    }

    public void saveContentToFile(String path) throws IOException {
        Tools.WriteAllBytes(path, getContent());
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getContent() {
        return content;
    }
}