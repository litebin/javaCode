package com.testfan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {
	  //�����ַ�ʽ��������List
      
     // List<String> list = new ArrayList<String>();
      
      List<String> list = new ArrayList<String>();
      
      list.add("6");
      list.add("3");
      list.add("9");
      list.add("9");
      list.add("9");
      
      System.out.println("----------��ʽ1-----------");
      //��һ�ַ�ʽ����ͨforѭ��
      for(int i = 0; i < list.size(); i++)
      {
          System.out.println(list.get(i));
          
      }
      
      System.out.println("----------��ʽ2-----------");
      //�ڶ��ַ�ʽ��ʹ�õ�����
      for(Iterator<String> iter = list.iterator(); iter.hasNext();)
      {
          System.out.println(iter.next());
      }
      System.out.println("----------��ʽ3-----------");
      //�����ַ�ʽ��ʹ����ǿ�͵�forѭ��
      for(String str: list)
      {
          System.out.println(str);
          
      }
      
//      System.out.println("----------���ݷ�ת-----------");
//      Collections.sort(list);
//      //Collections.reverse(list);
//      for (String string : list) {
//		System.out.println(string);
//	 }
}
}
