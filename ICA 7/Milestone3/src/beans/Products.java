package beans;

import java.util.ArrayList;
import java.util.List;

public class Products {
	
	List <Order> products = new ArrayList<Order>();
	
	

	public List<Order> getProducts() {
		return products;
	}

	public void setProducts(List<Order> products) {
		this.products = products;
	}
}
