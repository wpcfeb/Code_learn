package BinarySearch;

public class LastOccurence {
	public static int LastOcc(int[] array, int target) {
		if(array == null || array.length == 0) {
			return -1;
		}
		int l = 0, r = array.length - 1;
		while(l < r - 1) {
			int mid = l + (r - l)/2;
			if(target >= array[mid]) {
				l = mid;
			} else {
				r = mid;
			}
			
		}
		if (target == array[r]) {
			return r;
		}
		if (target == array[l]) {
			return l;
		}
		return -1;
	}
}
