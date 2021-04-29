package HashtableAndString;

import java.util.HashSet;

public class Q68_MissingNumberI {
	// Method 1: use HashSet.
	// Assumption: array is not null.
	public int missingI(int[] array) {
		int n = array.length + 1;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int number : array) {
			set.add(number);
		}
		// why i < n instead of i <= n : not necessary, return n means i == n
		for (int i = 1; i < n; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return n;
	}
}
