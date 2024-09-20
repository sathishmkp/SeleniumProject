package admJavaAssessment;
import java.util.HashMap;
import java.util.Map;
public class UniqueCharacter {

	

	    public static void main(String[] args) {
	        String str = "abracadabra"; // Example string, change it as needed

	        Map<Character, Integer> charCount = new HashMap<>();

	        // Count occurrences of each character in the string
	        for (char c : str.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        // Print unique characters
	        System.out.println("Unique characters in the string:");
	        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
	}


