package V10_02;

//抽象类必须有抽象方法
//继承类Cannot reduce the visibility of the inherited method 
//默认是default
//这题选CD, E不对
abstract class Planet {
	protected void revolve() { //line n1
	}
	abstract void rotate(); //line n2
}
class Earth extends Planet {
	 void revolve() {		//line n3
	}
	protected void rotate() { //line n4
	}
}

public class Question6 {

}
