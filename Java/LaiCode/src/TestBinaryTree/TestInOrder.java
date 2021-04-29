package TestBinaryTree;

public class TestInOrder {
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
		TestInOrder t1 = new TestInOrder();
		t1.inOrder(n1);
	}

	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.value + " ");
		inOrder(root.right);
	} 
}
