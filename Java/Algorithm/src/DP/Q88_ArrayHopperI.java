package DP;

public class Q88_ArrayHopperI {
	// Method 2: DP, canJump[i] means from index i,
	// can jump to index array.length - 1 (recommended).
	public boolean canJumpII(int[] array) {
		// Assumptions: array is not null and is not empty.
		if (array.length == 1) {
			return true;
		}
		boolean[] canJump = new boolean[array.length];
		for (int i = array.length - 2; i >= 0; i--) {
			// if from index i, it is already possible to jump
			// to the end of the array.
			if (i + array[i] >= array.length - 1) {
				canJump[i] = true;
			} else {
				// if any of the reachable indices from index i
				// is reachable to the end of the array.
				for (int j = array[i]; j >= 1; j--) { // from farmost distance
					if (canJump[j + i]) {
						canJump[i] = true;
						break;
					}
				}
			}
		}
		return canJump[0]; // question request
	}
}
