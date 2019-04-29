package Data;

import java.util.List;

import javax.ejb.Local;

import Models.Product;


@Local
public interface ProductDataInterface {

	/**
	 * return all products
	 * @return
	 */
	 public List<Product> findAll();
	 
	 /**
	  * interface find product by id
	  * @param productID
	  * @return
	  */
	 public Product findByID(int productID);
	 
	 /**
	  * interface update a product
	  * @param product
	  * @return
	  */
	 public boolean updateProduct(Product product);
	 
	 /**
	  * interface delete a product
	  * @param prodyct
	  * @return
	  */
	 public boolean deleteProduct(Product prodyct);
	 
	 
	 /**
	  * interface create a new product
	  * @param product
	  * @return
	  */
	 public boolean newProduct(Product product);
}
