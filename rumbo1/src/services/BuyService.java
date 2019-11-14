package services;

import java.util.ArrayList;

import data.Buy;


public class BuyService {

	public ArrayList<Buy> getBuy(Integer customer){
		
		ArrayList<Buy> listBuy = new ArrayList<Buy>();
		Buy buy;
		
		if (customer == 1){
			buy = new Buy();
			buy.setCustomer_fk(1L);
			buy.setQuantity(1);
			buy.setProduct_fk(1L);
			
			listBuy.add(buy);
			
			buy = new Buy();
			buy.setCustomer_fk(1L);
			buy.setQuantity(1);
			buy.setProduct_fk(2L);
			
			listBuy.add(buy);
			
			buy = new Buy();
			buy.setCustomer_fk(1L);
			buy.setQuantity(1);
			buy.setProduct_fk(3L);
			
			listBuy.add(buy);
					
		}
		
		if (customer == 2) {
			buy = new Buy();
			buy.setCustomer_fk(2L);
			buy.setQuantity(1);
			buy.setProduct_fk(4L);
			
			listBuy.add(buy);
			
			buy = new Buy();
			buy.setCustomer_fk(2L);
			buy.setQuantity(1);
			buy.setProduct_fk(5L);
			
			listBuy.add(buy);
			
		}
		
		if (customer == 3) {
			buy = new Buy();
			buy.setCustomer_fk(3L);
			buy.setQuantity(1);
			buy.setProduct_fk(6L);
			
			listBuy.add(buy);
			
			buy = new Buy();
			buy.setCustomer_fk(3L);
			buy.setQuantity(1);
			buy.setProduct_fk(7L);
			
			listBuy.add(buy);
			
			buy = new Buy();
			buy.setCustomer_fk(3L);
			buy.setQuantity(1);
			buy.setProduct_fk(8L);
			
			listBuy.add(buy);
			
			buy = new Buy();
			buy.setCustomer_fk(3L);
			buy.setQuantity(1);
			buy.setProduct_fk(9L);
			
			listBuy.add(buy);
			
		}
		
		return listBuy;
		
	}
	
	
}
