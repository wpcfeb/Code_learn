package CrossTrainingI;

import java.util.*;
import BinaryTree.TreeNode;

public class Q129_LowestCommonAncestorIV {
	public TreeNode lowestCommonAncestor(TreeNode root, List<TreeNode> nodes) {
		// Assumptions: the list of nodes is not null or not empty.
		// all the nodes in the list are guaranteed to be in the tree.
		Set<TreeNode> set = new HashSet<>(nodes);
		return helper(root, set);
	}

	private TreeNode helper(TreeNode root, Set<TreeNode> set) {
		if (root == null) {
			return null;
		}
		if (set.contains(root)) {
			return root;
		}
		TreeNode left = helper(root.left, set);
		TreeNode right = helper(root.right, set);
		if (left != null && right != null) {
			return root;
		}
		return left != null ? left : right;
	}

}
