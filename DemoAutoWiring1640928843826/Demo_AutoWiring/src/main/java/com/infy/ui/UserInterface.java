package com.infy.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.configuration.SpringConfig;
import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;

public class UserInterface {
	
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class); 
	


	public static void main(String[] args) throws Exception {
		Environment environment=null;
		ApplicationContext applicationContext =null;
		try{
			applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
			environment=applicationContext.getEnvironment();
			CustomerLoginController customerLoginController = applicationContext
					.getBean(CustomerLoginController.class);
			CustomerLoginDTO customerLogin = new CustomerLoginDTO();
			customerLogin.setLoginName("harry");
			customerLogin.setPassword("har");

			customerLoginController.authenticateCustomer(customerLogin);
			LOGGER.info(environment.getProperty("SUCCESS"));
		}catch(InfyBankException exception){
			LOGGER.error(environment.getProperty(exception.getMessage()));
		}

	}
}
