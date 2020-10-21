package chapter07;

public class ObjectCopy03 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book("태백산맥", "조정래");
		bookArr1[1] = new Book("데미안", "헤르만 헤세");
		bookArr1[2] = new Book("어떻게 살 것인가", "유시민");
		
		bookArr2[0] = new Book();
		bookArr2[1] = new Book();
		bookArr2[2] = new Book();
		
		for(int i=0; i<bookArr1.length; i++) {
		//for(Book b:bookArr1) {
			//for(int i=0; i<bookArr2.length; i++) {
				bookArr2[i].setBookName(bookArr1[i].getBookName());
				bookArr2[i].setAuthor(bookArr1[i].getAuthor());
			}
		//}
		
		for(Book b: bookArr2) {
			b.showBookInfo();
		}
		
		bookArr1[0].setBookName("나목");
		bookArr1[0].setAuthor("박완서");
		
		System.out.println("=== bookArr1 ===");
		for(Book b:bookArr1) {
			b.showBookInfo();
		}
		
		System.out.println("=== bookArr2 ===");
		for(Book b: bookArr2) {
			b.showBookInfo();
		}
	}

}
