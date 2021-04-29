package V10_02;

public class Question12 {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C','D');
//        ta = ta.replace('D', 'A'); //用后面替换前面的，且需要赋值才能生效
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
