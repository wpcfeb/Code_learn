package HeapAndGraph;
import java.util.*;
public class Q62_AllSubsetsI {
	
	
	public static void main(String[] args) {
		Q62_AllSubsetsI s1 = new Q62_AllSubsetsI();
		char[] input = {'a', 'b', 'c'};
		int index = 0;
		StringBuilder solutionPrefix = new StringBuilder();
		s1.findSubset(input, index, solutionPrefix);
	}
	//index: ²ãÊý
	//For a -> index = 0, For b -> index = 1, For c -> index = 2, null -> index = 3;
	//StringBuilder 
	//	
	void findSubset(char[] input, int index, StringBuilder solutionPrefix) {
		//System.out.println(index + " " + solutionPrefix);//test
		if (index == input.length) {
			System.out.println(index + " " + solutionPrefix);
			return;
		}
		// Case 1: add input[index] to the solution prefix.
		solutionPrefix.append(input[index]);	//³Ô
		findSubset(input, index + 1, solutionPrefix);  // Breaking point.
		solutionPrefix.deleteCharAt(solutionPrefix.length() - 1);  // ÍÂ£¡£¡£¡
	
		//Case 2: do not add input[index] to the solution prefix.
		findSubset(input, index + 1, solutionPrefix);
	}
	
	// LaiCode
	// method 1: recommended DFS solution.
	public List<String> subSets(String set) {
		List<String> result = new ArrayList<String>();
		if (set == null) {
			return result;
		}
		char[] arraySet = set.toCharArray(); //String to Char
		//record the current subset.
		StringBuilder sb = new StringBuilder();	
		helper(arraySet, sb, 0, result);
		return result;
	}
	// at each level, determine the character at the position "index" to be picked
	// or not.
	private void helper(char[] set, StringBuilder sb, int index, List<String> result) {
		// terminate condition:
		// when we finishes determining for all the characters pick or not,
		// we have a complete subset.
		if (index == set.length) {
			result.add(sb.toString());
			return;
		}
		// 1. not pick the character at index.
		helper(set, sb, index + 1, result);
		// 2. pick the chatacter at index
		helper(set, sb.append(set[index]), index + 1, result);
		// remember to remove the added character when back tracking to the previous level.
		sb.deleteCharAt(sb.length() - 1);
	}
}
