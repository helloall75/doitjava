package Example;

public class Ex8 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int cnt = 0;
		
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) cnt++;
		}
		System.out.println("1~50������ 3�� ����� ������ " + cnt + "�Դϴ�.");
	}

}
