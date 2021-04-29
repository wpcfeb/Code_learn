package Recursion;

//Time O(log(b))
//Space O(log(b))
public class Q13_AtothePowerofB {
	public long power(int a, int b) {
		//base case
		if (a == 0) {
			return 0;
		}
		if (b == 0) {
			return 1;
		}
		long temp = power(a, b / 2);
		if (b % 2 == 0) {
			return temp * temp;
		} else {
			return temp * temp * a;
		}
	}
}
