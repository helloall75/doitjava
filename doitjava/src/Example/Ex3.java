package Example;

public class Ex3 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) sum1 += i;
			else sum2 += i;
		}
		System.out.println("1에서 10까지의 짝수의 합계는 " + sum1 + "입니다.");
		System.out.println("1에서 10까지의 홀수의 합계는 " + sum2 + "입니다.");
	}

}
