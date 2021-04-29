package V10_02;

public class Question58 {
  String name;
  int age = 25;

  public Question58(String name) {
      this();                   // line n1
      setName(name);
  }

  public Question58(String name, int age) {
      Question58(name);          // line n2
      setAge(age);
  }

  public static void main(String[] args) {
      Question58 one = new Question58("Jesse");
      Question58 two = new Question58("Walter", 52);
      System.out.println(one.show());
      System.out.println(two.show());
  }

  public String show() {
      return name + " " + age + number;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

}
