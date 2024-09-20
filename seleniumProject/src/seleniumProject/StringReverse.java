package seleniumProject;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringReverse {
	
	public static void main(String[]args) {
		
		 ArrayList<Integer> arrList = new ArrayList<Integer>();
		 
		 arrList.add(1);
		 arrList.add(4);
		 arrList.add(23);
		 arrList.add(33);
		 System.out.println(arrList);
		 
		 LinkedList<Integer> linkList = new LinkedList<Integer>(arrList);
		 
		 
		 System.out.println("LinkList"+linkList);
		
		
		 
	}

}