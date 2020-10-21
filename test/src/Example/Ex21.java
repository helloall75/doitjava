package Example;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int com = (int)(Math.random() * 100);
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("생성된 숫자는 무엇인가요?");
		
		while(true) {
			System.out.print("> ");
			int user = sc.nextInt();			
			
			if(com <= user) {
				System.out.println("Low(Down)");
			} else {
				System.out.println("High(Up)");				
			}
			cnt++;
			System.out.println(cnt + "회 입력");
			 if ((cnt == 5) || (com == user)) break;
		}
		System.out.println("정답: " + com);
		System.out.println(cnt + "회");		
	}

}
