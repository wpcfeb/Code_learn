package sliver;

public class Question227 {
	public static void main(String[] args) {
		int ar1[] = {2, 4, 6, 8};
		int ar2[] = {1, 3, 5, 7, 9};
		ar2 = ar1;
		for(int e2 : ar2) {
			System.out.println(" " + e2);
		}
		
	}

}
