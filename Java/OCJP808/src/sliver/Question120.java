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
 * Date    : 2017/11/22 14:17
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question120 {
    public static void main(String[] args) {
        String str1= "Java";
        char str2[] = {'J','a','v','a'};
        String str3 = null;
        for (char c : str2) {
            str3 = str3 + c;
            System.out.println(str3);
        }
        if (str1.equals(str3))
            System.out.println("Successful");
        else
            System.out.println("Unsuccessful");
    }
}
