package sliver;

/**
 * 鎶婁粖澶╂渶濂界殑琛ㄧ幇褰撲綔鏄庡ぉ鏈�鏂扮殑璧风偣锛庯紟锝� 銇勩伨 鏈�楂樸伄琛ㄧ従 銇ㄣ仐銇� 鏄庢棩鏈�鏂般伄濮嬬櫤锛庯紟锝� Today the
 * best performance as tomorrow newest starter!
 *
 * @author : xiaomo github : https://github.com/xiaomoinfo email :
 *         xiaomo@xiaomo.info QQ : 83387856 Date : 2017/11/22 17:39 desc :
 *         Copyright(漏) 2017 by xiaomo.
 */
public class Question171 {
	public static void main(String[] args) {
		Boolean[] bool = new Boolean[2];
		bool[0] = new Boolean(Boolean.parseBoolean("true"));
		bool[1] = new Boolean(null);
		System.out.println(bool[0] + " " + bool[1]);

//		String s = "true";
//		System.out.println(Boolean.getBoolean(s));// false
//		System.setProperty(s, "true");
//		System.out.println(Boolean.getBoolean(s));// true

	}
}
