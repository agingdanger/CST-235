package Models;

import java.security.Principal;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
//import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@SessionScoped
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
	@Size(min=8, max=20)
	private String phone;
	
	private int role;
	
	
	@PostConstruct
	/**
	 * get current instance of user
	 */
	public void init()
	{
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
	
	
	//constructor for model user has 6 attributes
	/**
	 * user constructor
	 */
	public User() {
		this.firstName = this.getFirstName();
		this.lastName = this.getLastName();
		this.userName = this.getUserName();
		this.password = this.getPassword();
		this.email = this.getEmail();
		this.phone = this.getPhone();
		this.role = this.getRole();
	}	
	
	//model constructor user takes 6 arguments and sets them to current instance
	/**
	 * user constructor
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param password
	 * @param email
	 * @param phone
	 * @param role
	 */
	public User(String firstName, String lastName, String userName,  String password, String email, String phone, int role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role = role;
		
	}
	//returns email
	/**
	 * getter for email
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * setter for email
	 * @param email
	 */
	//sets email
	public void setEmail(String email) {
		this.email = email;
	}
	//return phone
	/**
	 * getter for phone number
	 * @return
	 */
	public String getPhone() {
		return phone;
	}
	//sets phone
	/**
	 * setter for phone number
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//returns username
	/**
	 * getter for username
	 * @return
	 */
	public String getUserName() {
		return userName;
	}
	//sets username
	/**
	 * setter for username
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//returns password
	/**
	 * getter for password
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	//sets password
	/**
	 * setter for password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	//returns firstname
	/**
	 * getter for first name
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	//sets firstname
	/**
	 * setter for first name
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//returns lastname
	/**
	 * getter for last name
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
    
	/**
	 * setter for last name
	 * @return set last name to current instance
	 */
	//sets lastname
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * getter for role number
	 * @return
	 */
	public int getRole()
	{
		return role;
	}
	
	/**
	 * setter for role number
	 * @param role
	 */
	public void setRole(int role)
	{
		this.role = role;
	}

}
