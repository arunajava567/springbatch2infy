package com.infy.ui;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;

public class UserInterface {

	private static final Log LOGGER = LogFactory.getLog(UserInterface.class);
	
	public static void main(String[] args) throws Exception {
		
		PropertiesConfiguration config = new Configurations().properties("configuration.properties");
		try {
			//1
			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			customerLoginDTO.setLoginName("harry");
			customerLoginDTO.setPassword("har123");
			
			//2
			CustomerLoginController customerLoginController = new CustomerLoginController();
			String message = customerLoginController.authenticateCustomer(customerLoginDTO);
			LOGGER.info(config.getProperty(message));
		} catch (Exception exception) {
			LOGGER.info(config.getProperty(exception.getMessage()));
		}
	}
}
