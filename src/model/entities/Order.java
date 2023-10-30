package model.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import model.enums.OrderStatus;

/** Represents an order made in a specfic moment
 * 
 * @author Ian
 *
 */
public class Order {
	
	private Long id;
	private Instant moment;
	private Integer orderStatus;
	private Buyer customer;
	
	private Set<OrderItem> items = new HashSet<>();
	
	public Order() {
	}

	public Order(Long id, Instant moment, OrderStatus orderStatus, Buyer customer) {
		this.id = id;
		this.moment = moment;
		setOrderStatus(orderStatus);
		this.customer = customer;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
	public OrderStatus getOrderStatus() {
		return OrderStatus.valueOf(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		if (orderStatus != null) {
			this.orderStatus = orderStatus.getCode();
		}
	}
	
	public Buyer getClient() {
		return customer;
	}

	public void setClient(Buyer client) {
		this.customer = client;
	}
	
	public Set<OrderItem> getItems() {
		return items;
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
		Order other = (Order) obj;
		return Objects.equals(id, other.id);
	}
	
	/**
	 * Returns the total value of the order, done by calculating
	 * all of order items subtotals
	 * 
	 * @return Integer for the total of the order
	 */
	public Double getTotal() {
		double sum = 0;
		for (OrderItem item : items) {
			sum += item.getSubTotal();
		}
		return sum;
	}
}
