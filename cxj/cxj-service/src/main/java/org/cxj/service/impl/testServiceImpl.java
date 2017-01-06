package org.cxj.service.impl;


import java.sql.SQLException;

import org.cxj.dao.mapper.testMapper;
import org.cxj.dao.pojo.Pojo;
import org.cxj.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testServiceImpl implements testService {
     @Autowired
	private testMapper mapper;
	
	
	@Override
	public int getCount() {
		Pojo queryTest;
		try {
			queryTest = mapper.queryTest();
			System.out.println("max:....."+queryTest.getMax());
			System.out.println("mix:....."+queryTest.getMin());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return 0;
	}
}
