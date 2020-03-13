package org.opentutorials.java.test.bbu;

import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int test = 5;
		
		Scanner aa = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			int a = aa.nextInt();
			arr[i] = a*10;
			System.out.println(arr[i]);
		}
	}
	

}
