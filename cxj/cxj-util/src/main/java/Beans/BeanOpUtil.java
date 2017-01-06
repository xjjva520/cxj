package Beans;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.springframework.beans.BeanUtils;

import com.alibaba.fastjson.JSONObject;

public class BeanOpUtil {

    /**
     * 传实体类进来，将该类的属性已字符串的形式出去
     * 重写实体的toString方法即可
     * @param obj
     * @return
     * @throws Exception 
     */
    public static String getBeanStr(Object obj) throws Exception{
       //反射的练习
       Class<? extends Object> clazz=obj.getClass();	
       try {
		Method method = clazz.getMethod("toString",new Class[]{});
		String str = (String) method.invoke(obj);
		return str;
	   } catch (Exception e) {
	 	throw new Exception(e);
	   }
    }
    
    /**
     * 该方法也是将实体以字符串的形式传出去，不过不用重写toString方法。利用spring封装好BeanUtils的PropertyDescriptor类
     * @param obj
     * @return
     * @throws Exception
     */
    public static String getBeanToStr(Object obj) throws Exception{
    	StringBuffer buffer = new StringBuffer();
      //专门操作javaBean中属性的类，给属性设置值，获取值
      PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(obj.getClass());
      for(PropertyDescriptor pro:propertyDescriptors){
    	  String properName = pro.getName();
    	  if("class".equals(pro.getName())){
    		  continue;
    	  };
    	  buffer.append(properName);
    	  buffer.append("=");
    	  Method readMethod = pro.getReadMethod();//获取该属性读取的值
    	  String proValue =  readMethod.invoke(obj).toString();
    	  buffer.append(proValue);
    	  buffer.append(",");
      }
      buffer.deleteCharAt(buffer.length()-1);
      return buffer.toString();
    }
    /**
     * 通过json的形式将实体以字符串的形式返回
     * @return
     * @throws Exception
     */
    public static String getBeanStrByJson(Object obj) throws Exception{
    	String jsonString = JSONObject.toJSONString(obj);
    	return jsonString;
    }
}
