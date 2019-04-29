package Data;

import Models.User;

public interface DataAccessInterface {

	/**
	 * interface for login
	 * @param user
	 * @return
	 */
	public boolean findBylogin(User user);
	
	/**
	 * interface for registration
	 * @param user
	 * @return
	 */
	public boolean Registration(User user);
	
}
