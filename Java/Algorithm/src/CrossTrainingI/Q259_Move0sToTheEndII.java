package CrossTrainingI;

import java.util.Arrays;

public class Q259_Move0sToTheEndII {
	public int[] moveZero(int[] array) {
		// Assumptions: array is not null.
		if (array == null || array.length <= 1) {
			return array;
		}
		int n = array.length;
		int slow = 0;
		int fast = 0;
		while (fast < n) {
			if (array[fast] != 0) {
				swap(array, slow, fast);
				slow++;
			} else {
				fast++;
			}
		}
		return Arrays.copyOf(array, fast);
	}
	
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
