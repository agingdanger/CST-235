package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
public class FormController {

	public String onSubmit() {
		
		//get the user value from the input form
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
				
		//show the user object in the console log
		System.out.println("You clicked something");
		System.out.println("The first name is " + user.getFirstName());
		System.out.println("The last name is " + user.getLastName());
		System.out.println("The username is " + user.getUserName());
		System.out.println("The password is " + user.getPassword());
		
		//put the user object into the post request
		//FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		//return the next page
		return "Response.xhtml";
				
		
	}
}
