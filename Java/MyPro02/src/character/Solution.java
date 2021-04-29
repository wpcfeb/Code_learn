package character;

import java.util.ArrayList;
import java.util.List;

public class Solution {
 public int sumOfSquare(List<Integer> list) {
    if (list == null || list.isEmpty()) {
	  return 0;
    }
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
    	sum += list.get(i) * list.get(i);
    }
    return sum;
 }
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	List<Integer> list = null;
    	
    	System.out.println(solution.sumOfSquare(list));
    }
    	
    
}

