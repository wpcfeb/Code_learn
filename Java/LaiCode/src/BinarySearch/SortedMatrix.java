package BinarySearch;

public class SortedMatrix {
	public static int[] searchMatrix(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new int[]{-1, -1};
			
		}
		int m = matrix.length, n = matrix[0].length;
		int l  = 0, r = m * n -1;
		while(l <= r) {
			int mid = l + (r - l)/2;
			if (target == matrix[mid / n][mid % n]) {
				return new int[] {mid / n, mid % n};
			}else if (target < matrix[mid / n][mid % n]) {
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		return  new int[]{-1, -1};
	}

}
