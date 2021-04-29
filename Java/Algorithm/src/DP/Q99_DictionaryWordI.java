package DP;

import java.util.*;

public class Q99_DictionaryWordI {
	public static void main(String[] args) {
		Q99_DictionaryWordI sol = new Q99_DictionaryWordI();
		String s = "catsand";
		String[] dict = { "cat", "cats", "sand", "and", "ca", "tsand" };
		System.out.println(sol.wordSolverWithCount(s, dict));

	}

	public boolean wordSolver(String s, String[] dict) {
		// Assumptions:
		// input is not null or empty.
		// dict is not null and dict is not empty.
		// all the strings in dict are not null or empty.
		Set<String> dictSet = toSet(dict);
		boolean[] M = new boolean[s.length() + 1]; // include 0
		M[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			// Option 1: If the substring is in the dictionary, done.
			if (dictSet.contains(s.substring(0, i))) { // [0, i) == [0, i-1]
				M[i] = true; // Option1
				continue;
			}
			// Otherwise, check the possible single splits.
			for (int j = 1; j < i; j++) {
				// check subproblem and check the rest of the string
				if (M[j] && dictSet.contains(s.substring(j, i))) { // [j, i) == [j, i-1]
					M[i] = true;
					break;
				}
			}
		}
		return M[s.length()];
	}

	private Set<String> toSet(String[] dict) {
		Set<String> set = new HashSet<>();
		for (String s : dict) {
			set.add(s);
		}
		return set;
	}

	private int wordSolverWithCount(String s, String[] dict) {
		// Assumptions:
		// input is not null or empty.
		// dict is not null and dict is not empty.
		// all the strings in dict are not null or empty.
		Set<String> dictSet = toSet(dict);
		boolean[] M = new boolean[s.length() + 1]; // include 0
		M[0] = true;
		for (int i = 1; i < s.length(); i++) {
			// Option 1: If the substring is in the dictionary, done.
			if (dictSet.contains(s.substring(0, i))) { // [0, i) == [0, i-1]
				M[i] = true; // Option1
				continue;
			}
			// Otherwise, check the possible single splits.
			for (int j = 1; j < i; j++) {
				// check subproblem and check the rest of the string
				if (M[j] && dictSet.contains(s.substring(j, i))) { // [j, i) == [j, i-1]
					M[i] = true;
					break;
				}
			}
		}
		// when i == s.length()
		int count = 0;
		for (int j = 1; j < s.length(); j++) {
			if (M[j] && dictSet.contains(s.substring(j, s.length()))) {
				count++;

			}
		}
		return count;
	}
}
