package Example;

public class Ex3 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) sum1 += i;
			else sum2 += i;
		}
		System.out.println("1���� 10������ ¦���� �հ�� " + sum1 + "�Դϴ�.");
		System.out.println("1���� 10������ Ȧ���� �հ�� " + sum2 + "�Դϴ�.");
	}

}
