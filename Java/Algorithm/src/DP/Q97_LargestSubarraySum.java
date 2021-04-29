package DP;
import java.util.*;
public class Q97_LargestSubarraySum {
	public static void main(String[] args) {
		int[] array = {1, 2, -4, 4, -1};
		Q97_LargestSubarraySum s = new Q97_LargestSubarraySum();
		
		System.out.println(Arrays.toString(s.largestSumWithBorder(array)));
		
	}
	public int largestSum(int[] array) {
		int[] M = new int[array.length];
		M[0] = array[0];
		int globalMax = array[0];
		for (int i = 1; i < array.length; i++) {
			M[i] = Math.max(M[i - 1] + array[i], array[i]);
			globalMax = Math.max(globalMax, M[i]);
		}
		return globalMax;
		// Time = O(n)
		// Space = O(n)
	}
	
	// Follow up1: how to optimize space to O(1)
	public int largestSum1(int[] array) {
		// Assumptions: array != null && length >= 1
		// The subarray must contain at least one element.
		int lastMax = array[0];
		int globalMax = array[0];
		for (int i = 1; i < array.length; i++) {
			// lastMax == M[i - 1]
			lastMax = Math.max(lastMax + array[i], array[i]);
			// lastMax == M[i] 
			globalMax = Math.max(globalMax, lastMax);
		}
		return globalMax;
		// Time = O(n)
		// Space = O(1)
	}
	
	// Follow up2: how to return the left-right border of the solution?
	public int[] largestSumWithBorder(int[] array) {
		int lastMax = array[0];
		int globalMax = array[0];
		int globalLeft = 0;
		int globalRight = 0;
		int currentLeft = 0;
		int currentRight = 0;
		for (int i = 1; i < array.length; i++) {
			// lastMax == M[i - 1]
			if (lastMax < 0) {
				lastMax = array[i];
				currentLeft = i;
				currentRight = i;
			} else {
				lastMax = lastMax + array[i];
				currentRight = i;
			}
			// lastMax == M[i] 
			if (lastMax > globalMax) {
				globalMax = lastMax;
				globalLeft = currentLeft;
				globalRight = currentRight;
			}
		}
		return new int[] {globalLeft, globalRight, globalMax};
	}

}
