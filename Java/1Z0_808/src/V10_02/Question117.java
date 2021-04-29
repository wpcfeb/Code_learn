package V10_02;

interface Readable {
	public void readBook();
	public void setBookMark();
}
abstract class Book implements Readable { //line n1
	public void readBook() {}
	//line n2
}
class EBook extends Book {
	public void readBook() {} //line n3
	//line n4
//	public void setBookMark() {};
}

public class Question117 {
	
}
