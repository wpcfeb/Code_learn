package BinaryTree;
import java.util.*;

public class Q656_PostorderTraversalOfBinaryTree_recursive {
	public List<Integer> postOrder(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		helper(root, res);
		return res;
	}
	private void helper(TreeNode root, List<Integer> res) {
		if (root == null) {
			return;
		}
		helper(root.left, res);
		helper(root.right, res);
		res.add(root.key);
	}
}
