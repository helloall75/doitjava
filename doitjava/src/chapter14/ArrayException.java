package chapter14;

public class ArrayException {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����	
		try {
			int[] arr = new int[3];
			
			arr[3] = 100;
			System.out.println("��������߽��ϴ�.");
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("�迭�� ������ ����ų� ������꿡 ������ �߻��߽��ϴ�.");
			e.printStackTrace();
		} finally {
			System.out.println("finally�� ������ �����ϴ� �����Դϴ�.");
		}
		
	}

}
