package chapter07;

public class ObjectCopy01 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Book[] bookArr1 = new Book[3];
		Book[] bookArr2 = new Book[3];
		
		bookArr1[0] = new Book("�¹���", "������");
		bookArr1[1] = new Book("���̾�", "�츣�� �켼");
		bookArr1[2] = new Book("��� �� ���ΰ�", "���ù�");
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);
		
		//for(int i=0; i<bookArr2.length; i++) {
		for(Book b:bookArr2) {
			b.showBookInfo();
		}
	}

}
