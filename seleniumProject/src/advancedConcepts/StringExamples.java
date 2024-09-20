package advancedConcepts;

public class StringExamples {
	
	static String name="Sathish";
   static int givenNumber = 5;
	
	public static void main(String[] args) {
		char position = name.charAt(3);
	    System.out.println(position);	
		
	    System.out.println(name.equals("Arul"));
	    
	    System.out.println(name.contains("a"));
	    
	    System.out.println(name.concat(" Kumar"));
	    
	    System.out.println(name.replace("at", "sat"));
	    
	    System.out.println(name.substring(4));
	    
	    System.out.println(name.substring(1, 3));
	    
	    System.out.println(name.indexOf("h"));
	    
	    System.out.println(name.indexOf("t", 5));
	    
	    System.out.println(name.trim());
	    
	    System.out.println(name.toLowerCase());
	    
	    System.out.println(String.join("-", "India","Aus","USA"));
	    
	    System.out.println();
	    
	    String given = "am i joke to you";
	    String[] split = given.split(" ");
	    
	    for (String string : split) {
	    	
	    	System.out.println(string);
			
		}
	    
	    
	    
	    

	}

}
