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
		// TODO �ڵ� ������ �޼ҵ� ����
		return bookTitle + "," + bookNumber;
	}
}

public class ToStringEx {
	
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Book book1 = new Book(200, "����");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
