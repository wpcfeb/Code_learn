package BinarySearch;

public class Closest {
	public static int closest(int[] array, int target) {
		// Write your solution here
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0, right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid;
			} else {
				right = mid;
			}

		}
		return Math.abs(array[left] - target) < Math.abs(array[right] - target) ? left : right;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 9 };
		System.out.println(closest(array, 8));

	}

}
