package chapter05;

public class ComputerExtends extends CalculatorExtends {
	@Override	//�޼ҵ带 �����Ǹ� ���ؼ� ����.
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()");
		return Math.PI * r * r;
		
	}

}
