package Recursion;

import BinaryTree.TreeNode;

public class Q178_ReverseBinaryTreeUpsideDown {
	// Method 1: Recursion
	public TreeNode reverseTree(TreeNode root) {
		if (root == null || root.left == null) {
			return root;
		}
		TreeNode newRoot = reverseTree(root.left);
		root.left.left = root.right;
		root.left.right = root;
		root.left = null;
		root.right = null;
		return newRoot;
	}
}
