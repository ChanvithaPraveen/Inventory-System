package Supply;

import java.util.ArrayList;
import java.util.Scanner;

import Category.Bakery;
import Category.Beverage;
import Category.CondimentAndSpice;
import Category.DiaryProduct;
import Category.FrozenFood;
import Category.Grain;
import Category.HealthAndBeauty;
import Category.Item;
import Category.MeatAndSeaFood;
import Category.Produce;
import Category.SnackAndSweet;
import Staff.Cashier;
import Staff.FloorWorker;
import Staff.Staff;
import Stock.Stock;

public class SupplyHandler {
	
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

	public static void showSupplyInterface(ArrayList<Supply> supply,ArrayList<Item> stock,Staff loggedInUser) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\t1.View supply details\n\t2.Approve Supply Order\n");
		System.out.print("Enter :\n");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			for(Supply sup:supply) {
				sup.printSupply();
			}
		}
		
		else if(choice == 2) {
			for(Supply sup:supply) {
				sup.printSupply();
			}
			
			System.out.println("Enter the id :");
			boolean isAvail = false;
			int id = sc.nextInt();
			for(Supply sup:supply) {
				if(id==sup.getId()) {
					approveSupply(sup,stock,loggedInUser);
					isAvail = true;
					break;
				}
			}
			
			if(!isAvail) {
				System.out.print("Wrong input...\n\n");
				showSupplyInterface(supply, stock,loggedInUser);
			}
			
		}
		
		else {
			System.out.println("Invalid Input...Try again");
			showSupplyInterface(supply,stock,loggedInUser);
		}
		
	}

	private static void approveSupply(Supply supply,ArrayList<Item> stock,Staff loggedInUser) {
		
		boolean isNewEntry=true;
		for(Item itm:stock) {
			if(itm.getId() == supply.getItemType().getId()) {
				isNewEntry = false;
			break;}
		}
		
		if(isNewEntry && (loggedInUser instanceof FloorWorker || loggedInUser instanceof Cashier)) {
			System.out.print("You can not approve new supply item...");
			return;
			
		}
		
		if(!supply.isPending) {
			System.out.print("Already approved\n");
			return;
			
		}
		
		supply.setPending(false);
		int supItemId = supply.getItemType().getId();
		
		if(supply.getItemType() instanceof Produce) {
			Produce produce = (Produce) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					Produce pro = new Produce();
					pro = (Produce) item;
					pro.setWeight(pro.getWeight()+produce.getWeight());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(produce);
				System.out.println("Your order has been approved and added new item to the stock\n");
				
			}
			
		}
		
		
		if(supply.getItemType() instanceof MeatAndSeaFood) {
			MeatAndSeaFood meatAndSeaFood = (MeatAndSeaFood) supply.getItemType(); 
			boolean isNew = true; 
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					MeatAndSeaFood meat = new MeatAndSeaFood(); 
					meat = (MeatAndSeaFood) item;
					meat.setWeight(meat.getWeight()+meatAndSeaFood.getWeight());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(meatAndSeaFood);
				
			}
			
		}
		
		if(supply.getItemType() instanceof Grain) {
			Grain grain = (Grain) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					Grain gra = new Grain();
					gra = (Grain) item;
					gra.setWeight(gra.getWeight()+grain.getWeight());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(grain);
				
			}
			
		}
		
		if(supply.getItemType() instanceof Bakery) {
			Bakery bakery = (Bakery) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					Bakery bake = new Bakery();
					bake = (Bakery) item;
					bake.setNumOfItems(bake.getNumOfItems()+bakery.getNumOfItems());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(bakery);
				
			}
			
		}
		
		if(supply.getItemType() instanceof FrozenFood) {
			FrozenFood frozenFood = (FrozenFood) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					FrozenFood fro = new FrozenFood();
					fro = (FrozenFood) item;
					fro.setNumOfItems(fro.getNumOfItems()+frozenFood.getNumOfItems());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(frozenFood);
				
			}
			
		}
		
		if(supply.getItemType() instanceof DiaryProduct) {
			DiaryProduct diaryProduct = (DiaryProduct) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					DiaryProduct dia = new DiaryProduct();
					dia = (DiaryProduct) item;
					dia.setNumOfItems(dia.getNumOfItems()+diaryProduct.getNumOfItems());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(diaryProduct);
				
			}
			
		}
		
		if(supply.getItemType() instanceof SnackAndSweet) {
			SnackAndSweet snackAndSweet = (SnackAndSweet) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					SnackAndSweet sna = new SnackAndSweet();
					sna = (SnackAndSweet) item;
					sna.setNumOfItems(sna.getNumOfItems()+snackAndSweet.getNumOfItems());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(snackAndSweet);
				
			}
			
		}
		
		if(supply.getItemType() instanceof Beverage) {
			Beverage beverage = (Beverage) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					Beverage bev = new Beverage();
					bev = (Beverage) item;
					bev.setNumOfItems(bev.getNumOfItems()+beverage.getNumOfItems());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(beverage);
				
			}
			
		}
		
		if(supply.getItemType() instanceof HealthAndBeauty) {
			HealthAndBeauty healthAndBeauty = (HealthAndBeauty) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					HealthAndBeauty heal = new HealthAndBeauty();
					heal = (HealthAndBeauty) item;
					heal.setNumOfItems(heal.getNumOfItems()+healthAndBeauty.getNumOfItems());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(healthAndBeauty);
				
			}
			
		}
		
		if(supply.getItemType() instanceof CondimentAndSpice) {
			CondimentAndSpice condimentAndSpice = (CondimentAndSpice) supply.getItemType();
			boolean isNew = true;
			for(Item item:stock) {
				if(item.getId() == supItemId) {
					isNew = false;
					CondimentAndSpice cond = new CondimentAndSpice();
					cond = (CondimentAndSpice) item;
					cond.setNumOfItems(cond.getNumOfItems()+condimentAndSpice.getNumOfItems());
					System.out.println("Your order has been approved");
					break;
				}
			}
			
			if(isNew) {
				stock.add(condimentAndSpice);
				
			}
			
		}
		
		
		
		
		
		
	}
	
	
	
//	public static void addNewSupply() {
//		Scanner sc =new Scanner(System.in);
//		System.out.print("1.Local\t2.International\nEnter:");
//		int choice=sc.nextInt();
//		
//		
//		
//		System.out.print("1.Local\t2.International\nEnter:");
//		
//		if(choice == 1) {
//			LocalSupply ls = new LocalSupply();
//			
//			
//		}
//		else if(choice == 2) {
//			
//		}
//		
//		else {
//			
//		}
//		
//	}

}
