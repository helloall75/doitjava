package chapter04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int num1, num2;
		String Operator = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num1�� �Է��Ͻÿ�.");
		System.out.print("> ");
		num1 = scan.nextInt();
		
		System.out.println("num2�� �Է��Ͻÿ�.");
		System.out.print("> ");
		num2 = scan.nextInt();
		
		
		System.out.println("Operator�� �Է��Ͻÿ�.(+, -, *, /)");
		System.out.print("> ");
		Operator = scan.next();
		
		if(Operator.equals("+")) {
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if(Operator.equals("-")) {
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if(Operator.equals("*")) {
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else if(Operator.equals("/")) { // ������
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
