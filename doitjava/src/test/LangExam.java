package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LangExam {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		List<String>  lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");
		
		System.out.println(
			lang.stream()
				.sorted()
				.collect(Collectors.toList()));
		
		System.out.println(
			lang.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()));
		
		//int compare(T o1, T o2);
		System.out.println(
			lang.stream()
				.sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList()));
		
		System.out.println(
			lang.stream()
				.sorted((s1, s2) -> s2.length() - s1.length())
				.collect(Collectors.toList()));
	}

}
