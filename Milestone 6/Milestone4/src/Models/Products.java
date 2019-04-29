package Models;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@SessionScoped
@ManagedBean
public class Products {
	
	List <Product> products = new ArrayList<Product>();
	
	

	/**
	 * getter for a product list
	 * @return
	 */
	public List<Product> getProducts() {
		return products;
	}

	
	/**
	 * setter for a product list
	 * @param products
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}

