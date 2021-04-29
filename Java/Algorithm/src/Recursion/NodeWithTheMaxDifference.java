package Recursion;


public class NodeWithTheMaxDifference {
	class TreeNode {
		int key;
		TreeNode left;
		TreeNode right;
		public TreeNode(int key) {
			this.key = key;
		}
	}
	
	// Key problem: How to define the signature?
	// When we need to maintain a global max/min variable, then put 
	// it in the input argument list.
	public int maxDiffNode(TreeNode root, int[] globalMax, TreeNode[] solu) {
		if (root == null) {
			return 0;
		}
		
		// step 1
		int leftTotal = maxDiffNode(root.left, globalMax, solu);
		int rightTotal = maxDiffNode(root.right, globalMax, solu);
		
		// step 2: current level
		if (Math.abs(leftTotal - rightTotal) > globalMax[0]) {
			globalMax[0] = Math.abs(leftTotal - rightTotal);
			solu[0] = root;
		}
		
		// step 3
		return leftTotal + rightTotal + 1;
	}
}
