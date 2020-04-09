package org.opentutorials.java.test.bbu;

public class variabletest {

	public static void main(String[] args) {
		//변수 타입 별 공부
		
		//불린 boolean = true or false
		boolean b_t = true;
		boolean b_f = false;
		
		//문자형 char = 0 ~ 65535
		char c = 'Y';
		
		//정수형 byte short int long
		byte b = 120; //-128 ~ 127
		short s = 30000; //-32,786 ~ 32,767
		int i = 21; //-21억 ~ 21억
		long l = 12345678900l; //-900경 ~ 900경	int의 범위에서 벗어날 경우 숫자뒤에 l, L 붙여야 롱형인 걸 앎
		
		//실수형 float, double
		float f = 3.5f; //3.4 x 10e-38 ~ 3.4 x 10e38
		double d = 8520.464351; //3.4 x 10e-38 ~ 3.4 x 10e38
		//실수형에서 e는 10의 제곱형으로 3.14e3f = 3140.0f 3자리 앞으로 당김
		
		//실수에서 정수, 정수에서 실수  = 변수명 앞에 (type)변수
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
