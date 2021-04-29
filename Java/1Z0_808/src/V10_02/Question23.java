package V10_02;

public class Question23 {
	public static void main (String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
//		int d = (a < b) ? (a < c) ? a : b : (b < c) ? b : c;
		int d = (a < b) ? ((a < c) ? a : (b < c) ? b ): c;
		System.out.println(d);
	}
}
