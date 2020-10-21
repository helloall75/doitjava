package game;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[][] lotto = new int[5][6];
		int num = 0;
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 로또 생성기 =====");
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length; j++) {
				
				/*
				 * for(int j=0; j<i; j++) { if(user[i] == user[j]) {
				 * System.out.println("같은 값을 입력하였습니다. 다시 입력해 주세요."); i--; break; } }
				 */
				num = (int)(Math.random() * 45) + 1;
				
				//for(int k=0; k<lotto[i].length; k++) {
				if(i > 0 && j >0) {
					if (lotto[i-1][j-1] == lotto[i][j])  {
						j--;
						continue;
					} else {
						lotto[i][j] = num;
					}
				} else {
					lotto[i][j] = num;
				}
				System.out.print(lotto[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("=======================");
	}

}
