package Recursion;
import BinaryTree.TreeNode;
public class Q139_MaximumPathSumBinaryTreeII {
	public int maxPathSum(TreeNode root) {
		// Assumptions: root is not null.
		// max stores the global maximum path sum and wil be 
		// updated during the recursion.
		int[] globalMax = new int[] {Integer.MIN_VALUE};
		helper(root, globalMax);
		return globalMax[0];
	}
	
	// return the maximum path sum of the "single" path.
	private int helper(TreeNode root, int[] globalMax) {
		if (root == null) {
			return 0;
		}
		// Step 1
		int left = helper(root.left, globalMax);
		int right = helper(root.right, globalMax);
		// Step 2
		left = left < 0 ? 0 : left;
		right = right < 0 ? 0 : right;
		globalMax[0] = Math.max(globalMax[0], root.key + left + right);
		// Step 3
		return Math.max(left, right) + root.key;
	}

}
