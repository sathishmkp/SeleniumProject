import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collectionexamp {

	public static void main(String[] args) {
		
		        // Original string with special characters
		        String str = "Ja@#$va#^#%#is@#^beau@%#%tiful*^&^%@$";
		        
		        // Convert the string to a List of characters
		        List<Character> charList = str.chars()  // Create an IntStream of characters
		                                      .mapToObj(c -> (char) c)  // Convert int to Character
		                                      .collect(Collectors.toList());  // Collect to List
		        
		        // Filter out special characters
		        List<Character> filteredCharList = charList.stream()
		                                                   .filter(c -> Character.isLetterOrDigit(c) || Character.isWhitespace(c))
		                                                   .collect(Collectors.toList());
		        
		        // Build the resulting string from the filtered characters
		        String cleanedStr = filteredCharList.stream()
		                                            .map(String::valueOf)  // Convert Character to String
		                                            .collect(Collectors.joining());  // Join the stream into a single string
		        
		        // Print the cleaned string
		        System.out.println("Original String: " + str);
		        System.out.println("Cleaned String: " + cleanedStr);
		    }
		


	}


