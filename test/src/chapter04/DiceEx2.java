package chapter04;

public class DiceEx2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int dice = (int)(Math.random() * 6) + 1;  //난수 발생
		System.out.println(dice);
		
/*		if(dice <= 3) {
			switch(dice) {
				case 1:
					System.out.println("주사위의 눈금은 1입니다.");
					break;
				case 2:
					System.out.println("주사위의 눈금은 2입니다.");
					break;
				case 3:
					System.out.println("주사위의 눈금은 3입니다.");
					break;
			}
		 } else {
			switch(dice) {
				case 4:
					System.out.println("주사위의 눈금은 4입니다.");
					break;
				case 5:
					System.out.println("주사위의 눈금은 5입니다.");
					break;
				default:
					System.out.println("주사위의 눈금은 6입니다.");
			}
				
		}*/
		
		switch(dice) {
			case 1:
				System.out.println("주사위의 눈금은 1입니다.");
				break;
			case 2:
				System.out.println("주사위의 눈금은 2입니다.");
				break;
			case 3:
				System.out.println("주사위의 눈금은 3입니다.");
				break;
			case 4:
				System.out.println("주사위의 눈금은 4입니다.");
				break;
			case 5:
				System.out.println("주사위의 눈금은 5입니다.");
				break;
			default:
				System.out.println("주사위의 눈금은 6입니다.");
		}
	}
}
/* 
* Math.random()의 범위: 0보다 크거나 같고 1보다 작은 수
* 0 <= Math.random() < 1
* 0 * 6 + 1 <= Math.random() * 6 < 1 * 6 + 1
*/