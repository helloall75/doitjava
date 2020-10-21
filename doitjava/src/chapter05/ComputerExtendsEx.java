package chapter05;

public class ComputerExtendsEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int r = 10;
		
		CalculatorExtends calc = new CalculatorExtends();
		System.out.println("원면적: " + calc.areaCircle(r));
		System.out.println();
		
		ComputerExtends com = new ComputerExtends();
		System.out.println("원면적: " + com.areaCircle(r));
	}

}
