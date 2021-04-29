package sliver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 鎶婁粖澶╂渶濂界殑琛ㄧ幇褰撲綔鏄庡ぉ鏈�鏂扮殑璧风偣锛庯紟锝�
 * 銇勩伨 鏈�楂樸伄琛ㄧ従 銇ㄣ仐銇� 鏄庢棩鏈�鏂般伄濮嬬櫤锛庯紟锝�
 * Today the best performance  as tomorrow newest starter!
 *
 * @author : xiaomo
 * github  : https://github.com/xiaomoinfo
 * email   : xiaomo@xiaomo.info
 * QQ      : 83387856
 * Date    : 2017/11/15 19:24
 * desc    :
 * Copyright(漏) 2017 by xiaomo.
 */
public class Question06 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, 6, 30);
        LocalDate date3 = LocalDate.parse("2014-06-30", DateTimeFormatter.ISO_DATE);
//        LocalDate date3 = LocalDate.parse("2014-06-40", DateTimeFormatter.ISO_DATE);//报错
        //严格按照 yyyy-MM-dd 验证
        System.out.println(date1);  // 褰撳墠鏃堕棿
        System.out.println(date2);  // 2014-06-20
        System.out.println(date3);  // 2014-06-20
    }
}
