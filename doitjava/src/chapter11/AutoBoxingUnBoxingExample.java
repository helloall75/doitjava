package chapter11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//자동 boxing
		Integer obj = 100;
		System.out.println("value: "  + obj.intValue());
		
		//대입시 자동 unboxing
		int value = obj;
		System.out.println("value: "  + value);
		
		//연산시 자동 unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
		
		obj = Integer.valueOf("200");
		result += obj;	//연산시 자동 unboxing
		System.out.println("result: " + result);
	}

}
