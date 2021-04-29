package TestBinaryTree;

public class TestHeight {
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
		TestHeight t1 = new TestHeight();
		System.out.print(t1.getHeight(n1));
		
	}
	public int getHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int l = getHeight(root.left);
		int r = getHeight(root.right);
		return Math.max(l, r) + 1;
	}

}
