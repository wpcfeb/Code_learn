package collection;
  
import java.util.HashMap;
  
import charactor.Hero;
  
public class TestCollection {
    public static void main(String[] args) {
        HashMap<String,Hero> heroMap = new HashMap<String,Hero>();
         
        heroMap.put("gareen", new Hero("gareen1"));
        System.out.println(heroMap);
         
        //keyΪgareen�Ѿ���value�ˣ�����gareen��Ϊkey�������ݣ��ᵼ��ԭӢ�ۣ�������
        //���������µ�Ԫ�ص�Map��
        heroMap.put("gareen", new Hero("gareen2"));
        System.out.println(heroMap);
         
        //���map
        heroMap.clear();
        Hero gareen = new Hero("gareen");
         
        //ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);
        heroMap.put("test", gareen);
        System.out.println(heroMap);
         
    }
}