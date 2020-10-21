package chapter07;

import java.util.Arrays;

public class ArrayCopy01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int[] arr1 = new int[] {10, 20, 30};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		
		int[] arr3 = new int[10];
		System.arraycopy(arr1, 0, arr3, 5, arr1.length-1);
		
		//for(int a: arr3) {
		for(int i=0; i<arr3.length; i++) {
			System.out.println("[" + i + "]: " + arr3[i]);
		}
		System.out.println();
		
		int[] arr4 = Arrays.copyOf(arr1, 5);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("[" + i + "]: " + arr4[i]);
		}
	}

}
