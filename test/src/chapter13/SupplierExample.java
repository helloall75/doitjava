package chapter13;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		IntSupplier intSupplier = () -> {
			int num = (int)((Math.random()) * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
	}

}
