package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface ICustomerMgmtService {
	public String calculate_interestBillAmount(CustomerDTO dto)throws Exception;
}
