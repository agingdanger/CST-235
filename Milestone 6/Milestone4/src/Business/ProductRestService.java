package Business;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import Data.ProductDataInterface;
import Models.Product;


@RequestScoped
@Path("/products")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class ProductRestService {
	
	
	@Inject
	ProductDataInterface service;
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	/**
	 * return a json style page
	 * @return
	 */
	public List<Product> getProductsAsJson()
	{
		return service.findAll();
	}

	
	@GET
	@Path("/getxml")
	@Produces(MediaType.APPLICATION_XML)
	/**
	 * return a xml style page
	 * @return
	 */
	public Product[] getOrdersAsXml() {
		List<Product> products = service.findAll();
		return products.toArray(new Product[products.size()]);
	}
	
	
	
	
}
