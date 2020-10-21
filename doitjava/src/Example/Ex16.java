package Example;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까? ");
		
		int line = sc.nextInt();
		
		for(int i = line - 1; i >= 0; i--) {
			for(int j = 0; j < line; j++) {
				if (j < line - i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
