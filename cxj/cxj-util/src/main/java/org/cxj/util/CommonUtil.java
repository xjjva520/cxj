package org.cxj.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {
   /**
    * 数字转换	
    * @param num
    * @return
    */
   public static int  praseInt(String num){
	 Integer rnum = null;
	 if(num!=null){
		 rnum = Integer.parseInt(num);
	 }
	return rnum;   
   }
   
   public static String replaceStr(String str,String tiHuan){
	    String regEx = "[' ']+"; // 一个或多个空格  
	   Pattern p = Pattern.compile(regEx);  
	   Matcher m = p.matcher(str);
	   return m.replaceAll(tiHuan).trim();
	 
   }
}
