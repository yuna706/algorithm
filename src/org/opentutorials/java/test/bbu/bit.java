package org.opentutorials.java.test.bbu;

public class bit {

	public static void main(String[] args) {
		// ��Ʈ������ ���� - 84p
		
		// &(and)
		int a = 5;
		int b = 10;
		int result = a & b;
		System.out.println(result);
		
		b = 6;
		result = a & b;
		System.out.println(result);
		
		b = 10;
		
		// |(or)
		result = a | b; 
		System.out.println(result);
		// ^(xor)
		result = a ^ b; 
		System.out.println(result);
		// ~(����)
		result = ~ b; 
		System.out.println(result);
		
	}

}
