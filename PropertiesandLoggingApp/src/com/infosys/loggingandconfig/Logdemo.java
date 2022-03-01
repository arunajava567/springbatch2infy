package com.infosys.loggingandconfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class Logdemo {	
	static Log logger = LogFactory.getLog(Logdemo.class);
	public static void main(String[] args) {
		logger.info("started...");
		Loan.getEmi();
		logger.warn("warning..");
		logger.fatal("");
		logger.error("error..");
		logger.debug("debg");
	
		logger.info(" main completed..");
	}
}
