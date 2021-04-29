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
 * Date    : 2017/11/16 15:55
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question23 {
    public static void main(String[] args) {
        try {
            String [] arr = new String[4];
            arr[1] = "Unix";
            arr[2] = "Linux";
            arr[3] = "Solarios";

            for (String s : arr) {
                System.out.print(s +" ");
            }
        } catch (Exception e){
            System.out.println(e.getClass());
        }
        // null Unix Linux Solarios
    }
}
