package chapter13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		List<Student3> totalList = Arrays.asList(
			new Student3("ȫ�浿", 10, Student3.Sex.MALE),
			new Student3("�����", 6, Student3.Sex.FEMALE),
			new Student3("�ſ��", 10, Student3.Sex.MALE),
			new Student3("�ڼ���", 6, Student3.Sex.FEMALE));
		
		List<Student3> maleList = totalList.stream().filter(s -> s.getSex() ==  Student3.Sex.MALE)
			.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		Set<Student3> femaleSet = totalList.stream().filter(s -> s.getSex() == Student3.Sex.FEMALE)
			//.collect(Collectors.toCollection(HashSet::new));
			//.collect(Collectors.toCollection(() -> return new HashSet<Student3>();}); 
			.collect(Collectors.toCollection(() -> new HashSet<Student3>()));
		femaleSet.stream().forEach(s -> System.out.println(s.getName()));
		
	}

}
