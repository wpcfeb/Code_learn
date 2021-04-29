package V10_02;

public class Question60 {
	
}
//1. abstract可以没有abstract方法
//2. 一个abstract类可以存在多个abstract方法
//3. abstract方法没有实现体 == 不能加{}
//4.非abstract方法需要有实现体== 需要加{}
abstract class Toy {
	public abstract  int calculatePrice(Toy t);
	public void printToy(Toy t) {
		
	}
}
