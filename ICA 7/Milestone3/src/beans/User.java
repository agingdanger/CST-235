package beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
//import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.security.Principal;

@ApplicationScoped
@ManagedBean

//Class user is model for clients
public class User {
	@NotNull(message = "Please enter First Name")
	@Size(min=2, max=15)
	private String firstName;
	
	@NotNull(message = "Please enter Last Name")
	@Size(min=2, max=15)
	private String lastName;
	
	@NotNull(message = "Please enter Username")
	@Size(min=2, max=15)
	private String userName;
	
	@NotNull(message = "Please enter Password")
	@Size(min=2, max=15)
	private String password;
	
	@NotNull(message = "Please enter Email")
	private String email;
	
	@NotNull(message = "Please enter Phone")
	private String phone;
	
	//constructor for model user has 6 attributes
	public User() {
		this.firstName = this.getFirstName();
		this.lastName = this.getLastName();
		this.userName = this.getUserName();
		this.password = this.getPassword();
		this.email = this.getEmail();
		this.phone = this.getPhone();
	}	
	
	//model constructor user takes 6 arguments and sets them to current instance
	public User(String firstName, String lastName, String userName,  String password, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		
	}
	
	@PostConstruct
	public void init() {
		// Get the logged in Principle
		Principal principle= FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
			if(principle == null)
			{
				setFirstName("Unknown");
				setLastName("");
			}
			else
			{
				setFirstName(principle.getName());
				setLastName("");
			}

	}
	
	//returns email
	public String getEmail() {
		return email;
	}
	//sets email
	public void setEmail(String email) {
		this.email = email;
	}
	//return phone
	public String getPhone() {
		return phone;
	}
	//sets phone
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//returns username
	public String getUserName() {
		return userName;
	}
	//sets username
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//returns password
	public String getPassword() {
		return password;
	}
	//sets password
	public void setPassword(String password) {
		this.password = password;
	}
	//returns firstname
	public String getFirstName() {
		return firstName;
	}
	//sets firstname
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//returns lastname
	public String getLastName() {
		return lastName;
	}
    
	/**
	 * 
	 * @return set last name to current instance
	 */
	//sets lastname
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
