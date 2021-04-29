package sliver;

public class Question92 {
	public static void main(String[] args) {
		C c = new C();
	}
}

class Aa {
	public Aa() {
		System.out.print("Aa ");
	}
}

class B extends Aa {
	public B() {
		System.out.print("B ");
	}
}

class C extends B {
	public C() {
		System.out.print("C ");
	}

}