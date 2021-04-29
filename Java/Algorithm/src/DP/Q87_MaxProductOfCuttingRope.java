package DP;

public class Q87_MaxProductOfCuttingRope {
	// Method 1: DFS
	public int getMaxProduct(int n) {
		if (n <= 1) {
			return 0;   // base case
		}
		int maxProduct = 0;
		for (int i = 1; i < n; i++) { // i = meters of rope to cut off
			int best = Math.max(n - i, getMaxProduct(n - i)); // corner case: no cut or cut
				// (no cut) rope remains, cut == subproblem
			maxProduct = Math.max(maxProduct, i * best);
		}
		return maxProduct;
	}
	
	// Method 2: DP
	public int cutRope(int n) {
		int[] M = new int[n + 1];
		M[0] = 0;
		M[1] = 0;              // base case;
		for (int i = 2; i <= n; i++) {  // grow the length of rope
			int curMax = 0;
			for (int j = 1; j < i; j++) { // j represents LeftBigSection
				curMax = Math.max(curMax, Math.max(j, M[j]) * (i - j));
			}
			M[i] = curMax;
		}
		return M[n];
	}

}
