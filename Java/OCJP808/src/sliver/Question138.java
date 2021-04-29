package sliver;

public class Question138 {
	public static void main(String[] args) {
		int[] a = new int[4];
		a[5] = 5;//OutofBound
		
		a[0] = 1;
		a[1] = 1;
		int b = 1/(a[0] - a[1]);//ArithmeticException
	}

}
