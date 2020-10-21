package chapter07;

public class Args {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//args = {}; 첫 줄에 자동으로 실행함.
		if(args.length != 0) {
	        for(int i=0; i<args.length; i++) {
	            System.out.println(args[i]);
	        }
	   } else {
		   System.out.println("입력한 매개변수가 없습니다.");
	   }
	}

}
