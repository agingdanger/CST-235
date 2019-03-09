package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import beans.Product;

//import beans.User;
//import beans.Users;
@ManagedBean
@ViewScoped
public class ProductController {

	public String productController(Product product){
	//get the user value from the input form
			//FacesContext context = FacesContext.getCurrentInstance();
			//User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
			//User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
			FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("product", product);
			//Print out the current product information
			System.out.println("You clicked something");
			System.out.println("The product name " + product.getProductName());
			System.out.println("The product description " + product.getProductDescription());
			System.out.println("The product price " + product.getPrice());
			System.out.println("The product photo " + product.getPhoto());
			
			//puts the user information into a list
			List <Product> products = new ArrayList<Product>();
			//Products pro = new Products();
			products.add(new Product(product.getProductName(),product.getProductDescription(),product.getPrice(), product.getPhoto()));
			
			
			
			//System.out.println(users.get(0).getFirstName());
			//usa.setUsers(users);
			//sends from registration form to login form
			return "ProductCreated.xhtml";
	}
}
