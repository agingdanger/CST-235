package controllers;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import beans.User;
import business.MyTimerService;
import business.OrdersBusinessInterface;
//import business.OrdersBusinessService;

@ManagedBean
@ViewScoped
public class FormController {
	@Inject
	OrdersBusinessInterface service;
	
	@EJB
	MyTimerService timer;
	
	//@EJB
	//OrdersBusinessService serve;

	public String onSubmit(User user) {
		
		timer.setTimer(10000);
		
		//Call business service(for testing only and to demo CDI)
		service.test();
		
		//serve.test();
		
		//forward to test response view along with the user managed bean
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
			return "Response.xhtml";
//		//get the user value from the input form
//		FacesContext context = FacesContext.getCurrentInstance();
//		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
//				
//		//show the user object in the console log
//		System.out.println("You clicked something");
//		System.out.println("The first name is " + user.getFirstName());
//		System.out.println("The last name is " + user.getLastName());
		
		//put the user object into the post request
		
		
		//return the next page
		//return "Response.xhtml";
				
		
	}
	
	public OrdersBusinessInterface getService(){
		return service;
	}
	

	
//	private void getAllOrders() {
//		
//		Connection conn = null;
//		String url = "jdbc:postgresql://localhost:5432/testapp";
//		String username = "postgres";
//		String password = "root";
//		String sql = "SELECT * FROM testapp.testapp.Orders";
//		try {
//			conn = DriverManager.getConnection(url, username, password);
//			Statement stmt = conn.createStatement();
//			ResultSet res = stmt.executeQuery(sql);
////			while(res.next()) {
////				System.out.println(String.format("ID is %d for Product %s at a price of %f", res.g));
////			}
//		}
//		catch(SQLException e){
//			System.out.println("Failure!");
//		}
	//}
}
