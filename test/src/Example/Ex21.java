package Example;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int com = (int)(Math.random() * 100);
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڴ� �����ΰ���?");
		
		while(true) {
			System.out.print("> ");
			int user = sc.nextInt();			
			
			if(com <= user) {
				System.out.println("Low(Down)");
			} else {
				System.out.println("High(Up)");				
			}
			cnt++;
			System.out.println(cnt + "ȸ �Է�");
			 if ((cnt == 5) || (com == user)) break;
		}
		System.out.println("����: " + com);
		System.out.println(cnt + "ȸ");		
	}

}
