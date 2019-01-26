package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
