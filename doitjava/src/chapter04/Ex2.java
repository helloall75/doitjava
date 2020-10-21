package chapter04;

public class Ex2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for(int i = 2; i <= 9; i++) {
			if ((i % 2 == 0) && (i < 10)) {
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + "X" + j + "=" + i * j);
				}
			} else System.out.println();			
		}
	}

}
