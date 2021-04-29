package sliver;

import java.util.*;

public class Question114 {
	public static List data = new ArrayList();
	static List update(String[] strs)
	{
		for (String x : strs) {
			data.add(x);
		}
		return data;
	}
	
	public static void main(String[] args) {
		String[] d = {"a", "b", "c"};
		update(d);
		for (String s : d) {
			System.out.print(s + " ");
			
		}
	}
	

}
