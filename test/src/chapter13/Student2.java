package chapter13;

public class Student2 implements Comparable<Student2> {
	private String name;
	//private String sex;
	private int score;
	
	public Student2(String name, /*String sex,*/ int score) {
		this.name = name;
		//this.sex = sex;
		this.score = score;
	}
	
	//public String getSex() { return sex; }
	public int getScore() { return score; }
	
	@Override
	public String toString() {
		return name + "-" + score;
	}
	
	@Override 
	public int compareTo(Student2 o) {
		return Integer.compare(score, o.score);
	}
	
}
