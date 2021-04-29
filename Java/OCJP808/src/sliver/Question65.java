package sliver;

import java.awt.List;
import java.util.ArrayList;

import sliver.bean.Contract;

class Super implements Contract{
	
};
class Sub extends Super{
	
}

public class Question65 {
	public static void main(String[] args) {
		ArrayList objs = new ArrayList();
		Contract c1 = new Super();
		Contract c2 = new Sub();
		Super s1 = new Sub();
		objs.add(c1);
		objs.add(c2);
		objs.add(s1);
		for(Object itm: objs) {
			System.out.println(itm.getClass().getName());
		}
		
	}
}
