package chapter14;

import java.util.Scanner;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		try (AutoCloseObj obj = new AutoCloseObj(); Scanner sc = new Scanner(System.in);) {
			//throw new Exception();
		} catch(Exception e) {
			System.out.println("���ܺκ��Դϴ�.");
		} finally {
			//sc.close();
		}
	}

}
