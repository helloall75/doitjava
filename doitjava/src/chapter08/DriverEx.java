package chapter08;

public class DriverEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	//Vehicle vehicle = bus; 
		driver.drive(taxi);	//Vehicle vehicle = taxi;	
	}

}
