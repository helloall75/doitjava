package chapter12;

public class BoxExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}

}
