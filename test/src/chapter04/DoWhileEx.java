package chapter04;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num =1;
		int sum = 0;
		
		do {
			sum += num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다. cnt = " + num + ", sum = " + sum);
		
		num = 20;
		sum = 0;
		
		while(num <= 10) {
			sum += num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
