package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal;

import org.springframework.data.mongodb.core.mapping.Field;

public class OrderProductPK {
	
    @Field(value = "Order_Id")
    private Order order;

    @Field(value = "Product_Id")
    private Product product;

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
}
