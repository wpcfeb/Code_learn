package QueueAndStack;
import java.util.*;

public class Q280_SortWith2Stacks {
	public void sort(LinkedList<Integer> s1) {
		if (s1 == null || s1.size() <= 1) {
			return;
		}
		LinkedList<Integer> s2 = new LinkedList<Integer>();
		sort(s1, s2);
	}
	private void sort(Deque<Integer> input, Deque<Integer> buffer) {
		// Method 1
		// input: unsorted elements
		// buffer: (top part) buffer, (bottom part) sorted elements
		// Step 1: sort in descending order and store result in buffer
		while (!input.isEmpty() ) {
			int curMin = Integer.MAX_VALUE;
			int count = 0;
			// shuffle + find curMin
			while (!input.isEmpty()) {
				int cur = input.pollFirst();
				if (cur < curMin) {
					curMin = cur;
					count = 1;
				} else if (cur == curMin) {
					count++;
				}
				buffer.offerFirst(cur);
			}
			// re-shuffle
			while (!buffer.isEmpty() && buffer.peekFirst() >= curMin) {
				// buffer.isEmpty() for first time 
				// buffer.peekFirst() <= curMax: do not affect (top part) buffer
				int tmp = buffer.pollFirst();
				if (tmp != curMin) {
					input.offerFirst(tmp);
				}
			}
			// add curMin
			while (count-- > 0) {
				buffer.offerFirst(curMin);
			}
		}
		// Step 2: move result from buffer to input, so it's in descending order
		while (!buffer.isEmpty()) {
			input.offerFirst(buffer.pollFirst());
		}
	}
}
