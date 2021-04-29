package sliver;

public class Question57 {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
		Question57 obj1 = new Question57();
		Question57 obj2 = new Question57();
		obj1.setType(null);
		obj2.setType("Fresco");
		System.out.print(obj1.getType() + " : " + obj2.getType());
	}

}
