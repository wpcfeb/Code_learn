package V10_02;

//����������г��󷽷�
//�̳���Cannot reduce the visibility of the inherited method 
//Ĭ����default
//����ѡCD, E����
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
