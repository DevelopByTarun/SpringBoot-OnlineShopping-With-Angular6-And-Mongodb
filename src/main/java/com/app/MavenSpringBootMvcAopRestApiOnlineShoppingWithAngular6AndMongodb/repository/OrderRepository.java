package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
