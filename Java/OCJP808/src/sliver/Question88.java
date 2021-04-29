package sliver;

public class Question88 {
	public static void main(String[] args) {
		float a = 12_345.01F;
		System.out.println(a);
		float b = 123_45.00F;
		System.out.println(b);
		float var1 = (12_345.01 >= 123_45.00)? 12_456 : 124_56.02f;
		float var2 = var1 + 1024;
		System.out.println(var2);
	}

}
