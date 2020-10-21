package Example;

import java.util.Scanner;

/*
 * 국어 영어 수학 점수를 입력받아서
 * 평균을 출력한 후
 * 100~91 A등급
 * 90 ~ 81 B등급
 * 80 ~ 71 C등급
 * 나머지는 F등급
 * 
 * 평균 점수와 등급을 출력하세요.
 */
public class Score {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 성적을 입력하세요.: ");
		int kor = sc.nextInt();
		System.out.println("영어 성적을 입력하세요.: ");
		int eng = sc.nextInt();
		System.out.println("수학 성적을 입력하세요.: ");
		int math = sc.nextInt();
		
		System.out.println("국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
		double avg = (kor + eng + math) / 3.0;
		
		System.out.print("평균: " + avg);
		char grade =0;
		
		if(avg >= 91) {
			grade = 'A';
		} else if(avg >= 81) {
			grade = 'B';
		} else if(avg >= 71) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		
		switch((int)avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'B';
			break;
		default: grade = 'F';
		}
		System.out.println(", " + grade + "등급");
		
	}

}
