package Example;

public class Ex6 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			if (i % 3 == 0) sum += i;
		}
		System.out.println("1~50까지 3의 배수의 합계는 " + sum + "입니다.");
	}

}
