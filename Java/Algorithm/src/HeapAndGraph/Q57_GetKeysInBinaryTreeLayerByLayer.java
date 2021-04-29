package HeapAndGraph;
import java.util.*;
public class Q57_GetKeysInBinaryTreeLayerByLayer {
	//laicode
	public List<List<Integer>> layerBylayer(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);  // initial state
		while (!queue.isEmpty()) {
			// the list storing all the nodes on the current level.
			List<Integer> curLayer = new ArrayList<Integer>();
			// the size of current level.
			int size = queue.size();
			// traverse all the nodes on the current level and
			// prepare for the next level.
			for (int i = 0; i < size; i++) {
				// why not i < queue.size() ?
				// since queue.size() is dynamic during the for loop
				TreeNode cur = queue.poll();
				curLayer.add(cur.key);
				if (cur.left != null) {
					queue.offer(cur.left);
				}
				if (cur.right != null) {
					queue.offer(cur.right);
				}
			}
			list.add(curLayer);
		}
		return list;
	}
	
	// print
	public void PrintNodesByLevel(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> q = new ArrayDeque<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size(); // size = # of nodes in the cur layer.
			for (int i = 0; i < size; i++) {
				TreeNode n = q.poll();
				if (n.left != null) {
					q.offer(n.left);
				}
				if (n.right != null) {
					q.offer(n.right);
				}
				System.out.print(n.key + " ");
			}
			System.out.println(); 
		}
	}
	//Time = O(n)
	//Space = O(n)
	
}
