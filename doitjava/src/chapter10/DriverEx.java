package chapter10;

public class DriverEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Driver driver = new Driver();
		Vehicle myCar = new Bus();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
