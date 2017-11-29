package com.testfan.day2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
	
	 public static void readTxtFile1(String path) throws IOException{
		
	        FileInputStream fis = new FileInputStream(path);  
	      
	        //����һ������Ϊ1024���ڴ�ռ䣬1024�㹻��
	        byte[] bbuf = new byte[1024];  
	          
	        //���ڱ���ʵ�ʶ�ȡ���ֽ���           
	        int hasRead = 0;  
	        //ʹ��ѭ�����ظ���ȡ����  
	        while( (hasRead = fis.read(bbuf)) > 0){  
	              
	            //���ֽ�����ת��Ϊ�ַ������  
	            System.out.print(new String(bbuf,0,hasRead));  
	              
	        }  
	          
	        //�ر��ļ������������finally�������ȫ  
	        fis.close();  
	 }
	
	public static void main(String[] args) {
		try {
			readTxtFile1("E:\\data\\test\\test3\\testfan.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
