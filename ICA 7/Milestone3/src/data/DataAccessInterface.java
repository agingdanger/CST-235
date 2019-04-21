package data;

import java.util.List;

import beans.Order;


public interface DataAccessInterface {
	
	public List<Order> findAll();
	public Order findById(int id);
	public boolean create(Order orders);
	public boolean update(Order orders);
	public boolean delete(Order orders);
}
