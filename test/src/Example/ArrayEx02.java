package Example;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] arr = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};
		//arr의 요소들의 값을 0으로 모두 바꾼 후
		//각 요소의 값이 0인지 확인해서 출력하세요.
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i=0; i< arr.length; i++) {
			System.out.println("[" + i + "]: " + arr[i]);
		}
	}

}
