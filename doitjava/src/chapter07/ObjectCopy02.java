package chapter07;

public class ObjectCopy02 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book("�¹���", "������");
		bookArr1[1] = new Book("���̾�", "�츣�� �켼");
		bookArr1[2] = new Book("��� �� ���ΰ�", "���ù�");
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		for(Book b:bookArr2) {
			b.showBookInfo();
		}
		
		bookArr1[0].setBookName("����");
		bookArr1[0].setAuthor("�ڿϼ�");
		
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
