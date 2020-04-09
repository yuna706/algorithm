package org.opentutorials.java.test.bbu;

import java.util.Scanner;

public class time {
	public static int h = 1000*60*60;
	public static int m = 1000*60;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("얼마 후에 일어나실 건가요? 시간, 분");
		int user_h = sc.nextInt();
		int user_m = sc.nextInt();
		
		while (user_h > 24 || user_m >= 60) {
			System.out.println("다시 입력해주세요. 시간, 분");
			user_h = sc.nextInt();
			user_m = sc.nextInt();
		}
		
		System.out.println("일어날 시간은" + user_h + "시간" + user_m + "분 후입니다.");
		
		
		// 시스템에게 현재 시간 + 몇시간 후 웅앵 더한 시간 알아내고 시스템 시간이 그 시간과 일치하면 알람 울리기
	}
	
	public static long hour(int user_h) {
		
		long wait_h = user_h * h;
		return wait_h;
	}
	
	public static long minute(int user_m) {
		
		long wait_m = user_m * m;
		return wait_m;
	}
}
