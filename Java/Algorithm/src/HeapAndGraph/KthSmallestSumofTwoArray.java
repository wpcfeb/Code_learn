package HeapAndGraph;

import java.util.*;

public class KthSmallestSumofTwoArray {
	
	public static void main(String[] args) {
		int[] A = {1, 3, 5};
		int[] B = {4, 8};
		int k = 5;
		KthSmallestSumofTwoArray s = new KthSmallestSumofTwoArray();
		System.out.println(s.kthSmallest(A, B, k));
	}

	public int kthSmallest(int[] A, int[] B, int k) {
	    PriorityQueue<Cell> minHeap = new PriorityQueue<Cell>(k, new Comparator<Cell>(){
	       public int compare(Cell c1, Cell c2) {
	         if (c1.sum == c2.sum) {
	            return 0; 
	         }
	         return c1.sum < c2.sum ? -1 : 1;
	       }
	    });
	    boolean[][] visited = new boolean[A.length][B.length];
	    minHeap.offer(new Cell(0, 0, A[0], B[0]));
	    visited[0][0] = true;
	    // iterate k -1 rounds;
	    for (int i = 0; i < k - 1; i++) {
	       Cell cur = minHeap.poll();
	       if (cur.index1 + 1 < A.length && !visited[cur.index1 + 1][cur.index2]) {
	          minHeap.offer(new Cell(cur.index1 + 1, cur.index2, A[cur.index1 + 1], B[cur.index2])); 
	          visited[cur.index1 + 1][cur.index2] = false;
	       }
	       if (cur.index2 + 1 < B.length && !visited[cur.index1][cur.index2 + 1]) {
	          minHeap.offer(new Cell(cur.index1, cur.index2 + 1, A[cur.index1], B[cur.index2 + 1]));
	          visited[cur.index1][cur.index2 + 1] = false;
	       }
	    }
	    return minHeap.peek().sum;
	}

	static class Cell {
		int index1;
		int index2;
		int sum;

		Cell(int index1, int index2, int value1, int value2) {
			this.index1 = index1;
			this.index2 = index2;
			sum = value1 + value2;

		}
	}

}
