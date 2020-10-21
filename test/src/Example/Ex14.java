package Example;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄을 출력하시겠습니까? ");
		
		int line = sc.nextInt();
		
		for(int i = 0; i < line; i++) {
			for(int j = 0; j < line; j++) {
				if (j < line - i - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
