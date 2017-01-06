package org.cxj.service;

import org.cxj.service.impl.SortServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
	@Autowired
	private testService service;
   public static void main(String[] args) {
	   
	   
}
   public static void testSort(){
	   SortService ser = new SortServiceImpl();
	   try {
		   int [] b = {2,3,4,5};
		   int []a = ser.sort(4,b);
		for(int l=0;l<a.length;l++){
		   System.out.println(a[l]);
		}
	} catch (Exception e) {
		
	}
   }
}
