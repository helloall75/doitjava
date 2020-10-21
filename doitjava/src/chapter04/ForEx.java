package chapter04;

public class ForEx {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int i;
		int sum;
		
		for(i = 0, sum = 0; i < 11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}

/*
* 증감식은 식이 들어가는 공간입니다.
* i++ -> i +=1 -> i =i +1
*
*/