package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Order;
//import beans.Orders;

/**
 * Session Bean implementation class AnotherOrdersBusinessService
 */
@Stateless
@Local(OrdersBusinessInterface.class)
@LocalBean
@Alternative
public class AnotherOrdersBusinessService implements OrdersBusinessInterface {
	
	List<Order> orders = new ArrayList<Order>();

    /**
     * Default constructor. 
     */
    public AnotherOrdersBusinessService() 
    {
    	orders.add(new Order("000000000", "This is product 0", (float)1.00, 12));
		orders.add(new Order("000000001", "This is product 1", (float)1.00, 13));
		orders.add(new Order("000000002", "This is product 2", (float)1.00, 15));
		orders.add(new Order("000000003", "This is product 3", (float)1.00, 16));
		orders.add(new Order("000000004", "This is product 4", (float)1.00, 17));
		orders.add(new Order("000000005", "This is product 5", (float)1.00, 18));
		orders.add(new Order("000000006", "This is product 6", (float)1.00, 19));
		orders.add(new Order("000000007", "This is product 7", (float)1.00, 10));
		orders.add(new Order("000000008", "This is product 8", (float)1.00, 10));
		orders.add(new Order("000000009", "This is product 9", (float)1.00, 1));
    }

	/**
     * @see OrdersBusinessInterface#test()
     */
    public void test()
    {
       System.out.println("===========> Hello from the AnotherOrdersBusinessService.test()");
    }

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


}
