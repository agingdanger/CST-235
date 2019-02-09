package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
//import javax.faces.context.FacesContext;
//import javax.faces.bean.SessionScoped;

@ApplicationScoped
@ManagedBean
public class Users {
	List <User> users = new ArrayList<User>();



	//FacesContext context = FacesContext.getCurrentInstance();
	//User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
//	
	
	

	public Users() {
		User use = new User();
		//users.add(new User("John", "Smith", "JSmith", "1234"));
		users.add(new User(use.getFirstName(),use.getLastName(),use.getUserName(), use.getPassword(), use.getEmail(), use.getPhone()));
	}
	
	
	
	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		

		
		
//		this.users = users;
//		users.add(new User(use.getFirstName(),use.getLastName(),use.getUserName(), use.getPassword()));
	}

	
}
