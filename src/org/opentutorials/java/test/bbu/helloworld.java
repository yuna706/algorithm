package org.opentutorials.java.test.bbu;

import java.util.Arrays;

public class helloworld {

	public static void main(String[] args) {
		
//		System.out.println(a)
		//구구단 출력
		int[] sum = new int[8];
		
		Arrays.fill(sum, 0);
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "     ");
				sum[i-2] += i*j;				
			}
			System.out.println();
		}
		
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
	}
}
