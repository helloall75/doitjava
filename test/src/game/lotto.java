package game;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int[][] lotto = new int[5][6];
		int num = 0;
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("===== �ζ� ������ =====");
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length; j++) {
				
				/*
				 * for(int j=0; j<i; j++) { if(user[i] == user[j]) {
				 * System.out.println("���� ���� �Է��Ͽ����ϴ�. �ٽ� �Է��� �ּ���."); i--; break; } }
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
