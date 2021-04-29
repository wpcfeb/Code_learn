package file;
   
import java.io.File;
   
public class TestFile {
      
    static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile = null;
    static File maxFile = null;
      
    //ʹ�õݹ�������һ���ļ��е����ļ�
    public static void listFiles(File file){
        if(file.isFile()){
            if(file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            if(file.length()!=0 && file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
            return;
        }
          
        if(file.isDirectory()){
            File[] fs = file.listFiles();
            if(null!=fs)
            for (File f : fs) {
                listFiles(f);
            }
        }
    }
   
    public static void main(String[] args) {
        File f = new File("c:\\windows");
        listFiles(f);
        System.out.printf("�����ļ���%s�����С��%,d�ֽ�%n",maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("��С���ļ���%s�����С��%,d�ֽ�%n",minFile.getAbsoluteFile(),minFile.length());
   
    }
}