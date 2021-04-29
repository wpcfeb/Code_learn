package BinarySearch;

public class Q15_FirstOccurrence {
	public int firstOccur(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0, right = array.length - 1;
//		we need to use left < right - 1 here to make sure there is no infinite loop.
//		Think about the case when left == right - 1,
//		then mid == left, it will be possible picking [mid, right] for the next round
//		and it will go into an infinite loop in that case.
		
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] >= target) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		if (array[left] == target) {
			return left;
		} else if (array[right] == target) {
			return right;
		} else {
			return -1;
		}
	}
}
