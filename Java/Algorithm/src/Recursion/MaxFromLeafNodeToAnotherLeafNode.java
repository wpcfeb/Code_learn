package Recursion;
import BinaryTree.TreeNode;

public class MaxFromLeafNodeToAnotherLeafNode {
	public int findMax(TreeNode root) {
		if (root == null) {
			return Integer.MIN_VALUE;   // 1.special return value
		}
		int[] globalMax = new int[1]; // pass by value
		globalMax[0] = Integer.MIN_VALUE; // 2. initialize value
		helper(root, globalMax);
		return globalMax[0];
	}
	private int helper(TreeNode root, int[] globalMax) {
		if (root == null) {
			return 0;
		}
		// step1
		int left = helper(root.left, globalMax);
		int right = helper(root.right, globalMax);
		// step2
		if (root.left != null && root.right != null) { // 3.
			globalMax[0] = Math.max(globalMax[0], root.key + left + right);
			return Math.max(left, right) + root.key;
		}
		return root.left == null ? (right + root.key) : (left + root.key); // 4.
	}
	// Time = O(n)
	// Space = O(Height)
	
}
