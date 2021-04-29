package HashtableAndString;
import java.util.*;
public class Q652_CommonNumbersOfTwoSortedArrays_Arrayversion {
	// Assumptions: there could be duplicated elements in the given arrays.
	// Method 1: two pointers.
	public List<Integer> commonI(int[] a, int[] b) {
		// Assumption: a, b is not null.
		List<Integer> common = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				common.add(a[i]);
				i++;
				j++;
			} else if (a[i] < b[j]) {
				i++;
			} else {
				j++;
			}
		}
		return common;
	}
}
