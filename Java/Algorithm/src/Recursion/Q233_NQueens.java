package Recursion;
import java.util.*;
public class Q233_NQueens {
	// Method 1: validate the queen position in O(n) each time.
	public List<List<Integer>> nqueens(int n) {
		// Assumptions: n > 0
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// cur will be a list of size n, and cur[i] is the column number
		// where the queen on row i positioned.
		List<Integer> cur = new ArrayList<Integer>();
		helper(n, cur, result);
		return result;
	}
	private void helper(int n, List<Integer> cur, List<List<Integer>> result) {
		// base case: when for all the rows we know where the queen is positioned.
		if (cur.size() == n) {
			result.add(new ArrayList<Integer>(cur));
			return;
		}
		for (int i = 0; i < n; i++) {
			// check if putting a queen at column i at current row is valid.
			if (valid(cur, i)) {
				cur.add(i);
				helper(n, cur, result);
				cur.remove(cur.size() - 1);
			}
		}
	}
	
	private boolean valid(List<Integer> cur, int column) {
		int row = cur.size();
		for (int i = 0; i < row; i++) {
			if (cur.get(i) == column || Math.abs(cur.get(i) - column) == row - i) { // index row is the considered position 
				// same column or diagonal
				return false;
			}
		}
		return true;
	}
}
