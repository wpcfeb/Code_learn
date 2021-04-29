package CrossTrainingI;

import java.util.*;

public class Q647_LowestCommonAncestorV {
	static class KnaryTreeNode {
		int key;
		List<KnaryTreeNode> children;

		public KnaryTreeNode(int key) {
			this.key = key;
			this.children = new ArrayList<>();
		}
	}

	public KnaryTreeNode lowestCommonAncestor(KnaryTreeNode root, KnaryTreeNode a, KnaryTreeNode b) {
		// Assumptions: root is not null;
		// a and b are guaranteed to be in the tree and not null.
		if (root == null || root == a || root == b) {
			return root;
		}
		KnaryTreeNode found = null;
		for (KnaryTreeNode child : root.children) {
			KnaryTreeNode node = lowestCommonAncestor(child, a, b);
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
