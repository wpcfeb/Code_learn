package character;

public class Accumulator {
	int sum;

	public void add(int x) {
		sum += x;
	}

	public int sum() {
		return sum;
	}

	public static void main(String[] args) {
		int array[][] = {{1, 2}, {3, 4}, {5, 6}};
		for( int[] i : array) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
