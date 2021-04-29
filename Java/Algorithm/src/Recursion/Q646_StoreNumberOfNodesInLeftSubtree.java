package Recursion;

public class Q646_StoreNumberOfNodesInLeftSubtree {
	static class TreeNodeLeft {
		int key;
		TreeNodeLeft left;
		TreeNodeLeft right;
		// store the # of nodes in left subtree.
		int numNodesLeft;
		public TreeNodeLeft(int key) {
			this.key = key;
		}
	}
	
	public void numNodesLeft(TreeNodeLeft root) {
		numNodes(root);
	}
	
	// return the # of nodes in the subtree.
	private int numNodes(TreeNodeLeft root) {
		if (root == null) {
			return 0;
		}
		// leftNum is the # of nodes in subtree of root.left
		int leftNum = numNodes(root.left);
		// rightNum is the # of nodes in  subtree of root.right
		int rightNum = numNodes(root.right);
		root.numNodesLeft = leftNum;
		// return the total # of nodes in the subtree of root.
		return leftNum + rightNum + 1;
		
	}

}
