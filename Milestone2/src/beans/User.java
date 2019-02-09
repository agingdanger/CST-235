package beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;

@ApplicationScoped
@ManagedBean
public class User {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String phone;
	
	public User() {
		this.firstName = this.getFirstName();
		this.lastName = this.getLastName();
		this.userName = this.getUserName();
		this.password = this.getPassword();
		this.email = this.getEmail();
		this.phone = this.getPhone();
	}	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User(String firstName, String lastName, String userName,  String password, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

}
