package Example;

public class Overflow {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		byte bNum = Byte.MAX_VALUE;
		System.out.println(bNum);
		bNum++;	//�����÷ο찡 �߻��Ѵ�.
		System.out.println(bNum);
		bNum++;
		System.out.println(bNum);
		
		int iNum = Integer.MIN_VALUE;
		System.out.println(iNum);
		iNum--; //����÷ο찡 �߻��Ѵ�.
		System.out.println(iNum);
		
		//int value = !100; //������ �����ڴ� int ���� ����� �� ����.
		double dVal = 10.0/3.0;
		System.out.println(dVal);
		double dVal1 = 10.0/0.0;
		System.out.println(dVal1);
		double dVal2 = 5.0%0.0;
		System.out.println(dVal2);
		
		String str1 = "�ڹ�";
		String str2 = "�ڹ�";
		String str3 = new String("�ڹ�");
		
		System.out.println(str1 == str2 ? true : false);
		System.out.println(str1 == str3 ? true : false);
	}

}
