package Business;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;


import Data.SecurityDAO;
import Models.User;

@Stateless
@Local(UserBusinessInterface.class)
@LocalBean
public class SecurityService implements UserBusinessInterface{
	
	
	/**
	 * method for login
	 */
	public boolean Authenticate(User user)
	{

		SecurityDAO sd = new SecurityDAO();
		System.out.println("I am in SecurityService.Authenticate");
		return sd.findBylogin(user);
	}
	
	/**
	 * method for registration
	 */
	public boolean Registration(User user)
	{
		SecurityDAO sd = new SecurityDAO();
		
		return sd.Registration(user);
	}

}
