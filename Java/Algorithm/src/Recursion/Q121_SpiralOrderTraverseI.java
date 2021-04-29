package Recursion;
import java.util.*;
public class Q121_SpiralOrderTraverseI {
	//  Method 1: Recursive traversal.
	public List<Integer> spiral(int[][] matrix) {
		// Assumptions: matrix is N * N, N >= 0, matrix is not null.
		List<Integer> list = new ArrayList<Integer>();
		recursiveTraverse(matrix, 0, matrix.length, list);
		return list;
	}
	private void recursiveTraverse(int[][] matrix, int offset, int size, List<Integer> result) {
		// the base case is when there is only 0 or 1 element left.
		if (size == 0) {
			return;
		}
		// do not forget this base case.
		if (size == 1) {
			result.add(matrix[offset][offset]);
			return;
		}
		for (int i = 0; i < size - 1; i++) {
			result.add(matrix[offset][offset + i]);
		}
		for (int i = 0; i < size - 1; i++) {
			result.add(matrix[offset + i][offset + size - 1]);
		}
		for (int i = size - 1; i >= 1; i--) {
			result.add(matrix[offset + size - 1][offset + i]);
		}
		for (int i = size - 1; i >= 1; i--) {
			result.add(matrix[offset + i][offset]);
		}
		recursiveTraverse(matrix, offset + 1, size - 2, result);
	}
}
