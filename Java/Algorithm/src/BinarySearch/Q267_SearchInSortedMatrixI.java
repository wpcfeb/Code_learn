package BinarySearch;

public class Q267_SearchInSortedMatrixI {
	public int[] search(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0) {
			return new int[] {-1, -1};
		}
		int N = matrix.length, M = matrix[0].length;
		int left = 0, right = N * M - 1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			int r = mid / M, c = mid % M;
			if (matrix[r][c] == target) {
				return new int[] {r, c};
			} else if (matrix[r][c] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return new int[] {-1, -1};
	}
}
