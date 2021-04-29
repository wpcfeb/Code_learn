package Recursion;

import java.util.*;
import BinaryTree.TreeNode;

public class Q141_BinaryTreePathSumToTargetIII {
	public boolean exist(TreeNode root, int target) {
		if (root == null) {
			return false;
		}
		Set<Integer> prefixSums = new HashSet<>();
		prefixSums.add(0);
		return helperII(root, prefixSums, 0, target);
	}

	private boolean helperII(TreeNode root, Set<Integer> prefixSums, int prevSum, int target) {
		prevSum += root.key;
		if (prefixSums.contains(prevSum - target)) {
			return true;
		}
		boolean needRemove = prefixSums.add(prevSum); // if prevSum is a repeated value, we do not need to remove
														// because we can not add it in hashSet
		if (root.left != null && helperII(root.left, prefixSums, prevSum, target)) {
			return true;
		}
		if (root.right != null && helperII(root.right, prefixSums, prevSum, target)) {
			return true;
		}
		if (needRemove) {
			prefixSums.remove(prevSum);
		}
		return false;
	}

}
