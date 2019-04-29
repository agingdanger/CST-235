package Business;

import java.util.List;

import Models.Product;

public interface ProductBusinessInterface {

	/**
	 * return all product
	 * @return
	 */
	public List<Product> findAll();
	/**
	 * find a product by id
	 * @param productID
	 * @return
	 */
	public Product findByID(int productID);
	/**
	 * update a product
	 * @param product
	 * @return
	 */
	public boolean updateProduct(Product product);
	/**
	 * delete a product
	 * @param product
	 * @return
	 */
	public boolean deleteProduct(Product product);
	
	/**
	 * make a new product
	 * @param product
	 * @return
	 */
	public boolean newProduct(Product product);
}
