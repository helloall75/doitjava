package chapter15;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");
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