package com.testfan;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();  
	    lList.add("1");  
	    lList.add("2");  
	    lList.add("3");  
	    lList.add("4");  
	    lList.add("5");  
	    System.out.println("����ĵ�һ��Ԫ���� : " + lList.getFirst());  
	    System.out.println("�������һ��Ԫ���� : " + lList.getLast());  
//	    lList.removeFirst();  
//	    lList.removeLast();  
//	    add(int index, Object element)
	}
}
