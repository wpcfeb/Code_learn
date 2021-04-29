package BitOperations;

public class Q77_AllUniqueCharactersII {
	public static void main(String[] args) {
		Q77_AllUniqueCharactersII s = new Q77_AllUniqueCharactersII();
		String a = "abcdee";
		System.out.println(s.unique(a));
		
		String b = "178aui//";
		System.out.println(s.containsUniqueCharacters(b));
				
	}
	// Input a -> z
	public boolean unique(String a) {
		int occuredCharacters = 0;
		for (int i = 0; i < a.length(); i++) {
			int k = a.charAt(i) - 'a';
			// Whether occuredCharacter's k-th bit is one (Building block #1)
			// Solution 1: x & (1 << k)
			// Solution 2: (x >> k) & 1
			if (((occuredCharacters >> k) & 1) == 1) {
				return false;
			}
			// Set ocurredCharacter's k-th bit to one (building block #2)
			occuredCharacters |= (1 << k);
		}
		return true;
	}
	// Assume that the string is in ASCII representation
	public boolean containsUniqueCharacters(String input) {
		int[] bit_vector = new int[8];
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int row = ch / 32;
			int col = ch % 32;
			int weight = (1 << col);
			if ((bit_vector[row] & weight) != 0) {
				return false;
			}
			bit_vector[row] |= weight;
		}
		return true;
	}
	
}
