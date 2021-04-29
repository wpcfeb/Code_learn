package BinarySearch;

public class FirstOccurrence {
	//Time O(log n)
	//Space O(1)
	public static int firstOcc(int[] array, int target) {
		if(array == null || array.length == 0) {
			return -1;
		}
		int l = 0, r = array.length - 1;
		while(l < r - 1) {
			int mid = l + (r - l)/2;
			if(target <= array[mid]) {
				r = mid;
			} else {
				l = mid;
			}
			
		}
		if (target == array[l]) {
			return l;
		}
		if (target == array[r]) {
			return r;
		}
		return -1;
	}
	

}
