package HeapAndGraph;
import java.util.*;
/**
 * Find the smallest k elements in an unsorted array. Assumptions: 1) array is
 * not null 2) k >= 0 and k <= array.length
 */
public class Q25_KSmallestInUnsortedArray {
	// Method 1: K sized max heap
	public int[] kSmallest(int[] array, int k) {
		// Comparator do not accept k == 0 , so we need sanity check
		if (array.length == 0 || k == 0) {
			return new int[0];
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// do not use "==" here !!!
				if (o1.equals(o2)) {
					return 0;
				}
				return o1 > o2 ? -1 : 1;
			}
		});
		for (int i = 0; i < array.length; i++) {
			if (i < k) {
				// offer the first k elements into max heap.
				// NOTICE: if you want to utilize heapify(), the only thing you can do
				// is to call a certain constructor of PriorityQueue.
				maxHeap.offer(array[i]);
			} else if (array[i] < maxHeap.peek()) {
				// for the other elements, only offer it into the max heap if it is
				// smaller than the max value in the max heap.
				maxHeap.poll();
				maxHeap.offer(array[i]);
			}
		}
		int[] result = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			result[i] = maxHeap.poll();
		}
		return result;
	}
}
