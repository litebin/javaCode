package com.testfan;

public class StringTest {
	public static void main(String[] args) {
		
		    String str1="aaa";
		    String str2="aaa";
		    System.out.println("===========test1============");
		    System.out.println(str1==str2);//true ���Կ���str1��str2��ָ��ͬһ������ 
		    
		    //new String() �������ַ��������볣������
		    String str3=new String("aaa");
		    String str4=new String("aaa");
		    System.out.println("===========test2============");
		    System.out.println(str3==str4);//false ���Կ�����new�ķ�ʽ�����ɲ�ͬ�Ķ��� 
		    System.out.println(str3.equals(str4));//true
		    
		    StringBuffer sb = new StringBuffer("TestString");
		    sb.insert(4,false);
            System.out.println(sb.toString());
		    
		    
		    
	}

}
