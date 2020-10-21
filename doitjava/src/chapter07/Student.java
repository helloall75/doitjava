package chapter07;

public class Student {
	private int studentID = 0;
	private String name = "";
	
	public Student() {}
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public int getStudentID(int studentID) {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public void setStudentID(String name) {
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + "," + name);
	}
}
