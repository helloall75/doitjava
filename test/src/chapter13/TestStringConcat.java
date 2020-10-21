package chapter13;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		String s1 = "Hello";
		String s2 = "World";
		int num = 10;
		
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		StringConcat concat2 = (s, v) -> 
		{
			//num = 100;
			System.out.println(num);
			System.out.println(s + "," + v);	//void는 리턴되지 않습니다.
		};
		concat2.makeString(s1, s2);
		
		StringConcat concat3  = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO 자동 생성된 메소드 스텁
				//num = 100;
				System.out.println(num);
				System.out.println(s1  + "," + s2);
			}
		};
		concat3.makeString(s1, s2);
	}

}
