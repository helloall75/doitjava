package Example;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�.: ");
		num = sc.nextInt();
		
		String str="";
		if (num % 2 == 0) {
			str = "¦��";
		} else {
			str ="Ȧ��";
		}
		
		System.out.println(str);
		System.out.println(num % 2 == 0 ? "¦��" : "Ȧ��");
		sc.close();
	}

}
