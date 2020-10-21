package Example;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] arr = new int[10];
		arr[0] =1;
		arr[1] = 2;
		
		//인덱스의 값은 앞의 두 인덱스 값을 더해서 대입하고
		//arr의 값을 모두 출력하세요.
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("[" + i + "]: " + arr[i]);
		}
	}

}
