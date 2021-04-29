package sliver;

public class Question217 {
	public static void main(String[] args) {
		String a = "1234";
		String b = "456";
		String str = a.equals("123") ? "123" : (b.equals("456") ? "456" : "789");

//      如果a等于123     就给str赋值123 否则 如果b等于456  就给str赋值123  前面两个如果都不成立就赋值789
		System.out.println(str);
	}
}
