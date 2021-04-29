package HashtableAndString;

import java.util.ArrayList;

public class Q172_StringReplace_Hard {
	// Method 1: Not using any String/StringBuilder utility,
	// and using char[] to do it "in place".
	public String replaceI(String input, String s, String t) {
		// Assumptions: input, s, t are not null, s is not empty.
		char[] array = input.toCharArray();
		if (s.length() >= t.length()) {
			return replaceShorter(array, s, t);
		}
		return replaceLonger(array, s, t);
	}

	public String replaceShorter(char[] input, String s, String t) {
		// We reuse the input char array since the number of characters needed is less
		// fast and slow pointers both from left to right direction.
		int slow = 0;
		int fast = 0;
		while (fast < input.length) {
			// when we find a match of s on the substring starting from the fast pointer
			// we copy the t at slow pointer
			if (fast <= input.length - s.length() && equalSubstring(input, fast, s)) {
				copySubstring(input, slow, t);
				slow += t.length();
				fast += s.length();
			} else {
				input[slow++] = input[fast++];
			}
		}
		return new String(input, 0, slow);
	}

	public String replaceLonger(char[] input, String s, String t) {
		// Notice: we will need a longer array in the case, and if the requirement
		// is "in place", usually you can assume you are given a long enough
		// char array already, and the original input string resides
		// on part of the char array starting from index 0.
		// In this solution, we actually allocate a larger array on demand, and the
		// purpose of the solution is to demonstrate how to do it "in place".

		// get all the matches end positions in the input char array of string s.
		ArrayList<Integer> matches = getAllMatches(input, s);
		// calculate the new length needed.
		char[] result = new char[input.length + matches.size() * (t.length() - s.length())];
		// fast and slow pointers both from right to left direction.
		// low: the position when traversing the new length.
		// fast: the position when traversing the old length.
		// lastIndex: the rightmost matching end position's index.
		int lastIndex = matches.size() - 1;
		int fast = input.length - 1;
		int slow = result.length - 1;
		while (fast >= 0) {
			// only if we still have some match and slow is in the position of
			// rightmost matching end position, we should copy t.
			if (lastIndex >= 0 && fast == matches.get(lastIndex)) {
				copySubstring(result, slow - t.length() + 1, t);
				slow -= t.length();
				fast -= s.length();
				lastIndex--;
			} else {
				result[slow--] = input[fast--];
			}
		}
		return new String(result);
	}

	// check if the substring from fromIndex is the same as s.
	private boolean equalSubstring(char[] input, int fromIndex, String s) {
		for (int i = 0; i < s.length(); i++) {
			if (input[fromIndex + i] != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	// copy the string t to result at fromIndex.
	private void copySubstring(char[] result, int fromIndex, String t) {
		for (int i = 0; i < t.length(); i++) {
			result[fromIndex + i] = t.charAt(i);
		}
	}

	// get all the matches of s end positions in input.
	private ArrayList<Integer> getAllMatches(char[] input, String s) {
		ArrayList<Integer> matches = new ArrayList<Integer>();
		int i = 0;
		while (i <= input.length - s.length()) {
			if (equalSubstring(input, i, s)) {
				// we record the match substring's end index instead of start index,
				// for later convenience.
				matches.add(i + s.length() - 1);
				i += s.length();
			} else {
				i++;
			}
		}
		return matches;
	}

}
