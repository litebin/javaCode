package com.testfan;

public class TablesTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int n = 1; n <= i; n++) {
				//������
				System.out.print(i + " x " + n + " = " + i * n + " ");
			}
			//ÿ�����껻��һ��
			System.out.println();
		}
	}
}

