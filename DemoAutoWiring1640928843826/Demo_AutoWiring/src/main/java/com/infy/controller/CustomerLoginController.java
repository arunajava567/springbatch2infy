package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.service.CustomerLoginService;

@Controller(value="customerLoginController")
//@Component
public class CustomerLoginController {

	//@Autowired //implicit DI
	private CustomerLoginService customerLoginService; //new CustomerLoginServiceImpl();
	
	
	
	//@Autowired
	/*
	 * public void setCustomerLoginService(CustomerLoginService
	 * customerLoginService) { this.customerLoginService = customerLoginService; }
	 */


	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyBankException {
		return customerLoginService.authenticateCustomer(customerLogin);
		 
	}


	@Autowired
	public CustomerLoginController(CustomerLoginService customerLoginService) {
		
		this.customerLoginService = customerLoginService;
	}
}
