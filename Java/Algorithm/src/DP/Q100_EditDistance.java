package DP;

public class Q100_EditDistance {
	
	// Solution1: Recursion/DFS
	public int editDistance(String word1, String word2) {
		// Base Case
		if (word1.isEmpty()) return word2.length();
		if (word2.isEmpty()) return word1.length();
		
		// (a) Check what the distance is if the characters[0] are 
		// identical and we do nothing first
		if (word1.charAt(0) == word2.charAt(0)) {
			int nothing = editDistance(word1.substring(1), word2.substring(1));
			return nothing;
		}
		// (b) Check what the distance is if we do a Replace first?
		int replace = 1 + editDistance(word1.substring(1), word2.substring(1));
		// (c) Check what the distance is if we do a Delete first?
		int delete = 1 + editDistance(word1.substring(1), word2);
		// (D) Check what the distance is if we do a Insert first?
		int insert = 1 + editDistance(word1, word2.substring(1));
		// Return the best solution
		return Math.min(replace, delete) < insert ? Math.min(replace, delete) : insert;
	}
	
	// Solution2: DP
	public int editDistanceII(String one, String two) {
		// Assumptions: one, two are not null
		// Again, using distance[i][j] to represent
		// substring(0, i) in one and substring(0, j) in two.
		int[][] distance = new int[one.length() + 1][two.length() + 1];
		for (int i = 0; i <= one.length(); i++) {
			for (int j = 0; j <= two.length(); j++) {
				if (i == 0) {
					distance[i][j] = j;
				} else if (j == 0) {
					distance[i][j] = i;
				} else if (one.charAt(i - 1) == two.charAt(j - 1)) {
					distance[i][j] = distance[i - 1][j - 1];
				} else {
					distance[i][j] = Math.min(distance[i - 1][j] + 1, distance[i][j - 1] + 1);
					distance[i][j] = Math.min(distance[i - 1][j - 1] + 1, distance[i][j]);
				}
			}
		}
		return distance[one.length()][two.length()];
	}
	
	
}
