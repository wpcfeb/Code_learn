package DP;

public class MinimalCutsPalindrome {
	public static void main(String[] args) {
		String input = "ababbbabbababa";
		MinimalCutsPalindrome s = new MinimalCutsPalindrome();
		System.out.print(s.minCuts(input));
	}
	
	// Solution: DP
	public int minCuts(String input) {
		if (input == null || input.length() <= 1) {
			return 0;
		}
		char[] array = input.toCharArray();
		int[] M = new int[input.length()]; 
		// M[i] represents the minimum cuts required to cut substring[0,i] 
		// include i into palindromes
		M[0] = 0;
		for (int i = 1; i < input.length(); i++) {
			if (isPalindrome(array, 0, i)) {
				M[i] = 0;
			} else {
				M[i] = i; // worst case: cut every letter
				for (int j = 1; j <= i; j++) {
					if (isPalindrome(array, j, i)) {
						M[i] = Math.min(M[i], M[j] + 1);
					}
				}
			}
		}
		return M[input.length() - 1];
	}
	
	public boolean isPalindrome(char[] input, int i, int j) {
		while (i < j) {
			if (input[i] != input[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	// Time = O(n^3)  since isPalindrome is O(n)
	// Space = O(n)
}
