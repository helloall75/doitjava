package chapter05;

public class Student extends People{
	public int StudentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	//부모생성자 호출
		this.StudentNo = studentNo;
	}
}
