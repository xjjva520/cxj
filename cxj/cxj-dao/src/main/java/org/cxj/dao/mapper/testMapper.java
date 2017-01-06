package org.cxj.dao.mapper;

import java.sql.SQLException;

import org.cxj.dao.pojo.Pojo;

public interface testMapper {
	int queryCount() throws SQLException;
	
	Pojo queryTest() throws SQLException;
}
