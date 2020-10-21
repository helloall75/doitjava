package chapter13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4});
		intStream.sorted().forEach(n -> System.out.print(n + ","));
		System.out.println();
		
		List<Student2> studentList = Arrays.asList(
				new Student2("홍길동", 30), new Student2("신용권", 10),	new Student2("유미선", 20));
		studentList.stream().sorted().forEach(System.out::println);//s -> System.out.print(s.getScore() + ","));
		System.out.println();
		
		studentList.stream().sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s.getScore() + ","));
	}

}
