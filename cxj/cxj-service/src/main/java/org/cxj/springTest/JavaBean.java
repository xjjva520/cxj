package org.cxj.springTest;

import org.cxj.service.CxjServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author cxj
 * 这个其实就是其实相当于xml定义了一个<beans>
 * 已方法名为bean的ID
 *
 */
@Configuration
public class JavaBean {
   @Bean
   public CxjServiceImpl getCxj(){
	   return new CxjServiceImpl();
   }
   
   
}
