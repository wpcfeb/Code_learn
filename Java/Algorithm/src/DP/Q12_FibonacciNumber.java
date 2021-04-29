package DP;

public class Q12_FibonacciNumber {
	// Method 2: dp solution with O(n) space.
	public long fibonacciI(int K) {
		if (K <= 0) {
			return 0;
		}
		long[] array = new long[K + 1];
		array[1] = 1;
		for (int i = 2; i <= K; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}
		return array[K];
	}

}
