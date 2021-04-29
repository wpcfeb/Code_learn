package V10_02;

public class Question89 {
	public static void main (String[] args) {
		String stuff = "TV";
		String res = null;
		
		if (stuff.equals("TV")) {
			res = "Walter";
		} else if (stuff.contentEquals("Movie")) {
			res = "White";
		} else {
			res = "No Result";
		}
		System.out.println(res);
		
		// option A;
//		stuff.equals("TV") ? res = "Walter" : res = "White";
		// option D
		res = stuff.equals("TV") ? "Walter" :  stuff.equals("Movie")? "White" : "No Result";
		System.out.println(res);
		
	}
}
