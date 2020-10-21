package chapter05;

public class ComputerExtends extends CalculatorExtends {
	@Override	//메소드를 재정의를 위해서 써줌.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()");
		return Math.PI * r * r;
		
	}

}
