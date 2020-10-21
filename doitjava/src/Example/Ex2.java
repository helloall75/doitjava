package Example;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오.: ");
		num = sc.nextInt();
		
		String str="";
		if (num % 2 == 0) {
			str = "짝수";
		} else {
			str ="홀수";
		}
		
		System.out.println(str);
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		sc.close();
	}

}
