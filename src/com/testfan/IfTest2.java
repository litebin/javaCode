package com.testfan;

public class IfTest2 {
	
	public static void main(String[] args) {
		String today = args[0];
		String weather = args[1];
		
		if("��ĩ".equals(today)){
			if("����".equals(weather)){
				System.out.println("��������");
			}else{
				System.out.println("��������");
			}
			
		}else{
			System.out.println("ȥ�ϰ�");
		}
		
	}

}
