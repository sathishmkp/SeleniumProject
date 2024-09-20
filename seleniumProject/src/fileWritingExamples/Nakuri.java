package fileWritingExamples;

import java.util.Scanner;

public class Nakuri {

	
		
		    public static void main(String[] args) {
		    	 Scanner scanner = new Scanner(System.in);
		         System.out.print("Enter a string: ");
		         String input = scanner.nextLine();
		         
		         String output = repeatCharacters(input);
		         System.out.println("Output: " + output);
		     }
		     
		     public static String repeatCharacters(String input) {
		         StringBuilder result = new StringBuilder();
		         
		         for (int i = 0; i < input.length(); i++) {
		             char ch = input.charAt(i);
		             for (int j = 0; j <= i; j++) {
		                 result.append(ch);
		             }
		         }
		         
		         return result.toString();
		     }
		 }
		        	 
		         
		     
		

	


