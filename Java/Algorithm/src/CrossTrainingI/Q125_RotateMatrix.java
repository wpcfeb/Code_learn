package CrossTrainingI;

import java.util.Arrays;

public class Q125_RotateMatrix {
	public static void main(String[] args) {
//		int[][] matrix = {{64,10,10,4,23,66,8,56,46},
//				        {24,20,41,68,56,37,34,89,89},
//				        {47,25,100,61,64,62,28,13,2},
//				        {32,28,42,18,58,9,58,55,80},
//				        {51,4,66,60,54,2,59,24,11},
//				        {77,30,10,60,93,50,59,71,51},
//				        {87,57,98,43,76,85,24,42,65},
//				        {4,17,19,28,57,69,10,42,18},
//				        {32,45,57,91,76,6,17,6,71}};
		int[][] matrix = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
		Q125_RotateMatrix s = new Q125_RotateMatrix();
		s.rotateII(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}

	// Method 1: Split into levels and for each level split it into four partitions.
	public void rotate(int[][] matrix) {
		// Assumptions: matrix is not null and has size of N * N, N >= 0.
		int n = matrix.length;
		if (n <= 1) {
			return;
		}
		int round = n / 2;
		for (int level = 0; level < round; level++) {
			int right = n - 2 - level; // right bound
			for (int offset = 0; offset <= right - level; offset++) {
				int temp = matrix[level][level + offset];
				matrix[level][level + offset] = matrix[n - 1 - (level + offset)][level];
				matrix[n - 1 - (level + offset)][level] = matrix[n - 1 - level][n - 1 - (level + offset)];
				matrix[n - 1 - level][n - 1 - (level + offset)] = matrix[level + offset][n - 1 - level];
				matrix[level + offset][n - 1 - level] = temp;
			}
		}
	}

	// Method 2:
	// 1. Mirror the point according to y = x, then
	// 2. Mirror the point according to y axis
	public void rotateII(int[][] matrix) {
		int n = matrix.length;
		if (n <= 1) {
			return;
		}
		mirrorYEX(matrix, n);
		mirrorY(matrix, n);
	}

	// mirror the point by the line of y = x.
	private void mirrorYEX(int[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				swap(matrix, i, j, j, i);
			}
		}
	}

	// mirror the point by y axis.
	private void mirrorY(int[][] matrix, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				swap(matrix, i, j, i, n - 1 - j);
			}
		}
	}

	private void swap(int[][] matrix, int iRow, int iCol, int jRow, int jCol) {
		int temp = matrix[iRow][iCol];
		matrix[iRow][iCol] = matrix[jRow][jCol];
		matrix[jRow][jCol] = temp;
	}

}
