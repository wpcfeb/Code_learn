package BinaryTree;


public class Q60_HeightofBinaryTree {
	// Time O(n)
	// Space O(n)
	public int findHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}
}
