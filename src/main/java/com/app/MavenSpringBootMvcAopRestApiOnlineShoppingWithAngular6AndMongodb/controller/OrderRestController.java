package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IOrderDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IOrderProductDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IProductDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dto.OrderProductDto;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Order;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.OrderProduct;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.OrderStatus;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {
	
	@Autowired
	private IProductDAO productDAO;
	
	@Autowired
	private IOrderDAO orderDAO;
	
	@Autowired
	private IOrderProductDAO orderProductDAO;
 
    @GetMapping("/getOrder")
	public ResponseEntity<List<Order>> list() throws Exception {
		List<Order> orderList = orderDAO.getAllOrders();
		return new ResponseEntity<List<Order>>(orderList, HttpStatus.OK);
	}

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody OrderForm form) throws Exception {
        List<OrderProductDto> formDtos = form.getProductOrders();
        Order order = new Order();
        order.setStatus(OrderStatus.PAID.name());
        order = this.orderDAO.create(order);
        List<OrderProduct> orderProducts = new ArrayList<>();
        for (OrderProductDto dto : formDtos) {
            orderProducts.add(orderProductDAO.create(new OrderProduct(order, productDAO.getProduct(dto.getProduct().getId()), dto.getQuantity())));
        }
        order.setOrderProducts(orderProducts);
        this.orderDAO.update(order);
        String uri = ServletUriComponentsBuilder
          .fromCurrentServletMapping()
          .path("/orders?id={id}")
          .buildAndExpand(order.getId())
          .toString();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", uri);
        return new ResponseEntity<>(order, headers, HttpStatus.CREATED);
    }
        
    public static class OrderForm {

        private List<OrderProductDto> productOrders;

        public List<OrderProductDto> getProductOrders() {
            return productOrders;
        }

        public void setProductOrders(List<OrderProductDto> productOrders) {
            this.productOrders = productOrders;
        }
    }
}
