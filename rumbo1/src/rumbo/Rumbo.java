package rumbo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

import data.Buy;
import data.Product;
import data2.ProductBill;
import services.BuyService;
import services.ProductService;


public class Rumbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		// Needed services
		BuyService buyService = new BuyService();
		ProductService productService = new ProductService();
		
		String input = "1";
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));   
		System.out.println("Select Bill: (1, 2 or 3):");
		try {
		   input = buffer.readLine();
		} catch (Exception e) {
			System.out.println("Input error");
			System.exit(1);
		}
		
		Integer customer = Integer.valueOf(input);
		ArrayList <Buy> listBuy = buyService.getBuy (customer);
		
		
		ArrayList <ProductBill> billWithoutTaxes = new ArrayList<ProductBill>();
		ArrayList <ProductBill> billWithTaxes = new ArrayList<ProductBill>();
		
		
		// Get a list of bought products for that customer
		for (int i=0; i<listBuy.size(); i++){
		    Product product = productService.getProduct(listBuy.get(i).getProduct_fk());
		    Integer quantity = listBuy.get(i).getQuantity();
		    ProductBill productBill = new ProductBill();
		    productBill.setProduct(product);
		    productBill.setQuantity(quantity);
		    billWithoutTaxes.add(productBill);
		}

		// Calculate taxes
		BigDecimal  totalTax= new BigDecimal(0);
		for (int j=0; j<billWithoutTaxes.size(); j++){
		   ProductBill productBill = billWithoutTaxes.get(j);
		   BigDecimal price = productBill.getProduct().getPrice();
		   BigDecimal finalPrice = new BigDecimal(0);
		   BigDecimal tax;
		   Product product = productBill.getProduct();
		   
		   price = price.multiply(new BigDecimal(productBill.getQuantity()));
		   
		   // if product is "Other" apply 10% tax
		   if ( product.getTypecode_fk().equals("O") ) {
		        tax = price.multiply(new BigDecimal(0.10));
		        tax = tax.setScale(2, BigDecimal.ROUND_HALF_UP);
		        finalPrice = price.add(tax);
		        totalTax = totalTax.add(tax);
		   } else {
			   finalPrice = price;
		   }
		   
		   // if product is imported apply additional 5% tax
		   if (product.getImported() == 1) {			  
		        tax = price.multiply(new BigDecimal(0.05));		       
		        tax = tax.setScale(2, BigDecimal.ROUND_HALF_UP);
		        finalPrice = finalPrice.add(tax);
		        totalTax = totalTax.add(tax);
		   }

		   finalPrice = finalPrice.setScale(2, BigDecimal.ROUND_HALF_UP);
		   
		   Product productFinal = new Product();
		   productFinal.setCode(product.getCode());
		   productFinal.setDescription(product.getDescription());
		   productFinal.setTypecode_fk(product.getTypecode_fk());
		   productFinal.setImported(product.getImported());
		   productFinal.setPrice(finalPrice);

		   ProductBill productBillTax = new ProductBill();
		   productBillTax.setProduct(productFinal);
		   productBillTax.setQuantity(productBill.getQuantity());
		   
		   billWithTaxes.add(productBillTax);
		}


		// Now the bill with taxes is already done, we can print it

		BigDecimal totalPrice = new BigDecimal(0);
		for (int h=0; h < billWithTaxes.size(); h++) {
		   System.out.println("");
		   System.out.println("Quantity: "+ billWithTaxes.get(h).getQuantity());
		   System.out.println("Description: "+ billWithTaxes.get(h).getProduct().getDescription());
		   System.out.println("Final price: "+ billWithTaxes.get(h).getProduct().getPrice());
		   totalPrice = totalPrice.add(billWithTaxes.get(h).getProduct().getPrice());
		}

		// Now prints total tax and total price
		System.out.println("");
		System.out.println(" Sales Taxes: " + totalTax.setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println(" Total: " + totalPrice);

		
	}

}
