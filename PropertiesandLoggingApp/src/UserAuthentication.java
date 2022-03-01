

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {
	
	Log logger = LogFactory.getLog(UserAuthentication.class);
	
	public void loginUser(String username, String password) throws Exception{
		try {
			if(username.isBlank() || password.isBlank()) {
				throw new Exception("Service.INVALID_CREDENTIALS");
			}
			logger.info(username+" logged in successfully");
		} catch(Exception exception) {
			logger.error(exception.getMessage(), exception);
			throw exception;
		}
	}
}
