package Diadoc.Api.httpClient;

public class FileContent {
	private String fileName;
	private byte[] bytes;

	public FileContent(byte[] bytes, String fileName) {
		this.bytes = bytes;
		this.fileName = fileName;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public String getFileName() {
		return fileName;
	}
}
