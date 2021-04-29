package HashtableAndString;

public class Q85_DetermineIfOneStringIsAnothersSubstring {
	// s1 = text, s2 = pattern
	// Time = O(n^2)
	public int isSubstring(String s1, String s2) {
		if (s1 == null || s2 == null || s1.length() < s2.length()) {
			return -1;
		}
		if (s2.length() == 0) {
			return 0;
		}
		for (int i = 0; i <= s1.length() - s2.length(); i++) {
			int j = 0;
			while (j < s2.length() && s1.charAt(i + j) == s2.charAt(j)) {
				j++;
			}
			if (j == s2.length()) {
				return i;
			}
		}
		return -1;
	}

}
