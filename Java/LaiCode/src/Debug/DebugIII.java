package Debug;

public class DebugIII {
	public int firstOccur(int[] array, int target) {
	    if (array == null || array.length == 0) {
	      return -1;
	    }
	    int left = 0;
	    int right = array.length - 1;
	    while (left <= right) {
	      int mid = left + (right - left) / 2;
	      if (array[mid] >= target) right = mid;
	      else left = mid;
	    }
	    if (array[left] == target) return left;
	    if (array[right] == target) return right;
	    return -1;
	  }
}
