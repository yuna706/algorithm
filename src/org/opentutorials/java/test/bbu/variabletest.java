package org.opentutorials.java.test.bbu;

public class variabletest {

	public static void main(String[] args) {
		//���� Ÿ�� �� ����
		
		//�Ҹ� boolean = true or false
		boolean b_t = true;
		boolean b_f = false;
		
		//������ char = 0 ~ 65535
		char c = 'Y';
		
		//������ byte short int long
		byte b = 120; //-128 ~ 127
		short s = 30000; //-32,786 ~ 32,767
		int i = 21; //-21�� ~ 21��
		long l = 12345678900l; //-900�� ~ 900��	int�� �������� ��� ��� ���ڵڿ� l, L �ٿ��� ������ �� ��
		
		//�Ǽ��� float, double
		float f = 3.5f; //3.4 x 10e-38 ~ 3.4 x 10e38
		double d = 8520.464351; //3.4 x 10e-38 ~ 3.4 x 10e38
		//�Ǽ������� e�� 10�� ���������� 3.14e3f = 3140.0f 3�ڸ� ������ ���
		
		//�Ǽ����� ����, �������� �Ǽ�  = ������ �տ� (type)����
		double o = (double)i / f; 
		int w = i / (int)f;
		
		
		System.out.println(b_t);
		System.out.println(b_f);
		
		System.out.println(c);
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(o);
		System.out.println(w);
	}

}
