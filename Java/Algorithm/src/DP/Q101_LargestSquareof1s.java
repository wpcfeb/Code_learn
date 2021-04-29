/**
 * 
 */
package DP;

/**
 * @author wangp
 *
 */
public class Q101_LargestSquareof1s {
	public int largest(int[][] matrix) {
		// Assumptions: The matrix is a binary matrix
		// (only contains 0 or 1 as the values),
		// it is not null, and has size N*N, N >= 0
		int N = matrix.length;
		if (N == 0) {
			return 0;
		}
		int result = 0;
		// M[i][j] means the largest square of 1's with right bottom
		// corner as matrix[i][j].
		int[][] M = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == 0 || j == 0) {
					M[i][j] = matrix[i][j] == 1 ? 1 : 0;
				} else if (matrix[i][j] == 1) {
					M[i][j] = Math.min(M[i][j - 1] + 1, M[i - 1][j] + 1);
					M[i][j] = Math.min(M[i - 1][j - 1] + 1, M[i][j]);
				}
				result = Math.max(result, M[i][j]);
			}
		}
		return result;
	}

}
