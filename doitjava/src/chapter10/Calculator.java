package chapter10;

public abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		// TODO 자동 생성된 메소드 스텁
		return num1 + num2;
	}
	@Override
	public int substract(int num1, int num2) {
		// TODO 자동 생성된 메소드 스텁
		return num1 - num2;
	}
	@Override
	public void description() {
		// TODO 자동 생성된 메소드 스텁
		Calc.super.description();
	}
}
