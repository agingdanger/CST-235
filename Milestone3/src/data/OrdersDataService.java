package data;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.Order;

/**
 * Session Bean implementation class OrdersDataService
 */
@Stateless
@Local(DataAccessInterface.class)
@LocalBean
public class OrdersDataService implements DataAccessInterface {

    /**
     * Default constructor. 
     */
    public OrdersDataService() {
        // TODO Auto-generated constructor stub
    	
    }


	/**
     * @see DataAccessInterface#findAll()
     */
    public List<Order> findAll() {
    	Connection conn = null;
    	List<Order> orders  = new ArrayList<>();
		String url = "jdbc:postgresql://localhost:5432/testapp";
		String username = "postgres";
		String password = "root";
		String sql = "SELECT * FROM testapp.testapp.Orders";
		try {
			conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);

			while(res.next()) {
				orders.add(new Order(res.getInt("ID"), res.getString("ORDER_NO"), res.getString("PRODUCT_NAME"), res.getFloat("PRICE"), res.getInt("QUANTITY")));
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
		return orders;
    }


	/**
     * @see DataAccessInterface#findById(int)
     */
    public Order findById(int id) {
    	Connection conn = null;
    	Order order  = new Order();
		String url = "jdbc:postgresql://localhost:5432/testapp";
		String username = "postgres";
		String password = "root";
		String sql = "SELECT * FROM testapp.testapp.Orders WHERE (ID) = id";
		try {
			conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			while(res.next()) {
				order = (new Order(res.getInt("ID"), res.getString("ORDER_NO"), res.getString("PRODUCT_NAME"), res.getFloat("PRICE"), res.getInt("QUANTITY")));
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
		return order;
    }

	@Override
	public boolean create(Order order) {
		
		Connection conn = null;
		String url = "jdbc:postgresql://localhost:5432/testapp";
		String username = "postgres";
		String password = "root";
		String sql = "INSERT INTO testapp.testapp.Orders(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES('001122334455', 'This was inserted new', 25.0 , 4)";
		try {
			conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Server Connection Success!");
		}
		catch(SQLException e) {
			System.out.println("Potential Connection Issue");
			e.printStackTrace();
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
		return false;
	}

	@Override
	public boolean update(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

}
