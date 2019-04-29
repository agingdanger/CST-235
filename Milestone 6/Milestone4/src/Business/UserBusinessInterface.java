package Business;

import Models.User;

public interface UserBusinessInterface {

	/**
	 * interface for login
	 * @param user
	 * @return
	 */
	public boolean Authenticate(User user);
	
	/**
	 * interface for registration
	 * @param user
	 * @return
	 */
	public boolean Registration(User user);
}
