package chapter08;

public class DriverEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	//Vehicle vehicle = bus; 
		driver.drive(taxi);	//Vehicle vehicle = taxi;	
	}

}
