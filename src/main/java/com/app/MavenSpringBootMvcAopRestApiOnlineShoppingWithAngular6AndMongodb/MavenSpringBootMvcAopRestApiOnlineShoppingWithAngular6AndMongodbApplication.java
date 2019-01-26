package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration 
@EnableAspectJAutoProxy
@EnableMongoRepositories("com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository")
@ComponentScan(basePackages = "com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb")
@SpringBootApplication
public class MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodbApplication.class, args);
	}	
}
