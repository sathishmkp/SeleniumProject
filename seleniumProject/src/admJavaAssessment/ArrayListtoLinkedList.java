package admJavaAssessment;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListtoLinkedList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList= new  ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		System.out.println(arrayList);
		
		
		LinkedList<Integer> integers = new LinkedList<Integer>(arrayList);
		
		for (Integer linkedList : integers) {
			
			System.out.print(" " + linkedList);
			
		}

	}

}
