package chapter05;

public class Student extends People{
	public int StudentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//�θ������ ȣ��
		this.StudentNo = studentNo;
	}
}
