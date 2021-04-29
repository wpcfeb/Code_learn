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
 * Date    : 2017/11/22 10:42
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question45 {

	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}
	
	void checkCard(int cardNo) throws RuntimeException {// line n1
		System.out.println("Checking Card");
	}
	
    public static void main(String[] args) {
        Question45 ex = new Question45();
        int cardNo = 12344;
        ex.checkCard(cardNo);  // line n2
//        ex.readCard(cardNo); // line n3
    }

}
