package org.cxj.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
/**
 * 关于ireport打印的类必须实现JRDataSource接口
 * @author Administrator
 *
 */
public class JasreportImpl implements JRDataSource{
	private List<?>objList;
	private int index = -1;
    
	@Override
	public Object getFieldValue(JRField arg0) throws JRException {
		String name = arg0.getName();//这个实际上是拿到报表 中定义的名称。这个定义的名称其实相当于某个对象中的属性名
		
		try {
			Object val =PropertyUtils.getProperty(objList.get(index), name);//这个步骤就是拿到该属性的值，所以报表中定义的名称应该与属性名一样。
			return val;
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean next() throws JRException {
	    index++;
	    return index<objList.size();
	    
	}

	public List<?> getObjList() {
		return objList;
	}

	public void setObjList(List<?> objList) {
		this.objList = objList;
	}

	
    
}
