package chapter14;

import java.util.Scanner;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		try (AutoCloseObj obj = new AutoCloseObj(); Scanner sc = new Scanner(System.in);) {
			//throw new Exception();
		} catch(Exception e) {
			System.out.println("예외부분입니다.");
		} finally {
			//sc.close();
		}
	}

}
