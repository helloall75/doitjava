package Example;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int line;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�� ���� ����ұ��?(Ȧ���� �Է�): ");
			line = sc.nextInt();
		} while(line % 2 == 0);
		 
		int upLine = line / 2;
		int downLine = line - upLine;
		
		for(int i = 1; i < upLine; i++) {
			for (int j = 1; j < i + 1; j++) {
				//if (j % 2 != 0)  
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k = downLine - 1; k >= 0; k--) {
			for (int l = 0; l < k; l++) {
				//if (j % 2 != 0)  
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
