package chapter04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num1, num2;
		String Operator = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num1을 입력하시오.");
		System.out.print("> ");
		num1 = scan.nextInt();
		
		System.out.println("num2을 입력하시오.");
		System.out.print("> ");
		num2 = scan.nextInt();
		
		
		System.out.println("Operator를 입력하시오.(+, -, *, /)");
		System.out.print("> ");
		Operator = scan.next();
		
		if(Operator.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if(Operator.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if(Operator.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if(Operator.equals("/")) { // 나누기
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		}
		
/*		switch(Operator.equals()) {
		case "+": System.out.println(num1 + "+" + num2 + "=" + (num1 + num2)); break;
		case "-": System.out.println(num1 + "-" + num2 + "=" + (num1 - num2)); break;
		case "*": System.out.println(num1 + "*" + num2 + "=" + (num1 * num2)); break;
		case "/": System.out.println(num1 + "/" + num2 + "=" + (num1 / num2)); break;
		}*/
		scan.close();			
	}

}
