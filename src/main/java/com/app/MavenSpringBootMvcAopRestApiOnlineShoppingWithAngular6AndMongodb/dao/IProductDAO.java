package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao;

import java.util.List;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Product;

public interface IProductDAO {
		
	public Product getProduct(String id) throws Exception;
	
	public List<Product> getAllProducts() throws Exception;
		
	public List<Product> getAllProductsByArrival(String arrival) throws Exception;
	
	public List<Product> getAllProductsByCategoryAndArrival(String category, String arrival) throws Exception;
	
	public List<Product> getAllProductsByDiscountAndArrival(Integer discount, String arrival) throws Exception;
	
	public List<Product> getAllProductsByBrandAndArrival(String brand, String arrival) throws Exception;
}
