package Diadoc.Api;

public class PrintFormContent {
	private String contentType;
	private byte[] bytes;
	private String fileName;
	
	public PrintFormContent(String contentType, String fileName, byte[] bytes)
	{
		this.contentType = contentType;
		this.fileName = fileName;
		this.bytes = bytes;
	}
	
	public String getContentType() { return contentType; }
	public String getFileName() { return fileName; }
	public byte[] getBytes() { return bytes; }
	public void SaveToFile(String path) throws Exception
	{
		if (getBytes() == null) throw new Exception("There is no content to save");
		Tools.WriteAllBytes(path, getBytes());
	}
}
