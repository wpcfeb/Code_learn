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
 * Date    : 2017/11/22 10:32
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question50 {
    public static void main(String[] args) {
        char x = 8;
        int z = '8';
        System.out.println("Value of Z:" + z);
        System.out.println(doMsg(x));
        System.out.print(doMsg(z));
    }

    private static String doMsg(char x) {
        return "Good Day!";
    }

    private static String doMsg(int y) {
        return "Good Luck!";
    }
}