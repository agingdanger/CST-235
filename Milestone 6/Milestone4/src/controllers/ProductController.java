package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import Business.ProductBusinessInterface;
import Models.Product;
import Models.User;

@ManagedBean
@ViewScoped
public class ProductController {

	@Inject
	ProductBusinessInterface pc;
	/**
	 * method return all product
	 * @return
	 */
	public List<Product> findAll()
	{
		List<Product> products = new ArrayList<>();
		products = pc.findAll();
		if(!pc.findAll().isEmpty())
		{
			return products;
		}
		else {
			System.out.println("There are no products!");
			return null;
		}
	}
	
	/**
	 * find one product by id
	 * @param productID
	 * @return
	 */
	public Product findByID(int productID) {
		Product product = new Product();
		product = pc.findByID(productID);
		product.setID(product.getID());
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("product", product);
		return product;
	}
	
	/**
	 * update one product
	 * @param product
	 * @return
	 */
	public String updateProduct(Product product) {
		
		if(pc.updateProduct(product))
		return "AdminProduct.xhtml";
		else
			return "UpdateProduct.xhtml";
					
	}
	
	
	/**
	 * delete one product
	 * @param product
	 * @return
	 */
	public String deleteProduct(Product product)
	{
		if(pc.deleteProduct(product))
			return "AdminProduct.xhtml";
			else
				return "UpdateProduct.xhtml";
	}
	
	
	/**
	 * create a new product
	 * @param product
	 * @return
	 */
	public String newProduct(Product product)
	{
		if(pc.newProduct(product))
			return "AdminProduct.xhtml";
		else
			return "NewProduct.xhtml";
	}
}
