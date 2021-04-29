package Recursion;

import BinaryTree.TreeNode;

public class Q138_MaximumPathSumBinaryTreeI {
	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return Integer.MIN_VALUE; // 1.special return type
		}
		int[] globalMax = new int[1]; // pass by value
		globalMax[0] = Integer.MIN_VALUE; // 2. initialize value
		helper(root, globalMax);
		return globalMax[0];
	}

	private int helper(TreeNode root, int[] globalMax) {
		if (root == null) {
			return 0; // Base Case
		}
		// Find maximum sum in left and right subtree.
		// Also find maximum root to leaf sums in left and right subtrees
		// and store them in lLPSum and rLPSum
		int lcost = helper(root.left, globalMax);
		int rcost = helper(root.right, globalMax); // Step 1

		// Find the maximum path sum passing through root
		int currSum = lcost + rcost + root.key;
		if (currSum > globalMax[0] && (root.left != null && root.right != null)) {
			globalMax[0] = currSum; // Step 2
		}

		// Return the maximum (root to leaf path) cost
		if (root.left == null) { // Step 3
			return root.key + rcost;
		} else if (root.right == null) {
			return root.key + lcost;
		}
		return Math.max(lcost, rcost) + root.key;
	}
}
