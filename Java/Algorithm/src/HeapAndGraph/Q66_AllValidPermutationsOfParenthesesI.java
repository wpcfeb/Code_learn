package HeapAndGraph;
import java.util.*;
public class Q66_AllValidPermutationsOfParenthesesI {
	// n stores total number of "pair of ()" need to add. So total levels
	// == 2 * n.
	// l stores the number of left parenthesis "(" added so far.
	// r stores the number of right parenthesis ")" added so far.
	// soluPrefix: solution so far
	void DFS(int n, int l, int r, StringBuilder soluPrefix) {
		if (l == n && r == n) {
			System.out.println(soluPrefix);  // base case
			return;
		}
		// Case1: add '(' on this level
		if (l < n) {
			soluPrefix.append('(');
			DFS(n, l + 1, r, soluPrefix);
			soluPrefix.deleteCharAt(soluPrefix.length() - 1);
		}
		
		// Case2: add ')' on this level
		if (l > r) {
			soluPrefix.append(')');
			DFS(n, l, r + 1, soluPrefix);
			soluPrefix.deleteCharAt(soluPrefix.length() - 1);
		}
	}
	
	// laicode
	public List<String> validParentheses(int n) {
		List<String> result = new ArrayList<String>();
		// the final string contains 2n characters.
		char[] cur = new char[n * 2];
		helper(cur, n, n, 0, result);
		return result;
	}
	
	// left: how many '(' we still have
	// right: how many ')' we still have
	// index: the current position in cur we want to fill in 
	//        with either '(' or ')'
	private void helper(char[] cur, int left, int right, int index, List<String> result) {
		// terminate condition:
		// when we do not have any parentheses left.
		if (left == 0 && right == 0) {
			result.add(new String(cur));
			return;
		}
		// when we add a '('? whenever there is some '(' we can still use.
		if (left > 0) {
			cur[index] = '(';
			helper(cur, left - 1, right, index + 1, result);
			// NOTICE: it looks like we do not do anything when back tracking
			// 		   to the previous level.
			//		   the code is still correct because:
			//         1. we are setting the character at index and when back tracking,
			//            what we need is just 1). remove the character at index and
			//            2). add a different character at index.
			//         2. only when we fill in all the posiitons in cur, we have
			//            a complete solution.
			//         the code itself actually already suffices the above two points and
			//         it already does the correct removing operation when back tracked to
			//         the previous level.
		}
		// when we add a ')'? when there is more '(' than ')' used,
		// because each ')' should be associated with a previous '('.
		if (right > left) {
			cur[index] = ')';
			helper(cur, left, right - 1, index + 1, result);
		}
	}
}
