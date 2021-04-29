package sliver;

interface Readable {
	public void readBook();

	public void setBookMark();
}

abstract class Book implements Readable { // line n1
	public void readBook() {
	}
	// line n2
}

class Ebook extends Book {
	public void readBook() {
	};

	// line n4
	public void setBookMark() {
	};

}
