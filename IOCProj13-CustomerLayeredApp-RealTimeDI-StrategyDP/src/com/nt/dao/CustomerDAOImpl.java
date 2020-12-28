package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public final class CustomerDAOImpl implements ICustomerDAO {
	public static final String INSERT_CUSTOMER_QUERY="INSERT INTO CUST_DETAILS VALUES(CUSTNO_SEQ.NEXTVAL,?,?,?,?,?,?)";
	
	private DataSource ds;
	
	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		//get polled jdbc con obj
		Connection con=ds.getConnection();
		
		//create prepared statement 
		PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
		
		//set values to query params by collecting data from bo class obj
		ps.setString(1,bo.getCname());
		ps.setString(2,bo.getCadd());
		ps.setFloat(3, bo.getpAmt());
		ps.setFloat(4, bo.getRate());
		ps.setFloat(5, bo.getTime());
		ps.setFloat(6, bo.getIntrAmt());
		
		//execute query
		int result=ps.executeUpdate();
		
		//close jdbc obj
		con.close();
		ps.close();
		//create bo class obj
		
		return result;
	}//method

}//class
