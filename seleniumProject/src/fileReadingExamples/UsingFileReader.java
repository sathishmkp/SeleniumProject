package fileReadingExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		
		String location = "C:\\Users\\sathi\\OneDrive\\Desktop\\FileReaderconcept.txt";
		
		FileReader reader = new FileReader(location);
		BufferedReader contentReader = new BufferedReader(reader);
		String currentLine;
		while((currentLine=contentReader.readLine()) != null){
			System.out.println(currentLine);
			
		}
		
		
		contentReader.close();
	}

}
