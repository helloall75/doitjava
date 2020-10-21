package chapter07;

public class StudentArray {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Student[] ban = new Student[5];
		
		ban[0] = new Student(1111, "홍길동");
		ban[1] = new Student(1121, "박명수");
		ban[2] = new Student(1130, "강호동");
		ban[3] = new Student(4111, "유재석");
		ban[4] = new Student(5611, "임영웅");
		
		for(int i=0; i< ban.length; i++) {
			ban[i].showStudentInfo();;
		}
		
		for(int i=0; i< ban.length; i++) {
			System.out.println(ban[i]);
		}
	}

}
