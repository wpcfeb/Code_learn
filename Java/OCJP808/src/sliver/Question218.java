package sliver;

interface DoInterface {
	void method1(int n1); // line n1
	
}

class DoClass implements DoInterface {
	public DoClass(int p1) {
	}
	
	public void method1(int p1) {
	} // line n2
	
	private void method2(int p1) {
	} // line n3
}

public class Question218 {
	public static void main(String[] args) {
		DoInterface doi = new DoClass(100); // line n4
		doi.method1(100);
//		doi.method2(100);
	}
}
