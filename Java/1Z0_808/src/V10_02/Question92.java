package V10_02;

class Animal {
	String type = "Canine";
	int maxSpeed = 60;

	Animal() {
	}

	Animal(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class WildAnimal extends Animal {
	String bounds;

	WildAnimal(String bounds) {
		//line 1
		
		super(); //  or  this("Canine", 60, "Long"); or Super("Canine", 60)
		this.bounds = bounds;
	}

	WildAnimal(String type, int maxSpeed, String bounds) {
		//line 2
		super(type, maxSpeed);
		this.bounds = bounds;
	}
}

public class Question92 {
	public static void main(String[] args) {
		WildAnimal wolf = new WildAnimal("Long");
		WildAnimal tiger = new WildAnimal("Feline", 80, "Short"); // Argument ¡°Short is missing in the question
		System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
		System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
	}
}
