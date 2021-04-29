package BinarySearch;

interface Dictionary {
    public Integer get(int index);
 }

public class Q20_SearchInUnknownSizedSortedArray {
	// You do not need to implement the Dictionary interface.
	// You can use it directly, the implementation is provided when testing your solution.
	public int search(Dictionary dict, int target) {
	    // Write your solution here
		if (dict == null) {
			return -1;
		}
		int left = 0, right = 1;
		// find the right boundary for binary search.
		//extends until we are sure the target is within the [left, right] range.
		while (dict.get(right) != null && dict.get(right) < target) {
			// 1. move left to right
			// 2. double right index
			left = right;
			right = right * 2;
		}
		return binarySearch(dict, target, left, right);
	  }
	private int binarySearch(Dictionary dict, int target, int left, int right) {
		// classical binary search
		while (left <= right) {
			int mid = left + (right - left) / 2;
			//why if (dict.get(mid) == target) { return mid; } is wrong
			//since if dict.get(mid) == null, then judge null == target -> error
			if (dict.get(mid) == null || dict.get(mid) > target) {
				right = mid - 1;
			} else if (dict.get(mid) < target){
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
}
