package chapter13;

public class AnonymousEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Anonymous anony = new Anonymous();
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}
}
