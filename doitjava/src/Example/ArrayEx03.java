package Example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int[] arr = new int[5];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 5���� �Է��Ͻÿ�.");
		for(int i=0; i<arr.length; i++) {
			System.out.print("> ");
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
//		Arrays.sort(arr);
//		
//		for(int i=1; i<arr.length; i++) {
//			System.out.println(arr[i]);	
//		}
//		
//		System.out.println("Max: " + arr[arr.length - 1]);
//		System.out.println("Min: " + arr[0]);

		sc.close();
	}

}
