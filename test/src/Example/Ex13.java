package Example;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int line;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("몇 줄을 출력할까요?(홀수만 입력): ");
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
