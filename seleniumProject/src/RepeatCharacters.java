public class RepeatCharacters {
		
	
 
	        public static String repeatCharacters(String input) {
	            StringBuilder output = new StringBuilder();
	            for (int i = 0; i < input.length(); i++) {
	                char currentChar = input.charAt(i);
	               for (int j = 0; j <= i; j++) {
	                  output.append(currentChar);
	                }
	            }
	            return output.toString();
	        }

	   	 public static void main(String[] args) {
		        String input = "demo";
		        String output = repeatCharacters(input);
		        System.out.println("Output: " + output);
		        
		 }
		       
}