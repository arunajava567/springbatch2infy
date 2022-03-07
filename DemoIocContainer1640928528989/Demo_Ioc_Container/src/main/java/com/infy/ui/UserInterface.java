package com.infy.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.WelcomeBean;
import com.infy.configuration.SpringConfig;

public class UserInterface {
	public static final Log LOGGER = LogFactory.getLog(UserInterface.class); 

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		WelcomeBean welcomeBean = applicationContext.getBean(WelcomeBean.class);
		LOGGER.info(welcomeBean.printWelcome());
	}
}
