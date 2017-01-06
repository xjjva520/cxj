package org.cxj.springTest.impl;

import org.cxj.dao.pojo.Pojo;
import org.cxj.springTest.MindReader;


public class CxjReader implements MindReader {

	@Override
	public void readerThougth(Pojo thoughts) {
		System.out.println("this is volunteer's thougthts:"+thoughts.getMax());
		
	}

}
