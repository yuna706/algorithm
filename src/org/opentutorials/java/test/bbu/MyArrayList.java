package org.opentutorials.java.test.bbu;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {

	public static void main(String[] args) {
		// ArrayList형 변수 myList만들기
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			Integer a = sc.nextInt();
			if(a == 0) break;
			list.add(a);
		};
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		};
	}

}
