package Diadoc.Api;

import java.io.IOException;

public class GeneratedFile
	{
		private String fileName;
		private byte[] content;

		GeneratedFile(String fileName, byte[] content)
		{
			this.fileName = fileName;
			this.content = content;
		}

		public void SaveContentToFile(String path) throws IOException
		{
			Tools.WriteAllBytes(path, getContent());
		}

		public String getFileName() { return fileName; }
		public byte[] getContent() { return content; }
	}