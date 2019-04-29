package Data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.User;

public class SecurityDAO implements DataAccessInterface{

	
	/**
	 * method for login
	 */
	public boolean findBylogin(User user)
	{
		Connection conn = null;
		String url = "jdbc:postgresql://localhost:5432/Books";
		String username = "postgres";
		String password = "root";
		
		
		String sql = "SELECT * FROM books.users where username = '" + user.getUserName()+ "' AND password = '"+ user.getPassword()+"'";
		
		try {
		System.out.println("I am in SecurityDAO.findBylogin");
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();
		ResultSet res = stmt.executeQuery(sql);
		if (res.next())
		{
			System.out.println("login success");
			return true;
		}
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(conn != null) {
				try {
					conn.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	
	/**
	 * method for registration
	 */
	public boolean Registration(User user)
	{
		Connection conn = null;
		String url = "jdbc:postgresql://localhost:5432/Books";
		String username = "postgres";
		String password = "root";
		
		//String sql = "INSERT INTO books.user (username, password, firstname, lastname, role, email, phone) VALUES('"+user.getUserName()+"','"+user.getPassword()+"','"+user.getFirstName()+"','"+user.getLastName()+",'2','"+user.getEmail()+"','"+user.getPhone()+"')";
		String sql = "INSERT INTO books.users (username, password, firstname, lastname, role, email, phone) VALUES(?,?,?,?,?,?,?)";

		try
		{
			conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement prepared = conn.prepareStatement(sql);
			prepared.setString(1, user.getUserName());
			prepared.setString(2, user.getPassword());
			prepared.setString(3, user.getFirstName());
			prepared.setString(4, user.getLastName());
			prepared.setInt(5, 2);
			prepared.setString(6, user.getEmail());
			prepared.setString(7, user.getPhone());
			
			prepared.executeUpdate();
			
			return true;
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(conn != null) {
				try {
					conn.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
}
