package cn.test;

import java.math.BigDecimal;
import java.sql.SQLException;

import org.cxj.dao.pojo.Pojo;
import org.cxj.service.CxjServiceImpl;
import org.cxj.service.SortService;
import org.cxj.springTest.Thinker;
import org.cxj.springTest.Writter;
import org.cxj.springTest.impl.Volunteer;
import org.cxj.springTest.impl.VolunteerWritter;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.cxj.controller.testController;

public class BeanTest  {
  public static void main(String[] args) throws SQLException {
	  AbstractApplicationContext ac = new FileSystemXmlApplicationContext("classpath:spring.xml");
	 /* BasicDataSource obj = (BasicDataSource) ac.getBean("cxjDataBase");
	   Connection conn =  obj.getConnection();
	   String sql = " select (select round(0.00000005,6) from dual) as max,(select round(-0.0000099999, 6) from dual) as min from dual";
	   PreparedStatement prepareStatement = conn.prepareStatement(sql);
	    ResultSet resultSet = prepareStatement.executeQuery();
	    while(resultSet.next()){
	     BigDecimal max = resultSet.getBigDecimal("max");
	     System.out.println("max:"+max);
	     BigDecimal min = resultSet.getBigDecimal("min");
	     System.out.println("mix:"+min);
	    }*/
	 /* SortService bean = (SortService) ac.getBean("11");
	  bean.gg();*/
	 /* CxjServiceImpl bean = (CxjServiceImpl) ac.getBean("getCxj");
	  CxjServiceImpl bean1 = (CxjServiceImpl) ac.getBean("getCxj");
	  System.out.println(bean);
	  System.out.println(bean1);*/
	  Pojo po =  new Pojo();
	  po.setMax(new BigDecimal(555));
	  po.setMin(new BigDecimal(1111));
	  //在aop中定义的切入点的实现对象只要被调用其实也就衍生了Writter接口的实现，这也就是在aop中动态的给某个对象添加新的方法
	  Thinker bean = (Thinker) ac.getBean("volunteer");
	  bean.thinkOfSomething(po);
	  Writter teer = (Writter) bean;
	  teer.write();
	  ac.close(); 
}
  
}
