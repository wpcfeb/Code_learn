package sliver;

import java.util.ArrayList;

public class Question109 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("SE");
		list.add("EE");
		list.add("ME");
		list.add("SE");
		list.add("EE");
		list.remove("SE");
		System.out.println("Values are : " + list);
	}

}
