package chapter04;

public class BasicLoop {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;
		
		System.out.println("1���� 10������ ���� " + num + "�Դϴ�");
		
		int cnt = 1; //count�� ����
		int res = 0; //result�� ����
		
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		
		System.out.println("1���� 10������ ���� " + res + "�Դϴ�.");
		
		cnt = 1;
		res = 0;
		System.out.println("cnt: " + cnt + ", res: " + res);
		while (cnt <= 10) {
			res += cnt++;
		}
		
		System.out.println("1���� 10������ ���� " + res + "�Դϴ�.  cnt = " + num + ", res = " + res);
		
		num = 1;
		int sum = 0;
		
		while(num <= 50) {
			sum += num++;
		}
		System.out.println("1���� 50������ ���� " + sum + "�Դϴ�.");
		
		num =1;
		sum = 0;
		
		do {
			sum += num++;
		} while(num <= 10);
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�. cnt = " + cnt + ", sum = " + sum);
	}

}
