package chapter05;

public class ChildEx {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		
//		String s = new String("Hello World");
//		int size = s.length();
//		System.out.println(size);
	}

}
