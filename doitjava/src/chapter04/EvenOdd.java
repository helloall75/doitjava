package chapter04;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 입력받은 숫자가 홀수인지 짝수인지
 * 출력하세요.
 */
public class EvenOdd {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int iNum;
		
		System.out.println("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		iNum = sc.nextInt();
		
		if ((iNum % 2) == 0) {
			System.out.println(iNum + "은 짝수입니다.");
		} else {
			System.out.println(iNum + "은 홀수입니다.");
		}
	}

}
