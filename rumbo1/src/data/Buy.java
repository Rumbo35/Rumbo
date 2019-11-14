package data;

public class Buy {

	Long product_fk;
	Integer quantity;
	Long customer_fk;
	
	public Long getProduct_fk() {
		return product_fk;
	}
	public void setProduct_fk(Long product_fk) {
		this.product_fk = product_fk;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Long getCustomer_fk() {
		return customer_fk;
	}
	public void setCustomer_fk(Long customer_fk) {
		this.customer_fk = customer_fk;
	}

}
