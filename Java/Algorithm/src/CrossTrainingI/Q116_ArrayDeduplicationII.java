package CrossTrainingI;

import java.util.Arrays;

public class Q116_ArrayDeduplicationII {
	public int[] dedup(int[] array) {
		// Assumptions: array is not null.
		if (array.length <= 2) {
			return array;
		}
		int n = array.length;
		int slow = 2;
		int fast = 2;
		while (fast < n) {
			if (array[slow - 2] != array[fast]) {
				array[slow] = array[fast];
				slow++;
			}
			fast++;
		}
		return Arrays.copyOf(array, slow);
	}

}
