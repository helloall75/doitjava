package chapter07;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int score1 = 1, score2 = 2, score3 = 3, score4 = 4, score5 = 5;
		int sum = 0;
		
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		System.out.println(sum);
		
		sum = 0;
		int[] scores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		//System.out.println("scores�迭�� ����: " + scores.length);
		for(int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("�հ�: " + sum);
		
		int[] avg = new int[100];
		System.out.println("avg �迭�� ����: " + avg.length);
	}

}
