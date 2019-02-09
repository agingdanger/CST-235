package controllers;


import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import beans.User;
import beans.Users;

@ManagedBean
public class UserController {
	
	public String userController() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		System.out.println("You clicked something");
		System.out.println("The first name is " + user.getFirstName());
		System.out.println("The last name is " + user.getLastName());
		System.out.println("The username is " + user.getUserName());
		System.out.println("The password is " + user.getPassword());
		
		List <User> users = new ArrayList<User>();
		Users usa = new Users();
		users.add(new User(user.getFirstName(),user.getLastName(),user.getUserName(), user.getPassword(), user.getEmail(), user.getPhone()));
		
		
		System.out.println(users.get(0).getFirstName());
		usa.setUsers(users);
		
		return "LoginForm.xhtml";
	}
	
}

