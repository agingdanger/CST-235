package Business;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import Data.ProductDAO;
import Data.SecurityDAO;
import Models.Product;
import Models.User;

@Stateless
@Local(ProductBusinessInterface.class)
@LocalBean
public class ProductBusinessService implements ProductBusinessInterface{
	
	/**
	 * return all product
	 */
	public List<Product> findAll()
	{
		ProductDAO pd = new ProductDAO();
		return pd.findAll();
	}

	/**
	 * find a product by id
	 */
	@Override
	public Product findByID(int productID) {
		ProductDAO pd = new ProductDAO();
		return pd.findByID(productID);
	}


	/**
	 * update a product
	 */
	public boolean updateProduct(Product product) {
		ProductDAO pd = new ProductDAO();
		return pd.updateProduct(product);
		
	}
	/**
	 * delete a product
	 */
	public boolean deleteProduct(Product product)
	{
		ProductDAO pd = new ProductDAO();
		return pd.deleteProduct(product);
	}
	
	/**
	 * create a product
	 */
	public boolean newProduct(Product product)
	{
		ProductDAO pd = new ProductDAO();		
		return pd.newProduct(product);
	}


}
