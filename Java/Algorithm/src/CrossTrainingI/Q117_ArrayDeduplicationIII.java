package CrossTrainingI;

import java.util.Arrays;

public class Q117_ArrayDeduplicationIII {
	public static void main(String[] args) {
		Q117_ArrayDeduplicationIII s = new Q117_ArrayDeduplicationIII();
		int[] array = { 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5 };
		System.out.println(Arrays.toString(s.dedup(array)));
	}

	public int[] dedup(int[] array) {
		// Assumptions: input is not null.
		if (array == null || array.length <= 1) {
			return array;
		}
		int n = array.length;
		int slow = 0;
		int fast = 0;
		while (fast < n) {
			int fast2 = fast;
			while (fast2 < n && array[fast2] == array[fast]) {
				fast2++;
			}
			// Check how many input[fast] ?
			if (fast2 - fast == 1) {
				array[slow] = array[fast];
				slow += 1;
			}
			fast = fast2;
		}
		return Arrays.copyOf(array, slow);
	}
}
