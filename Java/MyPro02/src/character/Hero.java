package character;

 
public class Hero {
   
    public static void main(String[] args) {
        String str1 = "the";
        
        StringBuffer sb = new StringBuffer(str1);
         
        System.out.println(sb.length()); //���ݳ���
         
        System.out.println(sb.capacity());//�ܿռ�
    }
      
}
