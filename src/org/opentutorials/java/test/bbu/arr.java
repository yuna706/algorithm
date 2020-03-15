package org.opentutorials.java.test.bbu;

import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			arr[i] = a*10;
			System.out.println(arr[i]);
		}
	}
	

}
