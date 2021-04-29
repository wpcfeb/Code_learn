package sliver;

class Base{
	public void test() {
		System.out.println("Base ");
	}
	public void father() {
		
	}
}

class DerivedA extends Base{
	public void test() {
		System.out.println("DerivedA ");
	}
	public void son() {
		
	}
}

class DerivedB extends DerivedA{
//class DerivedB extends Base{
	public void test() {
		System.out.println("DerivedB ");
	}
}

public class Question51 {
	public static void main(String[] args) {
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		Base test = new Base();
		b1 = (Base) b3;
		Base b4 = (DerivedA) b3;
		//如果DerivedB extends Base，这句会报错，因为子类之间不能相互转化
		b1.test();
		b4.test();
	}

}
