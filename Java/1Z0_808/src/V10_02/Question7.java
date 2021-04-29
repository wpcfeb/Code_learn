package V10_02;

public class Question7 {
    class Vehicle{
        String type = "4W";
        int maxSpeed = 100;

        public Vehicle(String type, int maxSpeed) {
            this.type = type;
            this.maxSpeed = maxSpeed;
        }
    }

    class Car extends Vehicle{
        String trans;
        Car(String trans){		//line n1
//        	super("1", 3);
            this.trans = trans;	
        }

        public Car(String type, int maxSpeed) {
            super(type, maxSpeed);
            this(trans);		//line n2
//     super this 都需要位于构造函数中的第一个语句，所以不能同时出现在一个构造函数中
        }
    }
}