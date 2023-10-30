package model.enums;

/** Represents the status of an order
 * 
 * @author Ian
 *
 */
public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	/** Method that retrieves a status of the order based on a numeric code
	 * 
	 * @param code Integer value of the enum
	 * @return OrderStatus as enum value
	 * @throws IllegalArgumentException
	 */
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
