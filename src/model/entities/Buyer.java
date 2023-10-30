package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Represents a buyer user of the e-commerce system
 * 
 * @author Ian
 *
 */
public class Buyer {

	private Long id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String password;
	
	private List<Order> orders = new ArrayList<>();
	
	public Buyer() {
	}
	
	public Buyer(Long id, String name, String email, String phone, String address, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Order> getOrders() {
		return orders;
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
		Buyer other = (Buyer) obj;
		return Objects.equals(id, other.id);
	}
}
