package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IProductDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Product;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository.ProductRepository;

@Service
public class ProductService implements IProductDAO {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
			
	@Override
	public boolean saveProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		return productRepository.save(product) != null;
	}

	@Override
	public void updateProduct(Product product) throws Exception {
		// TODO Auto-generated method stub
		Product getProduct = mongoTemplate.findById(product.getId(), Product.class);
		getProduct.setName(product.getName());
		getProduct.setCategory(product.getCategory());
		getProduct.setBrand(product.getBrand());
		getProduct.setSize(product.getSize());
		getProduct.setDiscount(product.getDiscount());
		getProduct.setPrice(product.getPrice());
		getProduct.setArrival(product.getArrival());
		getProduct.setPictureUrl(product.getPictureUrl());
		mongoTemplate.save(getProduct);
	}

	@Override
	public void deleteProduct(String id) throws Exception {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		mongoTemplate.findAndRemove(query, Product.class);
	}

	@Override
	public Product getProduct(String id) throws Exception {
		// TODO Auto-generated method stub
		Product getProduct = mongoTemplate.findById(id, Product.class);
		return getProduct;
	}

	@Override
	public List<Product> getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Product.class);
	}

	@Override
	public void addProductThroughCommandLineRunner(Product product) throws Exception {
		// TODO Auto-generated method stub
		mongoTemplate.save(product);
	}
	
	@Override
	public List<Product> getAllProductsByArrival(String arrival) throws Exception {
		// TODO Auto-generated method stub
		Query selectArrivalQuery = new Query();
		selectArrivalQuery.fields().include("id");
		selectArrivalQuery.fields().include("name");
		selectArrivalQuery.fields().include("category");
		selectArrivalQuery.fields().include("brand");
		selectArrivalQuery.fields().include("size");
		selectArrivalQuery.fields().include("discount");
		selectArrivalQuery.fields().include("price");
		selectArrivalQuery.fields().include("arrival");
		selectArrivalQuery.fields().include("pictureUrl");
		selectArrivalQuery.addCriteria(Criteria.where("arrival").is(arrival));
		List<Product> productListByArrival = mongoTemplate.find(selectArrivalQuery, Product.class);
		return productListByArrival;
	}

	@Override
	public List<Product> getAllProductsByCategoryAndArrival(String category, String arrival) throws Exception {
		// TODO Auto-generated method stub
		Query selectCategoryArrivalQuery = new Query();
		selectCategoryArrivalQuery.fields().include("id");
		selectCategoryArrivalQuery.fields().include("name");
		selectCategoryArrivalQuery.fields().include("category");
		selectCategoryArrivalQuery.fields().include("brand");
		selectCategoryArrivalQuery.fields().include("size");
		selectCategoryArrivalQuery.fields().include("discount");
		selectCategoryArrivalQuery.fields().include("price");
		selectCategoryArrivalQuery.fields().include("arrival");
		selectCategoryArrivalQuery.fields().include("pictureUrl");
		selectCategoryArrivalQuery.addCriteria(Criteria.where("category").is(category).and("arrival").is(arrival));		
		List<Product> productListByCategoryArrival = mongoTemplate.find(selectCategoryArrivalQuery, Product.class);
		return productListByCategoryArrival;
	}

	@Override
	public List<Product> getAllProductsByDiscountAndArrival(Integer discount, String arrival) throws Exception {
		// TODO Auto-generated method stub
		Query selectDiscountArrivalQuery = new Query();
		selectDiscountArrivalQuery.fields().include("id");
		selectDiscountArrivalQuery.fields().include("name");
		selectDiscountArrivalQuery.fields().include("category");
		selectDiscountArrivalQuery.fields().include("brand");
		selectDiscountArrivalQuery.fields().include("size");
		selectDiscountArrivalQuery.fields().include("discount");
		selectDiscountArrivalQuery.fields().include("price");
		selectDiscountArrivalQuery.fields().include("arrival");
		selectDiscountArrivalQuery.fields().include("pictureUrl");
		selectDiscountArrivalQuery.addCriteria(Criteria.where("discount").is(discount).and("arrival").is(arrival));
		List<Product> productListByDiscountArrival = mongoTemplate.find(selectDiscountArrivalQuery, Product.class);
		return productListByDiscountArrival;
	}
	
	@Override
	public List<Product> getAllProductsByBrandAndArrival(String brand, String arrival) throws Exception {
		// TODO Auto-generated method stub
		Query selectBrandArrivalQuery = new Query();
		selectBrandArrivalQuery.fields().include("id");
		selectBrandArrivalQuery.fields().include("name");
		selectBrandArrivalQuery.fields().include("category");
		selectBrandArrivalQuery.fields().include("brand");
		selectBrandArrivalQuery.fields().include("size");
		selectBrandArrivalQuery.fields().include("discount");
		selectBrandArrivalQuery.fields().include("price");
		selectBrandArrivalQuery.fields().include("arrival");
		selectBrandArrivalQuery.fields().include("pictureUrl");
		selectBrandArrivalQuery.addCriteria(Criteria.where("brand").is(brand).and("arrival").is(arrival));
		List<Product> productListByBrandArrival = mongoTemplate.find(selectBrandArrivalQuery, Product.class);
		return productListByBrandArrival;
	}	
}
