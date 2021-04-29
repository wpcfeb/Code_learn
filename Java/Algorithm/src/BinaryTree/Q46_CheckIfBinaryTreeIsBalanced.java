package BinaryTree;

public class Q46_CheckIfBinaryTreeIsBalanced {
	//  optimal method
	public int helper(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = helper(root.left); 		// Step 1
		int rightHeight = helper(root.right);
		
		if (leftHeight == -1 || rightHeight == -1 
				|| Math.abs(leftHeight - rightHeight) > 1) { // Step2
			return -1;
		}
		return Math.max(leftHeight, rightHeight) + 1;		// Step3
	}
	
	
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		return isBalanced(root.left) && isBalanced(root.right);
	}
	private int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}
}
