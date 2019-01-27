package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
