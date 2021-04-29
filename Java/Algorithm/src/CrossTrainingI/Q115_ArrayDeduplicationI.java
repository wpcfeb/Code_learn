package CrossTrainingI;

import java.util.*;

public class Q115_ArrayDeduplicationI {
	public static void main(String[] args) {
		Q115_ArrayDeduplicationI s = new Q115_ArrayDeduplicationI();
		int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 4};
		
		System.out.println(array == s.dedup(array));
		System.out.println(Arrays.toString(s.dedup(array)));
	}

	public int[] dedup(int[] array) {
		// Assumptions: array is not null
		if (array.length <= 1) {
			return array;
		}
		int n = array.length;
		int slow = 0;
		int fast = 0;
		while (fast < n) {
			if (slow == 0 || array[slow - 1] != array[fast]) {
				array[slow] = array[fast];
				slow++;
			}
			fast++;
		}
		// Notice: usually you don't have to copy the subarray, instead,
		// you can just return the length of valid subarray after dedup
		// since the operation is done in place.
		// this is only useful for laicode to validate the result.
		return Arrays.copyOf(array, slow);
	}
	
}
