package sliver;

public class Question159 {
	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		sc = asc;
		System.out.println("sc: " + sc.getClass());
		System.out.println("asc: " + asc.getClass());

	}
}

class SampleClass {

}

class AnotherSampleClass extends SampleClass {
	
}


