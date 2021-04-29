package Recursion;

import BinaryTree.TreeNode;

public class Q639_MaxPathSumFromLeafToRoot {
	public int maxPathSumLeafToRoot(TreeNode root) {
		int[] globalMax = { Integer.MIN_VALUE };
		helper(root, 0, globalMax);
		return globalMax[0];
	}

	private void helper(TreeNode root, int prefixSum, int[] globalMax) {
		// base case
		if (root == null) {
			return;
		}
		
		// recursive rules
		if (root.left == null && root.right == null) {
			globalMax[0] = Math.max(prefixSum + root.key, globalMax[0]);
		}
		helper(root.left, prefixSum + root.key, globalMax);  // go left
		helper(root.right, prefixSum + root.key, globalMax); // go right
	}
}
