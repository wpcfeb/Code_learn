package Recursion;

public class Q126_LowestCommonAncestorI {
	class TreeNode {
		int key;
		TreeNode left;
		TreeNode right;
		public TreeNode(int key) {
			this.key = key;
		}
	}
	
	TreeNode LCA(TreeNode root, TreeNode a, TreeNode b) {
		if (root == null || root == a || root == b) {
			return root;
		}
		TreeNode left = LCA(root.left, a, b);
		TreeNode right = LCA(root.right, a, b);          // Step 1
		
		if (left != null && right != null) {             // Step 2 & 3
			return root;
		}
		return left == null ? right : left;              // Step 2 & 3
	}
	
}
