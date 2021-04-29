package V10_02;

class Employee {
	String name;
	boolean contract;
	double salary;
	Employee() {
//		this.name = new String("Joe");	// line n1
//		this.contract = new Boolean(true);
//		this.salary = new Double(100);
		name = "joe";
		contract = TRUE; // ²»Ê¶±ðTRUE
		salary = 100.0f;
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}
}
public class Question25 {
	public static void main(String[] args) {
		Employee e = new Employee();
		// line n2
		System.out.print(e);
	}
}
