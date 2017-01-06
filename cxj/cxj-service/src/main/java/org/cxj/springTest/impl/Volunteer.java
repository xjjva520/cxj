package org.cxj.springTest.impl;

import org.cxj.dao.pojo.Pojo;
import org.cxj.springTest.Thinker;

public class Volunteer implements Thinker {
   
	
	@Override
	public void thinkOfSomething(Pojo thoughts) {
	 System.out.println("自愿者现在所想："+thoughts.getMax()+"~~~~~~~~~~~~");	
	}
   
	
}
