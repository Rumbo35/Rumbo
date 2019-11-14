package services;

import data.Product;
import java.math.BigDecimal;

public class ProductService {

	public Product getProduct(Long productCode){
		
		Product product = new Product();
		
		if (productCode == 1) {		   
			product.setCode(1L);
			product.setDescription("Book");
			product.setTypecode_fk("B");
			product.setImported(0);
			product.setPrice(new BigDecimal(12.49));
				
		}
		
		if (productCode == 2) {
			product.setCode(2L);
			product.setDescription("Music CD");
			product.setTypecode_fk("O");
			product.setImported(0);
			product.setPrice(new BigDecimal(14.99));
			
			
		}
		
		if (productCode == 3) {
			product.setCode(3L);
			product.setDescription("Chocolate bar");
			product.setTypecode_fk("F");
			product.setImported(0);
			product.setPrice(new BigDecimal(0.85));
			
		}
		
		if (productCode == 4) {
			product.setCode(4L);
			product.setDescription("Box of chocolates1");
			product.setTypecode_fk("F");
			product.setImported(1);
			product.setPrice(new BigDecimal(10.00));
			
		}
		
		if (productCode == 5) {
			product.setCode(5L);
			product.setDescription("Imported Bottle of perfume1");
			product.setTypecode_fk("O");
			product.setImported(1);
			product.setPrice(new BigDecimal(47.50));
					
		}
		
		if (productCode == 6) {
			product.setCode(6L);
			product.setDescription("Imported Bottle of perfume2");
			product.setTypecode_fk("O");
			product.setImported(1);
			product.setPrice(new BigDecimal(27.99));
				
		}
		
		if (productCode == 7) {
			product.setCode(7L);
			product.setDescription("Bottle of perfume3");
			product.setTypecode_fk("O");
			product.setImported(0);
			product.setPrice(new BigDecimal(18.99));
				
		}
		
		if (productCode == 8) {
			product.setCode(8L);
			product.setDescription("Packet of headpills");
			product.setTypecode_fk("M");
			product.setImported(0);
			product.setPrice(new BigDecimal(9.75));
				
		}
		
		if (productCode == 9) {
			product.setCode(9L);
			product.setDescription("Imported Box of chocolates2");
			product.setTypecode_fk("F");
			product.setImported(1);
			product.setPrice(new BigDecimal(11.25));
				
		}
		
		return product;
		
	}
	
	
}
