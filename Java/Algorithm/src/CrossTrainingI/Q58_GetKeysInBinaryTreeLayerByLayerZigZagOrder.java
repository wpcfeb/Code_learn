package CrossTrainingI;

import java.util.*;

import BinaryTree.TreeNode;

public class Q58_GetKeysInBinaryTreeLayerByLayerZigZagOrder {
	public List<Integer> zigZag(TreeNode root) {
		if (root == null) {
			return new LinkedList<Integer>();
		}
		Deque<TreeNode> deque = new LinkedList<TreeNode>();
		List<Integer> list = new LinkedList<Integer>();
		deque.offerFirst(root);
		int layer = 0; // layer = 0 means even layer, layer = 1 means odd layer
		while (!deque.isEmpty()) {
			// The size of current level should be extracted at the first place,
			// because the size of the deque is changing all the time.
			int size = deque.size();
			for (int i = 0; i < size; i++) {
				if (layer == 0) {
					// at even layer, from right to left.
					TreeNode tmp = deque.pollLast();
					list.add(tmp.key);
					if (tmp.right != null) {
						deque.offerFirst(tmp.right);
					}
					if (tmp.left != null) {
						deque.offerFirst(tmp.left);
					}
				} else {
					// at odd layer, from left to right.
					TreeNode tmp = deque.pollFirst();
					list.add(tmp.key);
					if (tmp.left != null) {
						deque.offerLast(tmp.left);
					}
					if (tmp.right != null) {
						deque.offerLast(tmp.right);
					}
				}
			}
			layer = 1 - layer;
		}
		return list;
	}
}
