package Example;

public class PingPong {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/*for(int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " pingpong");
			} else if (i % 3 == 0) {
				System.out.println(i + " ping");
			} else if (i % 5 == 0) {
				System.out.println(i + " pong");
			} else {
				System.out.println(i);
			}
		}*/
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (i % 3 == 0) {
				System.out.print("ping");
			}
			if (i % 5 == 0) {
				System.out.print("pong");
			}
			System.out.println();
		}
	}
}
