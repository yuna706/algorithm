package org.opentutorials.java.test.bbu;

public class public_test {

    // static ������ �������� ���� �Ϲ� ������ �������� ���� ������
    int count;
    //static int count;

    public public_test() {
        this.count ++;
        System.out.println("���ƿ� ���� : " + this.count);
    }

    public static void main(String[] args) {
    	public_test hc1 = new public_test();
    	public_test hc2 = new public_test();
    }
}
