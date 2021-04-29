package sliver;

public class Question87 {
	private boolean flag;

	public void displaySeries() {
		int num = 2;
		while (flag) {
			if (num % 7 == 0)
				flag = false;
			System.out.print(num);
			num += 2;

		}
	}

	public static void main(String[] args) {
		new Question87().displaySeries();
	}

}
