package controllers;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import beans.User;
import beans.Users;

@ManagedBean
public class UserController {
	
	public String userController(User user) {
		
		//get the user value from the input form
		//FacesContext context = FacesContext.getCurrentInstance();
		//User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		//User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		//Print out the current user information
		System.out.println("You clicked something");
		System.out.println("The first name is " + user.getFirstName());
		System.out.println("The last name is " + user.getLastName());
		System.out.println("The username is " + user.getUserName());
		System.out.println("The password is " + user.getPassword());
		
		//puts the user information into a list
		List <User> users = new ArrayList<User>();
		Users usa = new Users();
		users.add(new User(user.getFirstName(),user.getLastName(),user.getUserName(), user.getPassword(), user.getEmail(), user.getPhone()));
		
		
		System.out.println(users.get(0).getFirstName());
		usa.setUsers(users);
		//sends from registration form to login form
		return "LoginForm.xhtml";
	}
	
}

