package org.opentutorials.java.test.bbu;

import java.util.Scanner;

public class time {
	public static int h = 1000*60*60;
	public static int m = 1000*60;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� �Ŀ� �Ͼ�� �ǰ���? �ð�, ��");
		int user_h = sc.nextInt();
		int user_m = sc.nextInt();
		
		while (user_h > 24 || user_m >= 60) {
			System.out.println("�ٽ� �Է����ּ���. �ð�, ��");
			user_h = sc.nextInt();
			user_m = sc.nextInt();
		}
		
		System.out.println("�Ͼ �ð���" + user_h + "�ð�" + user_m + "�� ���Դϴ�.");
		
		
		// �ý��ۿ��� ���� �ð� + ��ð� �� ���� ���� �ð� �˾Ƴ��� �ý��� �ð��� �� �ð��� ��ġ�ϸ� �˶� �︮��
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
