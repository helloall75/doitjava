package chapter04;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڰ� Ȧ������ ¦������
 * ����ϼ���.
 */
public class EvenOdd {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int iNum;
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		iNum = sc.nextInt();
		
		if ((iNum % 2) == 0) {
			System.out.println(iNum + "�� ¦���Դϴ�.");
		} else {
			System.out.println(iNum + "�� Ȧ���Դϴ�.");
		}
	}

}
