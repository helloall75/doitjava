package chapter05;

public class ComputerExtendsEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int r = 10;
		
		CalculatorExtends calc = new CalculatorExtends();
		System.out.println("������: " + calc.areaCircle(r));
		System.out.println();
		
		ComputerExtends com = new ComputerExtends();
		System.out.println("������: " + com.areaCircle(r));
	}

}
