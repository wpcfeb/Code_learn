package BitOperations;

public class Q75_NumberOfDifferentBits {
	public int diffBits(int a, int b) {
		// afer exclusive or, only the bits where a and b 
		// are different will be 1.
		int count = 0;
		// In Java, notice that we are using logical right shift >>>.
		// and a != 0 as the terminate condition.
		for (int c = a ^ b; // initialization
			 c != 0;        // termination condtion
			 c = c >>> 1) {  // increment
		     count += (c & 1);
		}
		return count;
	}
}
