package Example;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하시오.");
		System.out.print("> ");
		num1 = scan.nextInt();
		
		System.out.println("두번째 정수를 입력하시오.");
		System.out.print("> ");
		num2 = scan.nextInt();
		
		if (num1 == num2) {
			System.out.println("Result: Same " + num1 + " == " + num2);
		} else {
			System.out.println("Result: Different " + num1 + " != " + num2);
		}
		System.out.println(num1 == num2 ? "Same2" : "Different2");
		scan.close();
	}

}
