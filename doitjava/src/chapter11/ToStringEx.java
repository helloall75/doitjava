package chapter11;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
