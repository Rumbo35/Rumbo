package data;

import java.math.BigDecimal;

public class Product {
    Long code;
    String description;
    String typecode_fk;
    Integer imported;
    BigDecimal price;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTypecode_fk() {
		return typecode_fk;
	}
	public void setTypecode_fk(String typecode_fk) {
		this.typecode_fk = typecode_fk;
	}
	public Integer getImported() {
		return imported;
	}
	public void setImported(Integer imported) {
		this.imported = imported;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
    
   
    
}
