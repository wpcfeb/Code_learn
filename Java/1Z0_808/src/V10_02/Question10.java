package V10_02;

public class Question10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)){
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())){
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
        
        System.out.println(sb);
        System.out.println(s);
//        System.out.println(sb == s);
        
        System.out.println(sb.toString());
        System.out.println(s.toString());
        System.out.println(sb.toString() == s.toString());
// == 比较的是地址
    }
}
