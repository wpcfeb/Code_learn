package CrossTrainingI;

import java.util.Arrays;
import java.util.*;
import BinaryTree.TreeNode;

public class Q118_ArrayDeduplicationIV {
	public static void main(String[] args) {
		TreeNode root = null;
		List<TreeNode> list = new ArrayList<TreeNode>();
		list.add(root);
		System.out.println(list.get(0) == null);
	}
	public int[] dedup(int[] array) {
		// Assumptions: array is not null
		int end = -1;
		for (int i = 0; i < array.length; i++) {
			// we are using the left part of the original array as a stack.
			// and the top element's index is end. if the stack is empty(end == -1),
			// we just push the element into the stack, or if the element is not
			// the same as the top element of the stack, we can push the element into
			// the stack as well.
			if (end == -1 || array[end] != array[i]) {
				array[++end] = array[i];
			} else {
				// otherwise, we ignore all consecutive duplicates and
				// remove the top element of the stack.
				while (i + 1 < array.length && array[i + 1] == array[end]) {
					// why i + 1 ? since after this for loop, we need i++ which means we skip the current i
					i++;
				}
				end--;
			}
		}
		return Arrays.copyOf(array, end + 1); 
	}

}
