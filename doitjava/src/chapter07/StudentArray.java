package chapter07;

public class StudentArray {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Student[] ban = new Student[5];
		
		ban[0] = new Student(1111, "ȫ�浿");
		ban[1] = new Student(1121, "�ڸ��");
		ban[2] = new Student(1130, "��ȣ��");
		ban[3] = new Student(4111, "���缮");
		ban[4] = new Student(5611, "�ӿ���");
		
		for(int i=0; i< ban.length; i++) {
			ban[i].showStudentInfo();;
		}
		
		for(int i=0; i< ban.length; i++) {
			System.out.println(ban[i]);
		}
	}

}
