package sliver;

public class Question208 {
	public static void main(String[] args) {
		String[] strs = new String[2];
//		strs[0] = "1";
//		strs[1] = "2";
		int idx = 0;
		for (String s : strs) {
//			strs[idx] = strs[idx].concat(" element " + idx);
//			strs[idx].concat(" element " + idx);
			idx++;
		}
		for(idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}

}
