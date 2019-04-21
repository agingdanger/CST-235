package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
//import javax.faces.context.FacesContext;
//import javax.faces.bean.SessionScoped;

@ApplicationScoped
@ManagedBean

//class Users is housing for a user list meant for a standin database to crosscheck login(work in progress)
public class Users {
	List <User> users = new ArrayList<User>();



	//FacesContext context = FacesContext.getCurrentInstance();
	//User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
//	
	
	
	//constructs null object in list of users
	public Users() {
		User use = new User();
		//users.add(new User("John", "Smith", "JSmith", "1234"));
		users.add(new User(use.getFirstName(),use.getLastName(),use.getUserName(), use.getPassword(), use.getEmail(), use.getPhone()));
	}
	
	
	//returns users
	public List<User> getUsers() {
		return users;
	}


	//sets a new user list as current list(work in progress)
	public void setUsers(List<User> users) {
		

		
		
//		this.users = users;
//		users.add(new User(use.getFirstName(),use.getLastName(),use.getUserName(), use.getPassword()));
	}

	
}
