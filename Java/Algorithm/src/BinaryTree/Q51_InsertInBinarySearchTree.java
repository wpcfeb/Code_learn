package BinaryTree;

public class Q51_InsertInBinarySearchTree {
	//method 1: recursive
	//Time = O(height)
	//Space = O(height)
	public TreeNode insert(TreeNode root, int key) {
		if (root == null) {
			return new TreeNode(key);
		}
		if (key < root.key) {
			root.left = insert(root.left, key);
			//本层的root在上一层是root.left，相当于又赋值了一遍
			//所以除了base case，不改变指向
		} else if (key > root.key) {
			root.right = insert (root.right, key);
		}
		return root;
	}
	
	//method 2: iterative
	public TreeNode insertII(TreeNode root, int key) {
		if (root == null) {
			return new TreeNode(key);
		}
		TreeNode cur = root;
		while (cur.key != key) {
			if (key < cur.key) {
				if (cur.left == null) {
					cur.left = new TreeNode(key);
				}
				cur = cur.left;
			} else {
				if (cur.right == null) {
					cur.right = new TreeNode(key);
				}
				cur = cur.right;
			}
		}
		return root;
	}
}
