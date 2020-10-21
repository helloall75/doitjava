package Example;

public class Ex11 {
	public static void main(String[] args) {
		int sum = 0; double avg = 0;
		
		for(int i = 1; i <= 50; i++) {
			sum += i;
		}
		avg = (double)sum / 50.0;
		System.out.println("1~50까지의 합의 평균은 " + avg + "입니다.");
	}
}
