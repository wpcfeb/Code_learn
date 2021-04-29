package V10_02;

public class Question19 {
	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("Checking Card");
	}
	public static void main(String[] args) {
		Question19 ex = new Question19();
		int cardNo = 12344;
		ex.checkCard(cardNo);
		ex.readCard(cardNo);
	}
}
