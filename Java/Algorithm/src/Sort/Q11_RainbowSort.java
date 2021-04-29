package Sort;

public class Q11_RainbowSort {
	public int[] rainbowSort(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}
		//three bounds:
		//1. the left side of neg is -1 (exclusive of neg).
		//2. the right side of one is 1 (exclusive of one).
		//3. the part between neg and zero is 0 (exclusive of zero).
		//4. between zero and one is to be discovered. (inclusive of both).
		int i = 0;
		int j = 0;
		int k = array.length - 1;
		while (j <= k) {
			if (array[j] == -1) {
				swap(array, i++, j++);
			} else if (array[j] == 0) {
				j++;
			} else {
				swap(array, j, k--);
			}
		}
		return array;
	}
	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
