package Sort;

import java.util.Arrays;

public class SelectionSort {
	
	 public static int[] solve(int[] array) {
		   // Write your solution here
		 int i = 0;
		 for(; i < array.length - 1 ; i++) {
			 int minIndex = i;
			 for(int j = i + 1; j < array.length; j++ ) {
				 if(array[minIndex] > array[j]) {
					 minIndex = j;
				 }
			 }
			 swap(array, i, minIndex);
		 }
		 
		 return array;
		 }
	 
	 public static void swap(int[] array, int i, int j) {
		 int temp = array[j];
		 array[j] = array[i];
		 array[i] = temp;
		 return;
	 }

	public static void main(String[] args) {
		int[] array = {2, 3, 6, 1, 3, 2};
		System.out.println(Arrays.toString(solve(array)));
		
	}

}
