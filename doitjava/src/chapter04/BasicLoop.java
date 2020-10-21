package chapter04;

public class BasicLoop {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;
		
		System.out.println("1부터 10까지의 합은 " + num + "입니다");
		
		int cnt = 1; //count의 줄임
		int res = 0; //result의 줄임
		
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		res += cnt++;
		
		System.out.println("1부터 10까지의 합은 " + res + "입니다.");
		
		cnt = 1;
		res = 0;
		System.out.println("cnt: " + cnt + ", res: " + res);
		while (cnt <= 10) {
			res += cnt++;
		}
		
		System.out.println("1부터 10까지의 합은 " + res + "입니다.  cnt = " + num + ", res = " + res);
		
		num = 1;
		int sum = 0;
		
		while(num <= 50) {
			sum += num++;
		}
		System.out.println("1부터 50까지의 합은 " + sum + "입니다.");
		
		num =1;
		sum = 0;
		
		do {
			sum += num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다. cnt = " + cnt + ", sum = " + sum);
	}

}
