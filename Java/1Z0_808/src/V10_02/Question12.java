package V10_02;

public class Question12 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C','D');
//        ta = ta.replace('D', 'A'); //�ú����滻ǰ��ģ�����Ҫ��ֵ������Ч
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
