package fileWritingExamples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		String location = "BufferedWriter.txt";
		String content = "We are writing Java Program";
		
		FileWriter fileWriter = new FileWriter(location);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		fileWriter.write(content);
		writer.close();

	}

}
