package sliver;

public class Question217 {
	public static void main(String[] args) {
		String a = "1234";
		String b = "456";
		String str = a.equals("123") ? "123" : (b.equals("456") ? "456" : "789");

//      ���a����123     �͸�str��ֵ123 ���� ���b����456  �͸�str��ֵ123  ǰ������������������͸�ֵ789
		System.out.println(str);
	}
}
