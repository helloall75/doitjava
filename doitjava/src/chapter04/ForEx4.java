package chapter04;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int i, j;
		
		for(i=0; i<3; i++) {
			for(j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {
			for(i=0; i<5; i++) {
				System.out.print("*"); //***** �� �ټ����� ����ϰ� ���� ��. i=6�̶� 6<3 ������ �������� �ʱ� ������ �ܺ� for���� �����Ѵ�.
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {
			System.out.println("Hello!");
		}
	}

}
