package org.cxj.util.logger;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Beans.BeanOpUtil;

public class LoggerUtil {
    private static final Logger logger = LoggerFactory.getLogger("operation.log");//从配置文件中，拿到指定名称的logger对象
    
    /**
     * 
     * @param title  主题
     * @param operator 操作者
     * @param operation 做什么操作
     * @param clazz obj类
     * 重写toString
     */
    public static <T>void infoLog(String title,String operator,String operation,Object obj){
    	 
		try {
			logger.info("{} {} userName:{},{},{}{}:{}", new Object[]{
					title,operation,operator,BeanOpUtil.getBeanToStr(obj) 
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    }
    
    public static void infoLog(String title,String operator,String operation,Object oldObj,Object newObj){
    	try {
			logger.info("{} {} userName:{},oldValue:{},newValue{},{}:{}", new Object[]{
					title,operation,operator,BeanOpUtil.getBeanStr(oldObj),BeanOpUtil.getBeanStr(newObj) 
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void  debugLog(String title,String operator,String operation,Object oldObj,Object newObj){
    	try{
    		logger.debug("{} {} userName:{},oldValue:{},newValue{},{}:{}", new Object[]{
					title,operation,operator,BeanOpUtil.getBeanStrByJson(oldObj),BeanOpUtil.getBeanStrByJson(newObj) 
			});
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }	
    
    
}
