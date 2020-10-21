package chapter12;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
