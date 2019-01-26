package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "E-CommerceApp_OrderProduct")
@TypeAlias("OrderProduct")
public class OrderProduct {
	
	@Field(value = "OrderProduct_PK")
    private OrderProductPK pk;

	@Field(value = "OrderProduct_Quantity") 
    private Integer quantity;

	/**
	 * 
	 */
	public OrderProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrderProduct(Order order, Product product, Integer quantity) {
        pk = new OrderProductPK();
        pk.setOrder(order);
        pk.setProduct(product);
        this.quantity = quantity;
    }
	
	@org.springframework.data.annotation.Transient
    public Product getProduct() {
        return this.pk.getProduct();
    }

    @org.springframework.data.annotation.Transient
    public int getTotalPrice() {
        return getProduct().getPrice() * getQuantity();
    }

	/**
	 * @return the pk
	 */
	public OrderProductPK getPk() {
		return pk;
	}

	/**
	 * @param pk the pk to set
	 */
	public void setPk(OrderProductPK pk) {
		this.pk = pk;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
