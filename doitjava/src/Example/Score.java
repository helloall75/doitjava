package Example;

import java.util.Scanner;

/*
 * ���� ���� ���� ������ �Է¹޾Ƽ�
 * ����� ����� ��
 * 100~91 A���
 * 90 ~ 81 B���
 * 80 ~ 71 C���
 * �������� F���
 * 
 * ��� ������ ����� ����ϼ���.
 */
public class Score {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.: ");
		int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.: ");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.: ");
		int math = sc.nextInt();
		
		System.out.println("����: " + kor + ", ����: " + eng + ", ����: " + math);
		double avg = (kor + eng + math) / 3.0;
		
		System.out.print("���: " + avg);
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
		System.out.println(", " + grade + "���");
		
	}

}
