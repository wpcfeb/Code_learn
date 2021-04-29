package Sort;

import java.util.*;
import java.util.Random;

public class TestQuickSort {
	public static void main(String[] args) {
		int[] array = {1, 6, 1, 3, 8, 22};
		quickSort(array);
		System.out.println(Arrays.toString(array));
		
	}
	private static void quickSort(int[] array) {
		//corner case
		if(array == null || array.length <= 1) {
			return;
		}
		
		quickSort(array, 0, array.length - 1);
	}
	private static void quickSort(int[] array, int left, int right) {
		//base case
		if(left >= right) {
			return;
		}
		//subproblem
		Random rand = new Random();
		int pivotIndex = left + rand.nextInt(right - left + 1);
		swap(array, pivotIndex, right);
		
		int i = left, j = right - 1;
		while(i <= j) {
			if(array[i] < array[right]) {
				i++;
			}else {
				swap(array, i, j);
				j--;
			}
		}
		swap(array, i, right);
		
		quickSort(array, left, i - 1);
		quickSort(array, i + 1, right);
		
	}
	

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
