package Example;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
/*		int com = 0;
		
		com = (int)(Math.random() * 3) + 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위, 바위, 보 중 하나를 내시오. (1.가위, 2.바위, 3.보, 4: 종료): ");
		int user = sc.nextInt();
		String str = "";
		
		//do {
			if ((com == user)) {
				if(user == 1) {
					str = "컴퓨터, 사용자: 가위";
				} else if (user == 2) {
					str = "컴퓨터, 사용자: 바위";
				} else if (user == 3) {
					str = "컴퓨터, 사용자: 보";
				}
				System.out.println("비겼습니다. " + str);
			} else if ((com == 1) && (user == 2)) || ((com == 2) && (user == 3)) || ((com == 3) && (user == 1)) {
				System.out.println("사용자 승");
			 else if (user == 4){
				System.out.println("가위, 바위, 보를 종료합니다.");
			} else {  //if ((com == 1) && (user == 3)) || ((com == 2) && (user == 1))  || ((com == 3) && (user == 2)) {
				System.out.println("컴퓨터 승");
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
		
		System.out.println("가위바위보 게임입니다.");
		while(true) {
			com = (int)(Math.random() * 3);
			System.out.println("0: 가위, 1: 바위, 2: 보");
			System.out.print("> ");
			user = sc.nextInt();
			
			System.out.print("컴퓨터: " + (com == 0 ? "가위" : (com == 1 ? "바위" : "보")));
			System.out.print(", 유저: " + (user == 0 ? "가위" : (user == 1 ? "바위" : "보")));
			if ((com == GA && user == BA) || (com == BA && user == BO) || (com == BO && user ==GA)) {
				System.out.println(" => 유저 승");
				score += 100;
			} else if (com == user) {
				System.out.println(" => 비김");
				score +=10;
			} else {
				System.out.println(" => 컴퓨터 승");
				life--;
			}
			System.out.println("-------------------");
			System.out.println("점수: " + score + ", 목숨: " + life);
			System.out.println("-------------------");
			if(life == GA) {
				System.out.println("GAME OVER");
				break;
			}
		}
		sc.close();
	}
}
