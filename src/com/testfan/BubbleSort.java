package com.testfan;

/*
 * ð������
 */
// ����1 ���10��������Ҫ������������?
// ����2 ÿ���ڲ�����ɵ�ʲô��
//����3 ÿ���ڲ�����һ��������
//http://www.cnblogs.com/shen-hua/p/5422676.html
public class BubbleSort {
	public static void main(String[] args) {
		String t = "";
		int[] arr = { 6, 3, 8, 2, 9, 1 };
		System.out.println(" ����ǰ");
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		// �㷨˼����ÿ��ѡ��һ��ֵ
		for (int i = 0; i < arr.length - 1; i++) {// ���ѭ��������������
			for (int j = 0; j < arr.length - 1 - i; j++) {// �ڲ�ѭ������ÿһ��������ٴ�,�����ֵ����
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			break;
		}
		System.out.println("����������Ϊ");
		for (int i : arr) {
			System.out.print(i);
		}

	}
}