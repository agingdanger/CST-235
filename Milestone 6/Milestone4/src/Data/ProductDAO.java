package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Models.Product;
import Models.User;

@ManagedBean
@SessionScoped
public class ProductDAO implements ProductDataInterface
{
	
	  /**
	   * method return all product
	   */
	  public List<Product> findAll() {
	    	Connection conn = null;
	    	List<Product> products  = new ArrayList<>();
			String url = "jdbc:postgresql://localhost:5432/Books";
			String username = "postgres";
			String password = "root";
			String sql = "SELECT * FROM books.products";
			try {
				conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
				ResultSet res = stmt.executeQuery(sql);
				while(res.next()) {
					products.add(new Product(res.getInt("ID"), res.getString("productname"), res.getString("productdescription"), res.getFloat("price")));
				}
				res.close();
			}
			catch(SQLException e){
				e.printStackTrace();
				//System.out.println("Failure!");
			}
			finally {
				if(conn != null) {
					try {
						conn.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			return products;
	    }
	  
	  
	  /**
	   * find a product by id
	   */
	  public Product findByID(int productID)
	  {
		  Connection conn = null;
	    	
//		  	int prodID = Integer.parseInt(productID);
		  	Product product = new Product();
			String url = "jdbc:postgresql://localhost:5432/Books";
			String username = "postgres";
			String password = "root";
			String sql = "select * FROM books.products where id = '"+productID+"'";
			try {
				conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
				ResultSet res = stmt.executeQuery(sql);
				while(res.next()) {
					
				product = new Product(res.getInt("ID"), res.getString("productname"), res.getString("productdescription"), res.getFloat("price"));
				}
				res.close();
			}
			catch(SQLException e){
				e.printStackTrace();
				//System.out.println("Failure!");
			}
			finally {
				if(conn != null) {
					try {
						conn.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			return product;
	  }
	  
	  /**
	   * update a product
	   */
	  public boolean updateProduct(Product product)
	  {
		  Connection conn = null;
	    	
		  	
			String url = "jdbc:postgresql://localhost:5432/Books";
			String username = "postgres";
			String password = "root";
			String sql = "UPDATE books.products SET productname = '"+product.getProductName()+"', productdescription = '"+product.getProductDescription()+"', price = '"+product.getPrice()+"' where id = '"+product.getID()+"'";
			try {
				conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
//				ResultSet res = stmt.executeQuery(sql);
				
				int i = stmt.executeUpdate(sql);
				
				System.out.println(product.getID());
				System.out.println(product.getProductName());
				System.out.println(product.getPrice());
				if(i>0)
				{
					return true;
				}
				else
					return false;
				
				
				
//				while(res.next()) {
//					product.add(new Product(res.getInt("ID"), res.getString("productname"), res.getString("productdescription"), res.getFloat("price")));
//				}
				//res.close();
			}
			catch(SQLException e){
				e.printStackTrace();
				//System.out.println("Failure!");
			}
			finally {
				if(conn != null) {
					try {
						conn.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			//return product;
			return false;
	  }
	  
	  
	  /**
	   * delete a product
	   */
	  public boolean deleteProduct(Product product)
	  {
		  System.out.println("Trying to delete");
		  Connection conn = null;
	    	
		  	
			String url = "jdbc:postgresql://localhost:5432/Books";
			String username = "postgres";
			String password = "root";
			String sql = "DELETE FROM books.products WHERE id = "+product.getID()+"";
			try {
				conn = DriverManager.getConnection(url, username, password);
				Statement stmt = conn.createStatement();
//				ResultSet res = stmt.executeQuery(sql);
				
				int i = stmt.executeUpdate(sql);
				
				System.out.println(product.getID());
				System.out.println(product.getProductName());
				System.out.println(product.getPrice());
				if(i>0)
				{
					return true;
				}
				else
					return false;
				
				
				
//				while(res.next()) {
//					product.add(new Product(res.getInt("ID"), res.getString("productname"), res.getString("productdescription"), res.getFloat("price")));
//				}
				//res.close();
			}
			catch(SQLException e){
				e.printStackTrace();
				//System.out.println("Failure!");
			}
			finally {
				if(conn != null) {
					try {
						conn.close();
					}
					catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
			//return product;
			return false;
	  }
	  
	  
	  /**
	   * make a new product
	   */
	  public boolean newProduct(Product product)
		{
			Connection conn = null;
			String url = "jdbc:postgresql://localhost:5432/Books";
			String username = "postgres";
			String password = "root";
			
			//String sql = "INSERT INTO books.user (username, password, firstname, lastname, role, email, phone) VALUES('"+user.getUserName()+"','"+user.getPassword()+"','"+user.getFirstName()+"','"+user.getLastName()+",'2','"+user.getEmail()+"','"+user.getPhone()+"')";
			String sql = "INSERT INTO books.products (productname, productdescription, price) VALUES(?,?,?)";

			try
			{
				conn = DriverManager.getConnection(url, username, password);
				
				PreparedStatement prepared = conn.prepareStatement(sql);
				prepared.setString(1, product.getProductName());
				prepared.setString(2, product.getProductDescription());
				prepared.setDouble(3, product.getPrice());
				
				
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
