package chapter04;

public class Ex3 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if (i >= j) {
					System.out.println(i + "X" + j + "=" + i * j);
				}
			} 
			System.out.println();
		}
	}

}
