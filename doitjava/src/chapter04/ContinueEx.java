package chapter04;

public class ContinueEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for (int i=0; i<5; i++) {
			System.out.println("Hello! " + i);
			if(i == 1) {
				continue; //break;
			}
			System.out.println("출력..");
		}
		
		int cnt = 0;
		while(true) {
			System.out.println("while " + cnt++);
			if(cnt == 5) {
				continue; //break;
			}
			System.out.println("출력..");
			if(cnt == 10) {
				break;
			}
		}
	}

}
