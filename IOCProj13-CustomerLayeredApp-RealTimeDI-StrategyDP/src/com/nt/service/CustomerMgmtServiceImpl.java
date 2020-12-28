package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService{
	private ICustomerDAO dao;
	
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
	}


	@Override
	public String calculate_interestBillAmount(CustomerDTO dto) throws Exception {
		
		//write b.logic to calculate Simple interest Amount based on pAmt,rate,time
		float intrAmt=(dto.getpAmt()*dto.getRate()*dto.getTime())/100;
		
		//prepared CustomerBO obj having persistance data
		CustomerBO bo=new CustomerBO();
		
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setpAmt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setIntrAmt(intrAmt);
		
		//use DAO class obj
		int count=dao.insert(bo);
		
		//immeridate if or ternary operator
		return count==0?"Customer Registration Failed..!":"Customer Registration Success..!::Details are-->PtincipleAmount::"+ dto.getpAmt()+  " Rate::"+dto.getRate()+  " Time::"+dto.getTime()+  " SimpleInterestAmount::"+intrAmt;
		
	}//method

}//class
