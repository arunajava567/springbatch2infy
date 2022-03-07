package com.infy.service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyBankException;
}
