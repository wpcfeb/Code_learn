package V10_02;

public class Question114 {
	public static void main(String[] args) {
		int data[] = {2010, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for (int e : data) {
			if (e != key) {
				continue;
				count++;
			}
		}
		System.out.print(count + "Found");
	}
}
