package BinarySearch;

public class Q636_SmallestElementLargerThanTarget {
	public int smallestElementLargerThanTarget(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0, right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2; 
			if (array[mid] <= target) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
//		why not if (left < array.length && array[left] > target)?
//		since if array.length <= 2, can not enter while loop,
//		if array.length > 2, there is no dead loop.
//		out of boundary can not happen.
		
		if (array[left] > target) {
			return left;
		} else if (array[right] > target) {
			return right;
		}
		return -1;
	}
}
