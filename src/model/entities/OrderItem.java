package model.entities;

import java.util.Objects;

/** Represents an item of an order
 * 
 * @author Ian
 *
 */
public class OrderItem {

	private Long id;
	private Integer quantity;
	private Double unitPrice;
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(Long id, Integer quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.unitPrice = product.getPrice();
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}

	/**
	 * Calculates the subtotal for a specific order item
	 * 
	 * @return Integer for the value of the order item
	 */
	public Double getSubTotal() {
		return unitPrice * quantity;
	}
}
