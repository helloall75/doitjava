package chapter04;

public class ForEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int i;
		int sum;
		
		for(i = 0, sum = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}

}

/*
* �������� ���� ���� �����Դϴ�.
* i++ -> i +=1 -> i =i +1
*
*/