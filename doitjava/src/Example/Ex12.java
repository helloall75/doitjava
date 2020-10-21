package Example;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력할까요?: ");
		int line = sc.nextInt();
		
		for(line = 1; line < 7; line++) {
			for (int j = 1; j < line + 1; j++) {
				//if (j % 2 != 0)  
				System.out.print("$");
			}
			System.out.println();
		}
		for(int k = 0; k < line; k++) {
			for(int l = 0; l <= k; l++) {
				if (l == k)
					System.out.print("@");
				else
					System.out.print("$");
			}
			System.out.println();
		}
		sc.close();
	}

}
