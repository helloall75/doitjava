package chapter07;

public class ObjectCopy01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book("태백산맥", "조정래");
		bookArr1[1] = new Book("데미안", "헤르만 헤세");
		bookArr1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		//for(int i=0; i<bookArr2.length; i++) {
		for(Book b:bookArr2) {
			b.showBookInfo();
		}
	}

}
