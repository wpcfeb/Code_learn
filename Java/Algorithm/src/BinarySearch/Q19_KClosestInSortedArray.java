package BinarySearch;

public class Q19_KClosestInSortedArray {
	public int[] kClosest(int[] array, int target, int k) {
		if (array == null || array.length == 0) {
			return array;
		}
		if (k == 0) {
			return new int[0];
		}
		// left is the index of the largest smaller or equal element,
		// right = left + 1.
		// There two should be the closest to target
		int left = largestSmallerEqual(array, target);
		int right = left + 1;
		int[] result = new int[k];
		// this is a typical merge operation
		for (int i = 0; i < k; i++) {
			// we can advance the left pointer when:
			// 1. right pointer is already out of bound.
			// 2. right pointer is not out of bound, left pointer is not out of bound,
			//    and array[left] is closer to target. 
			if (right >= array.length || left >= 0 && target - array[left] <= array[right] -  target) {
				// target - array[left] <= array[right]
				// since the question requires that if there is a tie, the smaller elements are always prefered.
				result[i] = array[left--];
			} else {
				result[i] = array[right++];
			}
		}
		return result;
	}
	private int largestSmallerEqual(int[] array, int target) {
		int left = 0, right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] <= target) {
				left = mid;
			} else {
				right = mid;
			}
		}
		// while this is first? 
		// since array[right] >= array[left],
		// e.g. array[2] == {3, 5}, target = 5, left = 0, right = 1
		if (array[right] <= target) {
			return right;
		}
		if (array[left] <= target) {
			return left;
		}
		return -1;
	}
}
