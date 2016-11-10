package tutorial.chapter03;

class Book {
	// 필드
	private String title, author;

	// 접근자
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	// 설정자 선언
	public void setTitle(String _title) {
		title = _title;
	}

	public void setAuthor(String _author) {
		author = _author;
	}

	public String toString() {
		return "title : " + title + " author : " + author ;
	}
}

public class Programming46 {
	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.setTitle("Great Java");
		myBook.setAuthor("bob");
		
		System.out.println(myBook.getTitle());
		System.out.println(myBook.getAuthor());
		
		System.out.println(myBook.toString());
	}
}
