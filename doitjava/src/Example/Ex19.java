package Example;

import java.util.HashSet;
import java.util.Set;

public class Ex19 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int num = 0;
		
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) {
			num = (int)(Math.random() * 48) + 1;
			set.add(num);
		}
		System.out.println("�ζ� ������");
		for(int n:set) {
			System.out.print(n + " ");
		}
	}
}
