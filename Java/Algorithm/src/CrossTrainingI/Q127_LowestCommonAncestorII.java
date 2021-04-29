package CrossTrainingI;

class TreeNodeP {
	public int key;
	public TreeNodeP left;
	public TreeNodeP right;
	public TreeNodeP parent;

	public TreeNodeP(int key, TreeNodeP parent) {
		this.key = key;
		this.parent = parent;
	}
}

public class Q127_LowestCommonAncestorII {
	public TreeNodeP lowestCommonAncestor(TreeNodeP one, TreeNodeP two) {
		int l1 = length(one);
		int l2 = length(two);
		// This is a small trick that can guarantee when calling mergeNode(),
		// the first list is the shorter list, the second list is the longer one.
		if (l1 <= l2) {
			return mergeNode(one, two, l2 - l1);
		} else {
			return mergeNode(two, one, l1 - l2);
		}
	}
	
	private TreeNodeP mergeNode(TreeNodeP shorter, TreeNodeP longer, int diff) {
		while (diff > 0) {
			longer = longer.parent;
			diff--;
		}
		while (longer != shorter) {
			longer = longer.parent;
			shorter = shorter.parent;
		}
		return longer;
	}
	
	// get the length of the list from the node to the root of the tree
	// along the path using parent pointers.
	private int length(TreeNodeP node) {
		int length = 0;
		while (node != null) {
			node = node.parent;
			length++;
		}
		return length;
	}

}
