package Recursion;

import BinaryTree.TreeNode;

public class Q140_MaximumPathSumBinaryTreeIII {
	// solution 1: pre-order traverse plus DP
	public int maxPathSum(TreeNode root) {
		int[] globalMax = new int[] { Integer.MIN_VALUE };
		helper(root, globalMax, 0);
		return globalMax[0];
	}

	private void helper(TreeNode root, int[] globalMax, int sum) {
		// base case
		if (root == null) {
			return;
		}
		if (sum < 0) {
			sum = root.key;
		} else {
			sum += root.key;
		}
		globalMax[0] = Math.max(globalMax[0], sum);

		helper(root.left, globalMax, sum);
		helper(root.right, globalMax, sum);
	}

	// solution 2: from bottom to top
	public int maxPathSumII(TreeNode root) {
		int[] globalMax = new int[] { Integer.MIN_VALUE };
		helperII(root, globalMax);
		return globalMax[0];
	}

	private int helperII(TreeNode root, int[] globalMax) {
		if (root == null) {
			return 0;
		}
		int left = helperII(root.left, globalMax);
		int right = helperII(root.right, globalMax);  // step 1

		int cur = Math.max(0, Math.max(left, right)) + root.key;
		globalMax[0] = Math.max(globalMax[0], cur);   // step 2
		return cur;                                   // step 3
	}

}
