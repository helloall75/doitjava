package chapter13;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		List<Student2> studentList = Arrays.asList(
			new Student2("홍길동", 92),
			new Student2("신용권", 95),
			new Student2("감자바", 88));
		
		int sum1 = studentList.stream().mapToInt(Student2::getScore).sum();
		
		int sum2 = studentList.stream().map(Student2::getScore).reduce((a, b) -> a + b).get();
		
		int sum3 = studentList.stream().map(Student2::getScore).reduce(0, (a, b) -> a + b);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);
		System.out.println("sum3: " + sum3);
	}

}
