package com.thomax.letsgo.spring.dao;

import java.sql.SQLException;

public interface IEmpTransferDao {

	int outMoney(int empno, int money) throws SQLException;
	int inMoney(int empno, int money) throws SQLException;
	
}
