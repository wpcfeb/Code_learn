package sliver;

//
///**
// * 鎶婁粖澶╂渶濂界殑琛ㄧ幇褰撲綔鏄庡ぉ鏈�鏂扮殑璧风偣锛庯紟锝�
// * 銇勩伨 鏈�楂樸伄琛ㄧ従 銇ㄣ仐銇� 鏄庢棩鏈�鏂般伄濮嬬櫤锛庯紟锝�
// * Today the best performance  as tomorrow newest starter!
// *
// * @author : xiaomo
// * github  : https://github.com/xiaomoinfo
// * email   : xiaomo@xiaomo.info
// * QQ      : 83387856
// * Date    : 2017/11/17 17:32
// * desc    :
// * Copyright(漏) 2017 by xiaomo.
// */
public class Question61 {
	static String[][] arr = new String[3][];
// AnswerC
	private static void doPrint() {
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i].length - 1;
			System.out.print(arr[i][j]);
		}
	}
//	
//AnswerA
//	private static void doPrint() {
//		int i = 0;
//		for (String[] sub : arr) {
//			int j = sub.length - 1;
//			for (String str : sub) {
//				System.out.println(str[j]);
//				i++;
//			}
//		}
//	}
//AnswerB
//	private static void doPrint() {
//		int i = 0;
//		for (String[] sub : arr) {
//			int j = sub.length; //OutOfBound
//			System.out.print(arr[i][j]);
//			i++;
//		}
//	}
//AnswerD
//	private static void doPrint() {
//		for (int i = 0; i < arr.length - 1; i++) {
//			int j = arr[i].length - 1;
//			System.out.print(arr[i][j]);
//			i++;// need to delete this line, and change i < arr.length
//		}
//	}

	public static void main(String[] args) {
		String[] class1 = { "A", "B", "C" };
		String[] class2 = { "L", "M", "N", "O" };
		String[] class3 = { "I", "J" };
		arr[0] = class1;
		arr[1] = class2;
		arr[2] = class3;
		Question61.doPrint();
	}
}
