package com.testfan;

public class IfTest {
	public static void main(String[] args) {
		int score = Integer.valueOf(args[0]);

		if(score>90){
			System.out.println("����iphone7s");
		}else if(score>70){
			System.out.println("��������");
		}else {
			System.out.println("���Գ�500�ź�");
		}
	}

}
