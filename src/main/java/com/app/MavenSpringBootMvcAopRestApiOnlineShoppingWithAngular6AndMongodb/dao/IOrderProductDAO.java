package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao;

import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.OrderProduct;

public interface IOrderProductDAO {
	
	public OrderProduct create(OrderProduct orderProduct) throws Exception;
}
