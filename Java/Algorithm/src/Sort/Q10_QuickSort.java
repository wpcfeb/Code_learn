package Sort;

public class Q10_QuickSort {
	public int[] quickSort(int[] array) {
		// check null first
		if (array == null) {
			return array;
		}
		quickSort(array, 0, array.length - 1);	
		return array;
	}
	private void quickSort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		// define a pivot and use the pivot to partition the array.
		int pivotPos = partition(array, left, right);
		// pivot is already at its position, when we do the recursive call on
		// the two partitions, pivot should not be included in any of them.
		quickSort(array, left, pivotPos - 1);
		quickSort(array, pivotPos + 1, right);
	}
	private int partition(int[] array, int left, int right) {
		int pivotIndex = pivotIndex(left, right);
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, right);
		int leftBound = left;
		int rightBound = right - 1;
		while (leftBound <= rightBound) {
			if (array[leftBound] < pivot) {
				leftBound++;
			} else if (array[rightBound] >= pivot) {
				rightBound--;
			} else {
				swap(array, leftBound++, rightBound--);
			}
		}
		swap(array, leftBound, right);
		return leftBound;
	}
	
	private int pivotIndex(int left, int right) {
		return left + (int)(Math.random() * (right - left + 1));
	}
	private void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
