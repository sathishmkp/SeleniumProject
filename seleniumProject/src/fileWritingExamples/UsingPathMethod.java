package fileWritingExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathMethod {

	public static void main(String[] args) throws IOException {
	

		String location = "PathMethod.txt";
		String content = "Love Your Self";
		
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
	}

}
