package com.infy.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;

@Service(value="customerLoginService")
//@Component
public class CustomerLoginServiceImpl implements CustomerLoginService {

	//@Autowired
	private CustomerLoginRepository customerLoginRepository;
	
	@Autowired
	public CustomerLoginServiceImpl(CustomerLoginRepository customerLoginRepository) {
		
		this.customerLoginRepository = customerLoginRepository;
	}


	/*
	 * @Autowired public void setCustomerLoginRepository(CustomerLoginRepository
	 * customerLoginRepository) { this.customerLoginRepository =
	 * customerLoginRepository; }
	 */

	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyBankException {
		try {
			String toRet = null;
			CustomerLoginDTO customerLoginFromDao = customerLoginRepository
					.getCustomerLoginByLoginName(customerLogin.getLoginName());
			if (customerLogin.getPassword().equals(customerLoginFromDao.getPassword())){
				toRet = "SUCCESS";
			}else{
				throw new InfyBankException("Service.WRONG_CREDENTIALS");
			}
			return toRet;
			
		}catch(InfyBankException exception) {
			Log LOGGER = LogFactory.getLog(this.getClass()); 
			LOGGER.error(exception.getMessage(),exception);
			throw exception;
		}

	}
}
