package chapter11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		//�ڵ� boxing
		Integer obj = 100;
		System.out.println("value: "  + obj.intValue());
		
		//���Խ� �ڵ� unboxing
		int value = obj;
		System.out.println("value: "  + value);
		
		//����� �ڵ� unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
		
		obj = Integer.valueOf("200");
		result += obj;	//����� �ڵ� unboxing
		System.out.println("result: " + result);
	}

}
