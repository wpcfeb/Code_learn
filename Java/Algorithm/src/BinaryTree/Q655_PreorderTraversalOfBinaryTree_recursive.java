package BinaryTree;

import java.util.*;

public class Q655_PreorderTraversalOfBinaryTree_recursive {
	public List<Integer> preOrder(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		helper(root, res);
		return res;
	}

	private void helper(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		res.add(root.key);
		helper(root.left, res);
		helper(root.right, res);
	}
}
