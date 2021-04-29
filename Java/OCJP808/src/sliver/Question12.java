package sliver;

import java.util.ArrayList;
import java.util.List;

/**
 * 鎶婁粖澶╂渶濂界殑琛ㄧ幇褰撲綔鏄庡ぉ鏈�鏂扮殑璧风偣锛庯紟锝�
 * 銇勩伨 鏈�楂樸伄琛ㄧ従 銇ㄣ仐銇� 鏄庢棩鏈�鏂般伄濮嬬櫤锛庯紟锝�
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/21 17:38
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question12 {
    public static void main(String[] args) {
        List ps = new ArrayList();
        Patient p2 = new Patient("Mike");
        ps.add(p2);
        Patient p = new Patient("Mike");
        int f = ps.indexOf(p2);
//        ps.add(p);
//        int f1 = ps.indexOf(p);
//        System.out.println(f1);
        System.out.println(f);
        if (f >= 0) {
            System.out.println("Mike Found");
        }

    }

    static class Patient {
        String name;

        public Patient(String name) {
            this.name = name;
        }
    }
}
