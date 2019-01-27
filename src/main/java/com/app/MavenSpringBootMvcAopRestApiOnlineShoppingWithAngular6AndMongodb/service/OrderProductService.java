package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IOrderProductDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.OrderProduct;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository.OrderProductRepository;

@Service
public class OrderProductService implements IOrderProductDAO {
	
	@Autowired
	private OrderProductRepository orderProductRepository;

	@Override
	public OrderProduct create(OrderProduct orderProduct) throws Exception {
		// TODO Auto-generated method stub
		return orderProductRepository.save(orderProduct);
	}
}
