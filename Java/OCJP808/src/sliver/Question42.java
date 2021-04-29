package sliver;

import java.awt.List;
import java.util.*;

class Alpha{
	public String doStuff(String msg) {
		return msg;
	}
}

class Beta extends Alpha{
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
	}
	
}
class Gamma extends Beta{
	public String doStuff(String msg) {
		return msg.substring(2);//��ǰ������ĸ�õ�
	}
}


public class Question42 {
	public static void main(String[] args) {
		ArrayList<Alpha> strs = new ArrayList<Alpha>();
		strs.add(new Alpha());
		strs.add(new Beta());
		strs.add(new Gamma());
		for(Alpha t : strs) {
			System.out.println(t.doStuff("Java"));
		}
		
		
	}

}
