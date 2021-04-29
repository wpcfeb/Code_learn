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
 * Date    : 2017/11/22 10:37
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question58 {
    public static void main(String[] args) {
        int avar = 9;
        if ((avar++)< 10) {
            System.out.println(avar + " Hello World");
        } else {
            System.out.println(avar + " Hello Universe");
        }
        
        int avar1 = 9;
        if ((avar1 = avar1 + 1)< 10) {
            System.out.println(avar1 + " Hello World");
        } else {
            System.out.println(avar1 + " Hello Universe");
        }
        
    }
}
