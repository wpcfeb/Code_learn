package Recursion;

//Time O(2^n)
//Space O(logn)
public class Q624_FibonacciNumberLite {
	public int fibonacci (int K) {
		//base case
		if (K <= 0) {
			return 0;
		}
		if (K == 1) {
			return 1;
		}
		return fibonacci(K - 1) + fibonacci(K - 2);
	}
}
