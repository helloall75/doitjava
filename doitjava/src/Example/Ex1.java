package Example;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է��Ͻÿ�.");
		System.out.print("> ");
		num1 = scan.nextInt();
		
		System.out.println("�ι�° ������ �Է��Ͻÿ�.");
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
