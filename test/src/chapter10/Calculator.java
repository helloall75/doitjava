package chapter10;

public abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		// TODO �ڵ� ������ �޼ҵ� ����
		return num1 + num2;
	}
	@Override
	public int substract(int num1, int num2) {
		// TODO �ڵ� ������ �޼ҵ� ����
		return num1 - num2;
	}
	@Override
	public void description() {
		// TODO �ڵ� ������ �޼ҵ� ����
		Calc.super.description();
	}
}
