package Example;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
/*		int com = 0;
		
		com = (int)(Math.random() * 3) + 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����, ����, �� �� �ϳ��� ���ÿ�. (1.����, 2.����, 3.��, 4: ����): ");
		int user = sc.nextInt();
		String str = "";
		
		//do {
			if ((com == user)) {
				if(user == 1) {
					str = "��ǻ��, �����: ����";
				} else if (user == 2) {
					str = "��ǻ��, �����: ����";
				} else if (user == 3) {
					str = "��ǻ��, �����: ��";
				}
				System.out.println("�����ϴ�. " + str);
			} else if ((com == 1) && (user == 2)) || ((com == 2) && (user == 3)) || ((com == 3) && (user == 1)) {
				System.out.println("����� ��");
			 else if (user == 4){
				System.out.println("����, ����, ���� �����մϴ�.");
			} else {  //if ((com == 1) && (user == 3)) || ((com == 2) && (user == 1))  || ((com == 3) && (user == 2)) {
				System.out.println("��ǻ�� ��");
			}
		//} while(user == 4);
		 * 
		 */
		final int GA = 0;
		final int BA = 1;
		final int BO = 2;
		
		int user, com;
		int score = 0;
		Scanner sc = new Scanner(System.in);
		int life = 3;
		
		System.out.println("���������� �����Դϴ�.");
		while(true) {
			com = (int)(Math.random() * 3);
			System.out.println("0: ����, 1: ����, 2: ��");
			System.out.print("> ");
			user = sc.nextInt();
			
			System.out.print("��ǻ��: " + (com == 0 ? "����" : (com == 1 ? "����" : "��")));
			System.out.print(", ����: " + (user == 0 ? "����" : (user == 1 ? "����" : "��")));
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user ==GA)) {
				System.out.println(" => ���� ��");
				score += 100;
			} else if (com == user) {
				System.out.println(" => ���");
				score +=10;
			} else {
				System.out.println(" => ��ǻ�� ��");
				life--;
			}
			System.out.println("-------------------");
			System.out.println("����: " + score + ", ���: " + life);
			System.out.println("-------------------");
			if(life == GA) {
				System.out.println("GAME OVER");
				break;
			}
		}
		sc.close();
	}
}
