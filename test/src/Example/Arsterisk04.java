package Example;

public class Arsterisk04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for(int i=0; i<5; i++) {	//상단
			for(int j=0; j<5; j++) {	//좌측
				if(4-i > j) {
				System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j=0; j<i; j++) {	//우측
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3; i>=0; i--) {	//하단
			for(int j=0; j<5; j++) {	//좌측
				if(4-i > j) {
				System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for(int j=0; j<i; j++) {	//우측
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
