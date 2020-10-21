package chapter04;

public class Ex4 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for(int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				//if (j % 2 != 0)  
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k = 10; k > 1; k--) {
			for(int l = k - 1; l > 1; l--) {
				//if (l % 2 != 0)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
