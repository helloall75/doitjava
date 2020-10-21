package Example;

public class Overflow {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;	//오버플로우가 발생한다.
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		
		int iNum = Integer.MIN_VALUE;
		System.out.println(iNum);
		iNum--; //언더플로우가 발생한다.
		System.out.println(iNum);
		
		//int value = !100; //논리부정 연산자는 int 값에 사용할 수 없다.
		double dVal = 10.0/3.0;
		System.out.println(dVal);
		double dVal1 = 10.0/0.0;
		System.out.println(dVal1);
		double dVal2 = 5.0%0.0;
		System.out.println(dVal2);
		
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
		
		System.out.println(str1 == str2 ? true : false);
		System.out.println(str1 == str3 ? true : false);
	}

}
