package Models;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.bind.annotation.XmlRootElement;

@ApplicationScoped
@ManagedBean
@XmlRootElement(name = "Product")
public class Product {
	
	int ID;
	String productName;
	String productDescription;
	double price;
	
	
	
	/**
	 * product constructor
	 */
	public Product() {
		this.ID = this.getID();
		this.productName = this.getProductName();
		this.productDescription = this.getProductDescription();
		this.price = this.getPrice();
		
	}

	
	/**
	 * product constructor
	 * @param ID
	 * @param productName
	 * @param productDescription
	 * @param price
	 */
	public Product(int ID, String productName, String productDescription, double price) {
		this.ID = ID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		
	}
	
	/**
	 * getter for id
	 * @return
	 */
	public int getID() {
		return ID;
	}
	
	/**
	 * setter for id
	 * @param ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}
	
	/**
	 * getter for productname
	 * @return
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * setter for productname
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * getter for product description
	 * @return
	 */
	public String getProductDescription() {
		return productDescription;
	}
	
	/**
	 * setter for product description
	 * @param productDescription
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	/**
	 * getter for price
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * setter for price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
