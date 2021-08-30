package Supply;

import java.util.ArrayList;

import Category.Produce;

public class SupplyTest {

	public static void main(String[] args) {
		ArrayList<Supply> supply = new ArrayList<>();
		SupplyRepository spRepo = new SupplyRepository();
		
//		supply = spRepo.getSupply();
//		
//	supply.get(0).printSupply();
		Produce beet = new Produce();
		beet.setItemName("Beet root");
		beet.setId(71);
		beet.setWeight(100);
		
		LocalSupply lp1 = new LocalSupply(beet,true,"2020.08.02","2021.01.02","Srimal Products","Van","ABC-3877");
		lp1.setId(1);
		
		
		
		
		
		supply.add(lp1);	
		
		
		
		spRepo.saveSupply(supply);
		

	}
	
	public static void setSupplyOrders(ArrayList<Supply> supply) {
		SupplyRepository spRepo = new SupplyRepository();
//		LocalSupply lp = new LocalSupply();
//		Produce carrot = new Produce();
//		carrot.setItemName("carrot");
//		carrot.setId(12);
//		carrot.setWeight(100);
//		lp.setItemType(carrot);
//		lp.setPending(true);
//		
//		supply.add(lp);	
//		
//		spRepo.saveSupply(supply);
		
	}


}
