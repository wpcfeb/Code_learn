package sliver;


public class Question75 {
	String name;
	boolean contract;
	double salary;
	Question75(){
		this.name = new String("Joe");
		this.contract = new Boolean(true);
		this.salary = new Double(100);
		
//		name = "Joe";
//		contract = true;
//		salary = 100.0f;
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}
	public static void main(String[] args) {
		Question75 e = new Question75();
		//line n2
		e.name = "Joe";
		e.contract = true;
		e.salary = 100;
		
		System.out.print(e);
	}

}
