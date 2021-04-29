package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
	
	public static int[] merge(int[] leftResult, int[] rightResult) {
		int[] result = new int[leftResult.length + rightResult.length];

		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		while (leftIndex < leftResult.length && rightIndex < rightResult.length) {
			if (leftResult[leftIndex] <= rightResult[rightIndex]) {
				result[resultIndex] = leftResult[leftIndex];
				leftIndex++;
			} else {
				result[resultIndex] = rightResult[rightIndex];
				rightIndex++;
			}
			resultIndex++;
		}
		while (leftIndex < leftResult.length) {
			result[resultIndex] = leftResult[leftIndex];
			resultIndex++;
			leftIndex++;
		}
		while (rightIndex < rightResult.length) {
			result[resultIndex] = rightResult[rightIndex];
			resultIndex++;
			rightIndex++;

		}
		return result;
	}
	
	public static int[] mergeSort(int[] array) {
		
		return mergeSort(array, 0, array.length - 1 ) ;
	}
	
	public static int[] mergeSort(int[] array, int left, int right) {
		//base case
		if(left == right) {
			return new int[] {array[left]};
		}
		//subproblem
		int mid = left + (right - left) / 2;
		int[] leftResult = mergeSort(array, left, mid);
		int[] rightResult = mergeSort(array, mid + 1, right);
		//recursion rule
		return merge(leftResult, rightResult);
		
	}
	

	public static void main(String[] args) {
		int[] array = {1, 3, 2, 5, 6, 1, 2, 11, 2};
		
		
		System.out.println(Arrays.toString(mergeSort(array)));
	}

}
