package Sort;

public class Q4_SelectionSort {
	public int[] solve(int[] array) {
		// check null before check any other things.
		// check other conditions - empty array... etc.
		if (array == null || array.length <= 1) {
			return array;
		}
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			// find the min element in the subarray of (i, array.length - 1)
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, i, min);
		}
		return array;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
