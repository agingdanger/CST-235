package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import Business.UserBusinessInterface;
import Models.User;

@ManagedBean
@ViewScoped

public class LoginController {

		@Inject
		UserBusinessInterface service;
	
	/**
	 * controller for login
	 * @param user
	 * @return
	 */
	public String login(User user)
	{
		if(service.Authenticate(user))
			return "index.xhtml";
		else
			return "LoginFaild.xhtml";
			
		
	}
	
	/**
	 * controller for registration
	 * @param user
	 * @return
	 */
	public String Registration(User user)
	{
		if(service.Registration(user))
			return "RegistrationSuccess.xhtml";
		else
			return "RegistrationForm.xhtml";
	}
	
	/**
	 * controller for logout
	 * @return
	 */
	public String logOut()
	{
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		
		return "LoginForm.xhtml?faces-redirect=true";
	}
	
	
	

}
