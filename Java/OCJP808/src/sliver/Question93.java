package sliver;

public class Question93 {
	public static void main(String[] args) {
		String[][] arra = new String[3][];
		arra[0] = new String[] { "rose", "lily" };
		arra[1] = new String[] { "apple", "berry", "cherry", "grapes" };
		arra[2] = new String[] { "beans", "carrot", "potato" };
		for (int i = 0; i < arra.length; i++) {
			for (int j = 0; j < arra[i].length; j++) {
				arra[i][j] = arra[i][j].toUpperCase();
				System.out.print(arra[i][j] + " ");
			}
		}

	}
}
