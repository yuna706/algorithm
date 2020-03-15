package org.opentutorials.java.test.bbu;

public class public_test {

    // static 변수로 실행했을 때와 일반 변수로 실행했을 때의 차이점
    int count;
    //static int count;

    public public_test() {
        this.count ++;
        System.out.println("좋아요 갯수 : " + this.count);
    }

    public static void main(String[] args) {
    	public_test hc1 = new public_test();
    	public_test hc2 = new public_test();
    }
}
