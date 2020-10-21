package Example;

public class Ex8 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int cnt = 0;
		
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) cnt++;
		}
		System.out.println("1~50까지의 3의 배수의 개수는 " + cnt + "입니다.");
	}

}
