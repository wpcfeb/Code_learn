package Sort;

public class Q9_MergeSort {
	public int[] mergeSort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}
		return mergeSort(array, 0, array.length - 1);
	}
	private int[] mergeSort(int[] array, int left, int right) {
		if (left == right) {
			return new int[] {array[right]};
		}
		int mid = left + (right - left) / 2;
		int[] leftResult = mergeSort(array, left, mid);
		int[] rightResult = mergeSort(array, mid + 1, right);
		return merge(leftResult, rightResult);
	}
	private int[] merge(int[] leftResult, int[] rightResult) {
		int[] result = new int[leftResult.length + rightResult.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		while (leftIndex < leftResult.length && rightIndex < rightResult.length) {
			if (leftResult[leftIndex] < rightResult[rightIndex]) {
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
			leftIndex++;
			resultIndex++;
		}
		while (rightIndex < rightResult.length) {
			result[resultIndex] = rightResult[rightIndex];
			rightIndex++;
			resultIndex++;
		}
		return result;
	}
}
