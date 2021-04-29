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
 * Date    : 2017/11/16 16:35
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question25 {
    public static void main(String[] args) {
        boolean isChecked = false;
        int arr[] = {1, 3, 5, 7,8, 9};
        int index = arr.length;
        while (index > 0) {
            if (arr[index - 1] % 2 == 0) {
                isChecked = true;
            }
            index--;
        }
        while(true);
        System.out.println(arr[index] + "," + isChecked);
    }
}
