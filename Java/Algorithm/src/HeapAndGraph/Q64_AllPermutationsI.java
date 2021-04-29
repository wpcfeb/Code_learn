package HeapAndGraph;
import java.util.*;
public class Q64_AllPermutationsI {
	public static void main(String[] args) {
		char[] input = {'a', 'b', 'c'};
		Q64_AllPermutationsI s1 = new Q64_AllPermutationsI();
		s1.permutation(input, 0);
	}
	void permutation(char[] input, int index) {
		// input[0 ... index - 1] 已经确定位置的
		// input[index ... n - 1] 尚未确定位置
		// 确定input[index]是谁
		if (index == input.length) {  // print solution and return;
			System.out.println(input);
			return;                   // base case
		}
		// put each letter in the index-th position of the input str.
		for (int i = index; i < input.length; i++) {
			swap(input, index, i); // 吃
			permutation(input, index + 1);
			swap(input, index, i); // 吐
		}
	}
	
	
	// laicode
	// 1. DFS solution with swapping (recommanded)
	public List<String> permutations(String input) {
		List<String> result = new ArrayList<String>();
		if (input == null) {
			return result;
		}
		char[] array = input.toCharArray();
		helper(array, 0, result);
		return result;
	}
	// choose the character to be at the position of "index",
	// all the already chosen positions are (0, index - 1)
	// all the candidate characters can be at position "index"
	// are in the subarray of (index, array.length - 1)
	private void helper(char[] array, int index, List<String> result) {
		// terminate condition:
		// only when we have already chosen the characters for all the position,
		// we can have a complete permutation.
		if (index == array.length) {
			result.add(new String(array));
			return;
		}
		// all the possible characters could be placed at index are
		// the characters in the subarray (index, array.length - 1);
		for (int i = index; i < array.length; i++) {
			swap(array, index, i);
			helper(array, index + 1, result);
			// remember to swap back when back track to previous level.
			swap(array, index, i);
		}
	}
	private void swap(char[] input, int i , int j) {
		char temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
