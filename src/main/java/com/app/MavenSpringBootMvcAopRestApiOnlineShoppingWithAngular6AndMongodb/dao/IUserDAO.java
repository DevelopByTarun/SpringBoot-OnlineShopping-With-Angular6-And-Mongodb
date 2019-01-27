package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao;

import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.User;

public interface IUserDAO {
		
	public boolean addUser(User user) throws Exception;
	
	public User doLogin(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public User getUser(String id) throws Exception;
}
