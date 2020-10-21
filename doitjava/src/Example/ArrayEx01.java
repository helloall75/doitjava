package Example;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		char[] alpha = new char[26];
		char ch = 'a';
		//System.out.println((int)ch);
		
		//ch='A';
		//System.out.println((int)ch);
		
		for(int i=0; i<alpha.length; i++) {//, ch++) {
			alpha[i] = (char)(ch + i);
		}
		
		for(int i=0; i<alpha.length; i++) {
			System.out.print(alpha[i]);
		}
	}

}
