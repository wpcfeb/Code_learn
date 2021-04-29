package DP;

public class Q89_ArrayHopperII {
	public static void main(String[] args) {
		Q89_ArrayHopperII s = new Q89_ArrayHopperII();
		int[] array = { 1, 1, 0 };
		System.out.println(s.minJump(array));

	}

	// Method 1: DP.
	public int minJump(int[] array) {
		// Assumptions: array is not null and is not empty.
		int n = array.length;
		// M record the min number of jumps from 0 to each of the indices.
		int[] M = new int[n];
		// base case: we do not need to jump at the last element
		M[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			// because we will use min function alter, we use Integer Max to initializa unreachable
			M[i] = Integer.MAX_VALUE;
			// j represents each step we can make from index i
			// we need to make sure index + jumps in each step is less than the length to avoid index out of bound
			for (int j = i + 1; j <= Math.min(i + array[i], n - 1); j++) { // step1
				if (M[j] < M[i]) { // step2
					M[i] = M[j];
				}
			}
			if (M[i] != Integer.MAX_VALUE) { // step3
				M[i]++;
			}
		}
		// convert to -1 as per definition of the question, we need to return -1 if unreachable
		return M[0] == Integer.MAX_VALUE ? -1 : M[0];
	}

}
