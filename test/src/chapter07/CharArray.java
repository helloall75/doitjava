package chapter07;

public class CharArray {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		char[] alphabets = new char[26];
		char ch = 'A';
		System.out.println("A : " + (int)ch);
		System.out.println();
		
		for (int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for (int i=0; i<alphabets.length; i++, ch++) {
			System.out.println(alphabets[i] + ":" + (int)alphabets[i]);
		}
	}

}
