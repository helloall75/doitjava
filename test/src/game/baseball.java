package game;

import java.util.Scanner;

public class baseball {
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int cnt = 0;
		int MAX_CNT = 11;
		int ball = 0, strike = 0, out = 0;
		
		int[] com = new int[3];
		int[] user = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random() * 9) + 1;
		}
		
		while(cnt <= MAX_CNT) {
			cnt++;
			System.out.println("카운트: " + cnt);
			
			for(int j=0; j<user.length; j++) {
				System.out.print(j+1 + "번째 숫자: ");
				user[j] = sc.nextInt();	
			}
			
			if((com[0] == user[0]) || (com[1] == user[1]) || (com[2] == user[2]))  {
				strike++;
				if (strike == 3) {
					System.out.println("[Hit!]숫자를 모두 맞추었습니다.");
					sc.close();
					break;
				}
			} else if ((com[0] == user[1]) || (com[0] == user[2]) || (com[1] == user[2])){
				ball++;
				if (ball == 4) {
					out++;
					ball = 0;
				}
			} else {
				out++;
				if (out == 3) {
					System.out.println("===== GAME OVER ===");
					sc.close();
					break;
				}
			}
			
			System.out.println("Strike : " + strike + ", Ball : " + ball + ", Out : " + out);
			if (cnt == MAX_CNT) { 
				sc.close();
				break;
			}
			
		}
	}

}
