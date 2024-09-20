package fileWritingExamples;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		
		String location = "FileReder.txt";
		String content = "This is file writing concept";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
		

	}

	
}
