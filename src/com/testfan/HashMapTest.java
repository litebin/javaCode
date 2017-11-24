package com.testfan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
 public static void main(String[] args) {
	 // Map��ͬ��List������key��һ��������
     Map map = new HashMap();
     map.put("���Java����",109);
     map.put("���iOS����",10);
     map.put("���Ajax����",79);

     // ����µ�value������ԭ�е�value���÷������ر����ǵ�value
     System.out.println(map.put("���iOS����",99)); // ���10
     System.out.println(map);

     // �ж��Ƿ����ָ��key
     System.out.println("�Ƿ����ֵΪ���iOS����key��"+map.containsKey("���iOS����"));
     System.out.println("�Ƿ����ֵΪ99 value��"+map.containsValue(99));

     // ����map
     System.out.println("��������1-------------");
     for (Object key : map.keySet()) {
         System.out.println(key+"-->"+map.get(key));
     }
     
     System.out.println("��������2----------------");
     Iterator<Map.Entry<Object,Object>> it=map.entrySet().iterator();  
     while(it.hasNext()){  
          Map.Entry<Object,Object> entry=it.next();  
          System.out.println("key:"+entry.getKey());  
          System.out.println("value:"+entry.getValue());  
     }  
}
}
