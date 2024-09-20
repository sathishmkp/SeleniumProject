package admJavaAssessment;
import java.util.Arrays;

public class addEvenPositions {
	
	

		    public static void main(String[] args) {
		        int[] array = {5, 2, 7, 3, 9, 8}; // Example array, change it as needed

		        // Sort the array in descending order
		        Arrays.sort(array);
		        reverseArray(array);

		        // Calculate the sum of even positions
		        int sum = 0;
		        for (int i = 1; i < array.length; i += 2) {
		            sum += array[i];
		        }

		        // Print the sorted array and the sum
		        System.out.println("Sorted array in descending order: " + Arrays.toString(array));
		        System.out.println("Sum of elements at even positions: " + sum);
		    }


		    // Method to reverse the array
		    public static void reverseArray(int[] arr) {
		        int start = 0;
		        int end = arr.length - 1;
		        while (start < end) {
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;
		            start++;
		            end--;
		        }
		    }
		}

	


