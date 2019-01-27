package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dto;

import javax.validation.constraints.NotBlank;
import org.springframework.stereotype.Component;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Product;

@Component
public class OrderProductDto {
	
	@NotBlank
	private Product product;
	
	@NotBlank
    private Integer quantity;

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
