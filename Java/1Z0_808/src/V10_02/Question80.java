package V10_02;

class Caller {
	private void init () {
		System.out.println("Initialized");
	}
	private void start () {
		init();
		System.out.println("Started");
	}
}
public class Question80 {
	public static void main (String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();
	}
}
