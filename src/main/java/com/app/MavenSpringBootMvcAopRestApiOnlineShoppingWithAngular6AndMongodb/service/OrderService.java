package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IOrderDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Order;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository.OrderRepository;

@Service
public class OrderService implements IOrderDAO {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<Order> getAllOrders() throws Exception {
		// TODO Auto-generated method stub
		List<Order> orderList = new ArrayList<Order>();
		orderRepository.findAll().forEach(odd-> orderList.add(odd));
		return orderList;
	}

	@Override
	public Order create(Order order) throws Exception {
		// TODO Auto-generated method stub
		order.setDateCreated(LocalDate.now());
		return orderRepository.save(order);
	}

	@Override
	public void update(Order order) throws Exception {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}
}
