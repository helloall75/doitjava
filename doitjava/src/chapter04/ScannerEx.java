package chapter04;

import java.util.*;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int iNum;
		Scanner sc = new Scanner(System.in); //��ĳ�� ���� �ڵ� - ���� ������ ���� ������ ��
		
//		System.out.println("������ �Է��� �ּ���: ");
//		System.out.print("> ");
//		iNum = sc.nextInt();
//		System.out.println("�Է��� ����: " + iNum);
//		
//		System.out.print("�Ǽ��� �Է��� �ּ���: ");
//		double dNum = sc.nextDouble();
//		System.out.println("�Է��� �Ǽ�: " + dNum);
//		
//		System.out.print("�Ǽ�(f)�� �Է��� �ּ���: ");
//		float fNum = sc.nextFloat();
//		System.out.println("�Է��� �Ǽ�(f): " + fNum);
		
		System.out.print("���ڿ��� �Է��� �ּ���: ");
//		String str = sc.next(); //���ڿ� �Է¿��� next()�� ��������� ������ ���� �� �����ϴ�.
//								//��ĳ�ʿ��� ������ ���� ���� �ǹ��մϴ�.
//		System.out.println("�Է��� ���ڿ�: " + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�: " + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�: " + str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ�: " + str);
		
		String str = sc.nextLine(); //�� �� �Է� ��ɾ�� ���赵 �Է� �����մϴ�.
		System.out.println("�Է��� ���ڿ�: " + str);
		sc.close(); //��ĳ�ʴ� �� �̻� ������� �ʴ´ٸ� �ݾ���� �մϴ�.
	}

}
