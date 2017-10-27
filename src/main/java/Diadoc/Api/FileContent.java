package Diadoc.Api;

public class FileContent {
	private String fileName;
	private byte[] bytes;

	FileContent(byte[] bytes, String fileName) {
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
