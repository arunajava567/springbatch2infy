package com.infosys.loggingandconfig;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Loan {
	static Log logger = LogFactory.getLog(Loan.class);

	public static void getEmi() {
		logger.info("get EMi funciton is called...");
		
		System.out.println("EMI: 10000.00");
		
		logger.info("method end succcessfully..");
	}

}
