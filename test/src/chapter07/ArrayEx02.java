package chapter07;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] arr1 = {1,2,3,4,5,6,7,8};
		//arr1 = {10, 20, 30, 40, 50, 60};	//배열의 크기가 초기에 정해진 길이만큼이라 오류가 생김
		int sum1 = 0;
		try {
			for(int i=0; i < arr1.length+1; i++) {
				sum1 += arr1[i];
			}
			System.out.println(sum1);
		} catch(ArrayIndexOutOfBoundsException ee) {
			System.out.println("인덱스 초과");
		}
		
		int[] arr2 = new int[20];
		int sum2 = 0;
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] : "+ arr2[i]);
		}
		
		boolean[] bool = new boolean[20];
		int sum3 = 0;
		for(int i=0; i<bool.length; i++) {
			System.out.println("bool[" + i + "] : "+ bool[i]);
		}
		
		char[] ch = new char[20];
		int sum4 = 0;
		for(int i=0; i<ch.length; i++) {
			System.out.println("ch[" + i + "] : "+ (int)ch[i]);
		}
		System.out.println();
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
		arr1 = new int[] {1, 2, 3, 4, 5}; //자바는 new라는 키워드로 배열을 초기화 할 수 있다.
		
	}

}
