package fileWritingExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		
		String location = "FileOutputStream.txt";
		String content = "Beleive in Your Self";
		
		FileOutputStream outputStream = new FileOutputStream(location);
        byte[] writingContent =    content.getBytes();
        outputStream.write(writingContent);
        outputStream.close();
    
	}

	
}
