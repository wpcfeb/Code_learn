package Recursion;

import java.util.*;
import BinaryTree.TreeNode;

public class Q213_ReconstructBinaryTreeWithPreorderAndInorder {
	// Method 1: Utilizing the inOrder sequence to determine
	// the size of left/right subtrees.
	public TreeNode reconstruct(int[] inOrder, int[] preOrder) {
		// Assumptions: pre, in are not null, there is no duplicates
		// in the binary tree, the length of pre and in are guaranteed
		// to be the same.
		Map<Integer, Integer> inIndex = indexMap(inOrder);
		return helper(preOrder, inIndex, 0, inOrder.length - 1, 0, preOrder.length - 1);
	}

	private Map<Integer, Integer> indexMap(int[] in) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < in.length; i++) {
			map.put(in[i], i);
		}
		return map;
	}

	private TreeNode helper(int[] preOrder, Map<Integer, Integer> inIndex, int inLeft, int inRight, int preLeft,
			int preRight) {
		if (inLeft > inRight) {
			return null;
		}
		TreeNode root = new TreeNode(preOrder[preLeft]);
		int inMid = inIndex.get(root.key);
		root.left = helper(preOrder, inIndex, inLeft, inMid - 1, preLeft + 1, preLeft + inMid - inLeft);
		root.right = helper(preOrder, inIndex, inMid + 1, inRight, preRight + inMid - inRight + 1, preRight);
		return root;
	}
}
