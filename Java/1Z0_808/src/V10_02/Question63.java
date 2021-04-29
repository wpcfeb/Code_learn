package V10_02;
//不能直接用private修饰属性
public class Question63 {
	private int doStuff() {
		private int x = 100;
		return x++;
	}
}
