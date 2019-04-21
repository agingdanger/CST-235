package beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean
public class Product {
	
	int ID;
	String productName;
	String productDescription;
	float price;
	String photo;
	
	
	
	public Product() {
		this.ID = this.getID();
		this.productName = this.getProductName();
		this.productDescription = this.getProductDescription();
		this.price = this.getPrice();
		this.photo = this.getPhoto();
	}

	public Product( String productName, String productDescription, float price, String photo) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.photo = photo;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
