package chapter10;

public class DriverEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Driver driver = new Driver();
		Vehicle myCar = new Bus();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
	}

}
