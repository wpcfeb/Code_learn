package sliver;

public class Question96 {
	public static void main() {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		// line n1
		
	}
}

class Employee {
	public int salary;
}

class Manager extends Employee {
	public int budget;
}

class Director extends Manager {
	public int stockOptions;
}
