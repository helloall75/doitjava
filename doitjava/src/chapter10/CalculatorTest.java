package chapter10;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		//Calc calc = new CompleteCalc();  //showInfo() 메서드 사용 불가능
		System.out.println(calc.add(num1,  num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1,  num2));
		System.out.println(calc.divide(num1,  num2));
		calc.showInfo();
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr));
	}

}
