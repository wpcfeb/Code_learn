package V10_02;

import java.util.*;
//���remove�б�����û�еĲ��ᱨ��
public class Question26 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		
		if (names.remove("Bran")) {
			names.remove("Jon");
//			names.remove("123123");
		}
		System.out.println(names);
	}
}
