package chapter04;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int i, j;
		
		for(i=0; i<3; i++) {
			for(j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {
			for(i=0; i<5; i++) {
				System.out.print("*"); //***** 별 다섯개만 출력하고 종료 한. i=6이라 6<3 조건을 만족하지 않기 때문에 외부 for문을 종료한다.
			}
			System.out.println();
		}
		
		for(i=0; i<3; i++) {
			System.out.println("Hello!");
		}
	}

}
