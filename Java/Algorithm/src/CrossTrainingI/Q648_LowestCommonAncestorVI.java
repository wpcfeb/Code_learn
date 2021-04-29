package CrossTrainingI;

import java.util.*;

import CrossTrainingI.Q647_LowestCommonAncestorV.KnaryTreeNode;

public class Q648_LowestCommonAncestorVI {
	static class KnaryTreeNode {
		int key;
		List<KnaryTreeNode> children;

		public KnaryTreeNode(int key) {
			this.key = key;
			this.children = new ArrayList<>();
		}
	}

	public KnaryTreeNode lowestCommonAncestor(KnaryTreeNode root, List<KnaryTreeNode> nodes) {
		// Assumptions: the list of nodes is not null of not empty.
		// all the nodes in the list are guaranteed to be in the tree.
		Set<KnaryTreeNode> set = new HashSet<KnaryTreeNode>(nodes);
		return helper(root, set);
	}

	private KnaryTreeNode helper(KnaryTreeNode root, Set<KnaryTreeNode> set) {
		if (root == null || set.contains(root)) {
			return root;
		}
		KnaryTreeNode found = null;
		for (KnaryTreeNode child : root.children) {
			KnaryTreeNode node = helper(child, set);
			if (node == null) {
				continue;
			}
			if (found == null) {
				found = node;
			} else {
				return root;
			}
		}
		return found;
	}
}
