package HeapAndGraph;

public class PrintAlltheIfBlock {
	public static void main(String[] args) {
		PrintAlltheIfBlock s = new PrintAlltheIfBlock();
		s.printBlocks(6);
	}
	
	// DFS
	// driver method that takes in a number represents the number of if { and } it will have
	public void printBlocks(int n) {
		if (n <= 0) return;
		char[] curr =  new char[2 * n];
		helper(n, n, 0, curr);
	}
	
	private void helper(int leftRemain, int rightRemain, int index, char[] curr) {
		// base case
		if (leftRemain == 0 && rightRemain == 0) {
			printBlock(curr);
			return;
		}
		
		if (leftRemain > 0) {
			curr[index] = '{';
			helper(leftRemain - 1, rightRemain, index + 1, curr);
		}
		
		if (rightRemain > leftRemain) {
			curr[index] = '}';
			helper(leftRemain, rightRemain - 1, index + 1, curr);
		}
	}
	
	// print the corrected format from valid { and } string
	private void printBlock(char[] curr) {
		int space = 0;
		for (int i = 0; i < curr.length; i++) {
			if (curr[i] == '{') {
				printSpace(space);
				System.out.println("if {");
				space += 2;
			} else {
				space -= 2;
				printSpace(space);
				System.out.println("}");
			}
		}
		System.out.println();
	}
	// print the space for indentation
	private void printSpace(int n) {
		while (n > 0) {
			System.out.print(" ");
			n--;
		}
	}
}
