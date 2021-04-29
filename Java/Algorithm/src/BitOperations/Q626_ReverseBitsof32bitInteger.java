package BitOperations;

public class Q626_ReverseBitsof32bitInteger {
	
	public static void main(String[] args) {
		Q626_ReverseBitsof32bitInteger s = new Q626_ReverseBitsof32bitInteger();
		int n = 123456789;
		System.out.println(Integer.toBinaryString(n));
		int res = s.reverseBits(n);
		System.out.println(Integer.toBinaryString(res));
		
	}
	
	// input: Long
	public long reverseI(long num) {
		for (int offset = 0; offset < 16; ++offset) {
			long right = (num >> offset) & 1L;
			long left = (num >> (31 - offset)) & 1L;
			if (left != right) {
				num ^= (1L << offset);
				num ^= (1L << (31 - offset));
			}
		}
		return num;
	}
	
	
	
	// input: Integer
	public int reverseBits(int n) {
		int i = 0;
		int j = 31;
		while (i < j) {
			n = swap(n, i, j);
			i++;
			j--;
		}
		return n;
	}
	private int swap(int x, int i, int j) {
		// x = 0b b7 b6 b5 b4 b3 b2 b1 b0
		int bi = (x >>> i) & 1;
		int bj = (x >>> j) & 1;
		if (bi == bj) {
			return x;
		}
		// bi != bj  -> ~bi   ~bj
		return x ^ ((1 << i) + (1 << j));  // long的前32位也会取反
	}

}
