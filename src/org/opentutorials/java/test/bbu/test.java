package org.opentutorials.java.test.bbu;
/* java: long sum(int[] a); (Ŭ���� �̸�: Test)
a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��*/
public class test {
	
	public static int arrsum(int[] a) {
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int s[] = {1515,5,45,21,2,8,4,5,13,54};
		
		int b;
		b = arrsum(s);
		
		System.out.println(b);
		

	}

}
