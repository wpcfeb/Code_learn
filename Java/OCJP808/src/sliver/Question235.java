package sliver;

public class Question235 {
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));
		// line n1
//		acct.amount = 0;
//		acct.changeAmount(-acct.amount);
//		acct.changeAmount(-acct.getAmount());
		System.out.println(acct.getAmount());
	}
}

class CheckingAccount {
	public int amount;

	public CheckingAccount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void changeAmount(int x) {
		amount += x;
	}
}
