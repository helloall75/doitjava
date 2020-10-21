package chapter12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterTest {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50); //asList로 생성된 list는 추가, 삭제가 불가합니다.
		System.out.println(list.size());
		Iterator<Integer> ir = list.iterator();
		while(ir.hasNext()) {
			int number = ir.next();
			System.out.println(number);
		}
		
		System.out.println("for문");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("향상된 foR문");
		for(int num : list ) {
			System.out.println(num);
		}
		
		/*System.out.println("리스트에서 앞의 자료를 삭제하며 출력");
		while(!list.isEmpty()) {
			int number = list.remove(0);
			System.out.println(number);
		}*/
	}

}
