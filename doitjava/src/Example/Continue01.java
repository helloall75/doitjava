package Example;

public class Continue01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		for(int i=0; i<10; i++) {
			if (i % 2 != 0) {
				//System.out.print("나머지가 없음: ");
				//break;	//반복문을 부수고 멈추게 하는 구문
				continue;	//현재 실행되는 것을 멈추고 다음 조건문으로 넘어감
			}
			System.out.println(i);
		}
	}

}
