package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao;

import org.springframework.stereotype.Repository;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Email;

@Repository
public interface IEmailDAO {
	
	public void sendEmail(Email email) throws Exception;
}
