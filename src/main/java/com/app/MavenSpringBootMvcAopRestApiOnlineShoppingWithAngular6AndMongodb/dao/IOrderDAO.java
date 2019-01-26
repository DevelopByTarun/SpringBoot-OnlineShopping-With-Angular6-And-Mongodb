package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao;

import java.util.List;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Order;

public interface IOrderDAO {
	
	public List<Order> getAllOrders() throws Exception;

    public Order create(Order order) throws Exception;

    public void update(Order order) throws Exception;
}
