package chapter09;

public class CarTest {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
