package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "E-CommerceApp_Order")
@TypeAlias("Order")
public class Order {
	
	@Id
    private String id;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@Field(value = "Order_DateCreated")
    private LocalDate dateCreated;

	@Field(value = "Order_Status")
    private String status;

    @DBRef
    @Field(value = "Order_OrderProduct")
    private List<OrderProduct> orderProducts = new ArrayList<>();
    
    @org.springframework.data.annotation.Transient
    public Double getTotalOrderPrice() {
        Double sum = 0D;
        List<OrderProduct> orderProducts = getOrderProducts();
        for (OrderProduct op : orderProducts) {
            sum += op.getTotalPrice();
        }
        return sum;
    }

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the dateCreated
	 */
	public LocalDate getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the orderProducts
	 */
	public List<OrderProduct> getOrderProducts() {
		return orderProducts;
	}

	/**
	 * @param orderProducts the orderProducts to set
	 */
	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
    
	 @org.springframework.data.annotation.Transient
	 public int getNumberOfProducts() {
	     return this.orderProducts.size();
	 }
}
