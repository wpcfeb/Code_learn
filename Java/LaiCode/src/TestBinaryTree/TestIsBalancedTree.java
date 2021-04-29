package TestBinaryTree;

public class TestIsBalancedTree {
	public static void main(String[] args) {
			TreeNode n1 = new TreeNode(10);
			TreeNode n2 = new TreeNode(5);
			TreeNode n3 = new TreeNode(15);
			TreeNode n4 = new TreeNode(2);
			TreeNode n5 = new TreeNode(7);
			TreeNode n6 = new TreeNode(12);
			TreeNode n7 = new TreeNode(20);
			n1.left = n2;
			n1.right = n3;
			n2.left = n4;
			n2.right = n5;
			n3.left = n6;
			n3.right = n7;
			TestIsBalancedTree t1 = new TestIsBalancedTree();
			System.out.println(t1.isB(n1));
			System.out.println(t1.isB2(n1));
			
	}
	
	public boolean isB(TreeNode root) {
		if(root == null) {
			return true;
		}
		boolean lB = isB(root.left);
		boolean rB = isB(root.right);
		int lH = getHeight(root.left);
		int rH = getHeight(root.right);
		
		return(lB && rB && Math.abs(lH - rH) <= 1);
	}
	public int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int l = getHeight(root.left);
		int r = getHeight(root.right);
		return Math.max(l, r) + 1;
		
	}
	
	public boolean isB2(TreeNode root) {
		return getHeightOrUnbalance(root) >= 0;
	}
	public int getHeightOrUnbalance(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int l = getHeightOrUnbalance(root.left);
		int r = getHeightOrUnbalance(root.right);
		if(l < 0 || r < 0) {
			return -1;
		}
		if(Math.abs(l - r) > 1) {
			return -1;
		}
		
		return 1 + Math.max(l, r);
	}
	
	
	
	
	
	

}
