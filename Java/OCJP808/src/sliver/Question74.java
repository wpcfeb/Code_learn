package sliver;

/**
 * 鎶婁粖澶╂渶濂界殑琛ㄧ幇褰撲綔鏄庡ぉ鏈�鏂扮殑璧风偣锛庯紟锝�
 * 銇勩伨 鏈�楂樸伄琛ㄧ従 銇ㄣ仐銇� 鏄庢棩鏈�鏂般伄濮嬬櫤锛庯紟锝�
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/20 17:23
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question74 {
    int x;

    Question74() {
//    	this(); //造成循环构造
        this(10);
        System.out.println("调用了父类无参构造方法");
    }

    Question74(int x) {
        this.x = x;
        System.out.println("调用了父类有参构造方法");
        
    }
    static class Car extends Question74 {
    	int y;
    	
        Car() {
 //           super();
            //super与this关键字不能同时出现在同一个构造函数中调用其他的构造函数。
        	//因为this 方法与super方法都必须处于构造方法的第一行，冲突导致出错
           // this(10);
            System.out.println("调用了子类无参构造方法");

        }

        Car(int y) {
            this.y = y;
            System.out.println("调用了子类有参构造方法");
        }
    }
    public static void main(String[] args) {
//    	Question74 Q1 = new Question74();
//    	System.out.println(Q1.x);
    	Car C1 = new Car();
    }
}
