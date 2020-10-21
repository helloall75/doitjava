package chapter15;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i;
		
		try {
			while((i = System.in.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
