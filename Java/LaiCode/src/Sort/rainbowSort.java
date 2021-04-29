package Sort;

import java.util.Arrays;

public class rainbowSort {

	public static void rainbowSort(int[] array) {
		int i = 0, j = 0, k = array.length - 1;
		while (j <= k) {
			if (array[j] == 1) {
				swap(array, i, j);
				i++;
				j++;

			}else if (array[j] == 3) {
				swap(array, j, k);
				k--;
			}else {
				j++;
			}
		}
	}

	static public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 1, 1, 2, 2, 1, 2, 2, 3, 1 };
		rainbowSort(array);
		System.out.println(Arrays.toString(array));

	}
}
