package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@ViewScoped
@ManagedBean
public class User {
	
	@NotNull(message = "Please enter first name")
	@Size(min=2, max=15)
	private String firstName;
	
	@NotNull(message = "Please enter last name")
	@Size(min=2, max=15)
	private String lastName;
	

	public User() {
		
		firstName = "Chuck";
		lastName = "Henderson";
		
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
