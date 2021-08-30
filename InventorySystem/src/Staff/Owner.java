package Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Category.Bakery;
import Category.Beverage;
import Category.CondimentAndSpice;
import Category.DiaryProduct;
import Category.FrozenFood;
import Category.Grain;
import Category.HealthAndBeauty;
import Category.Item;
import Category.ItemRepository;
import Category.MeatAndSeaFood;
import Category.Produce;
import Category.SnackAndSweet;
import Stock.Stock;


public class Owner extends Staff{


	public Owner() {
		super();
		this.setUserID(1);
		
	}

	public Owner( String userName, String password, String fullName, String joinedDate) {
		super(userName, password, fullName, joinedDate);
		this.setUserID(1);
		
	}
	
	public void increaseBakery(Bakery bakery, int increment) {
		bakery.increaseNoItems(increment);
		
	}
	public void increaseDiaryProduct(DiaryProduct diaryProduct, int increment) {
		diaryProduct.increaseNoItems(increment);
		
	}
	public void increaseFrozenFood(FrozenFood frozenFood, int increment) {
		frozenFood.increaseNoItems(increment);
		
	}
	public void increaseGrain(Grain grain, int increment) {
		grain.increaseWeight(increment);
		
	}
	public void increaseHealthAndBeauty(HealthAndBeauty healthAndBeauty, int increment) {
		healthAndBeauty.increaseNoItems(increment);
		
	}
	public void increaseMeatAndSeaFood(MeatAndSeaFood meatAndSeaFood, int increment) {
		meatAndSeaFood.increaseWeight(increment);	
		
	}
	public void increaseProduce(Produce produce, int increment) {
		produce.increaseWeight(increment);	
			
		}
	public void increaseSnackAndSweet(SnackAndSweet snackAndSweet, int increment) {
		snackAndSweet.increaseNoItems(increment);	
			
		}
	public void increaseCondimentAndSpice(CondimentAndSpice condimentAndSpice, int increment) {
		condimentAndSpice.increaseNoItems(increment);	
			
		}
	public void increaseBeverage(Beverage beverage, int increment) {
		beverage.increaseNoItems(increment);	
			
		}
	
	public void decreaseBakery(Bakery bakery, int decrement) {
		bakery.decreaseNoItems(decrement);
		
	}
	public void decreaseDiaryProduct(DiaryProduct diaryProduct, int decrement) {
		diaryProduct.decreaseNoItems(decrement);
		
	}
	public void decreaseFrozenFood(FrozenFood frozenFood, int decrement) {
		frozenFood.decreaseNoItems(decrement);
		
	}
	public void decreaseGrain(Grain grain, int decrement) {
		grain.decreaseWeight(decrement);
		
	}
	public void decreaseHealthAndBeauty(HealthAndBeauty healthAndBeauty, int decrement) {
		healthAndBeauty.decreaseNoItems(decrement);
		
	}
	public void decreaseMeatAndSeaFood(MeatAndSeaFood meatAndSeaFood, int decrement) {
		meatAndSeaFood.decreaseWeight(decrement);	
		
	}
	public void decreaseProduce(Produce produce, int decrement) {
		produce.decreaseWeight(decrement);	
			
		}
	public void decreaseSnackAndSweet(SnackAndSweet snackAndSweet, int decrement) {
		snackAndSweet.decreaseNoItems(decrement);	
			
		}
	public void decreaseCondimentAndSpice(CondimentAndSpice condimentAndSpice, int decrement) {
		condimentAndSpice.decreaseNoItems(decrement);	
			
		}
	public void decreaseBeverage(Beverage beverage, int decrement) {
		beverage.decreaseNoItems(decrement);	
			
		}
	
//	public void addStaffMember(ArrayList<Staff> staff,Scanner sc,StaffRepository stRepo) {
//		
//		System.out.println("What type of staff member you want to add ?");
//		System.out.println("1.Manager\t2.Cashier\t3.Floor worker");
//		
//		System.out.println("Enter number : ");
//		int num = sc.nextInt();
//		
//		sc.nextLine();
//		
//		
////		System.out.print("Enter Password :");
////		String password = sc.nextLine();
//		
//		if(num == 1) {
//			Manager manager =new Manager();
//			
////			for(Staff stf:staff) {
////				if(stf.getUserID()== manager.getUserID()) {
////					manager.setUserID(manager.getUserID()+1);
////				}
////			}
//			
//			System.out.print("Name :");
////			String name = sc.nextLine();
//			manager.setFullName(sc.nextLine());
//			
//			System.out.print("Enter user name :");
//			manager.setUserName(sc.next());
//			System.out.print("Enter Password :");
//			manager.setPassword(sc.next());
//			
//			staff.add(manager);
//			stRepo.saveStaff(staff);
//			
//		}
//	
//		
//	}
	
	
//public void addStaffMember(ArrayList<Staff> staff,Scanner sc,StaffRepository stRepo) {
//		
//		System.out.println("\n\t***************INVENTORY MANAGEMENT SYSTEM***************");
//		System.out.println("\n\t\tWhat type of staff member you want to add ?");
//		System.out.println("\t\t1.Manager\t2.Cashier\t3.Floor worker");
//		
//		System.out.println("\n\t\tEnter number : ");
//		int num = sc.nextInt();
//		
//		sc.nextLine();
//		
//		
////		System.out.print("Enter Password :");
////		String password = sc.nextLine();
//		
//		if(num == 1) {
//			Manager manager =new Manager();
//			manager.setUserID(staff.size());
//			
//			
//			boolean isUnique;
//			do {
//				isUnique = true;
//				for(Staff stf:staff) {
//					if(stf.getUserID()== manager.getUserID()) {
//							manager.setUserID(manager.getUserID()+1);
//							isUnique = false;
//						}
//					}
//			}while(!isUnique);
//			
//			System.out.print("\n\tEnter Name :");
//			manager.setFullName(sc.nextLine());
//			
//			System.out.print("\tEnter user name :");
//			manager.setUserName(sc.next());
//			System.out.print("\tEnter Password :");
//			manager.setPassword(sc.next());
//			sc.nextLine();
//			System.out.print("\tEnter date Joined (yy/mm/dd) :");
//			manager.setJoinedDate(sc.nextLine());
//			
//			staff.add(manager);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 2) {
//			Cashier cashier = new Cashier();
//			cashier.setUserID(staff.size());
//			
//			
//			
//			boolean isUnique;
//			do {
//				isUnique = true;
//				for(Staff stf:staff) {
//					if(stf.getUserID()== cashier.getUserID()) {
//							cashier.setUserID(cashier.getUserID()+1);
//							isUnique = false;
//						}
//					}
//			}while(!isUnique);
//			
//			System.out.print("\n\tEnter Name :");
////			String name = sc.nextLine();
//			cashier.setFullName(sc.nextLine());
//			
//			System.out.print("\tEnter user name :");
//			cashier.setUserName(sc.next());
//			System.out.print("\tEnter Password :");
//			cashier.setPassword(sc.next());
//			
//			sc.nextLine();
//			System.out.print("\tEnter date Joined (yy/mm/dd) :");
//			cashier.setJoinedDate(sc.nextLine());
//			
//			staff.add(cashier);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 3) {
//			FloorWorker floorWorker = new FloorWorker();
//			floorWorker.setUserID(staff.size());
//			
//			
//			boolean isUnique;
//			do {
//				isUnique = true;
//				for(Staff stf:staff) {
//					if(stf.getUserID()== floorWorker.getUserID()) {
//							floorWorker.setUserID(floorWorker.getUserID()+1);
//							isUnique = false;
//						}
//					}
//			}while(!isUnique);
//			
//			System.out.print("\n\tEnter Name :"); 
////			String name = sc.nextLine();
//			floorWorker.setFullName(sc.nextLine());
//			
//			System.out.print("\tEnter user name :");
//			floorWorker.setUserName(sc.next());
//			System.out.print("\tEnter Password :");
//			floorWorker.setPassword(sc.next());
//			sc.nextLine();
//			System.out.print("\tEnter date Joined (yy/mm/dd) :");
//			floorWorker.setJoinedDate(sc.nextLine());
//			
//			staff.add(floorWorker);
//			stRepo.saveStaff(staff);
//			
//		}
//	
//		
//	}
//	
//	public void removeStaffMember(ArrayList<Staff> staff,Scanner sc) {
//	
//		System.out.print("Enter the ID of the member you want to delete :");
//		int id = sc.nextInt();
//		Iterator<Staff> itr = staff.iterator();
//		
//		while(itr.hasNext()) {
//			Staff member = itr.next();
//			if(member.getUserID() == id) {
//				itr.remove();
//			}
//		}
//		
//	}
	
	public void approveStock() {
		
	}
	
	public void handleOrder() {
		
	}
	public void addNewItem() {
		
	}
	public void removeItem() {
		
	}

	
public void addNewCategory(ArrayList<Item> items,Scanner sc,ItemRepository itRepo) {
	
	//Stock.addNewCategory(items, sc, itRepo);
		
//		//System.out.println("\n\t***************INVENTORY MANAGEMENT SYSTEM***************");
//		System.out.println("\n\t\tWhat type of category you want to add ?");
//		System.out.println("\t\t1.Produce\t2.Meat and Sea Food\t3.Grains\t4.Bakery\t5.Frozen Foods");
//		System.out.println("\t\t6.Dairy Products\t7.Snacks and Sweets\t8.Beverages\t9.Beauty Products\t10.Spices and Condiments");
//		
//		System.out.println("\n\t\tEnter number : ");
//		int num = sc.nextInt();
//		
//		sc.nextLine();
//		
//		if(num == 1) {
//			Produce produce =new Produce();
//			
//			for(Item item:items) {
//				if(item.getId()== produce.getId()) {
//					produce.setId(produce.getId()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			produce.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			produce.setRetailPrice(sc.nextInt());
//			System.out.print("\tEnter Discount :");
//			produce.setDiscount(sc.nextInt());
//			System.out.print("\tEnter Promotion :");
//			produce.setPromotion(sc.nextInt());
//			System.out.print("\tEnter Weight :");
//			produce.setWeight(sc.nextFloat());
//			
//			items.add(produce);
//			itRepo.saveProduct(items);
//			
//		}
		
//		if(num == 2) {
//			MeatAndSeaFood meatAndSeaFood =new MeatAndSeaFood();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== meatAndSeaFood.getUserID()) {
//					meatAndSeaFood.setUserID(meatAndSeaFood.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			meatAndSeaFood.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			meatAndSeaFood.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			meatAndSeaFood.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			meatAndSeaFood.setPromotion(sc.next());
//			System.out.print("\tEnter Weight :");
//			meatAndSeaFood.setweight(sc.next());
//			
//			staff.add(meatAndSeaFood);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 3) {
//			Grain grain =new Grain();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== grain.getUserID()) {
//					grain.setUserID(grain.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			grain.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			grain.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			grain.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			grain.setPromotion(sc.next());
//			System.out.print("\tEnter Weight :");
//			grain.setweight(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			grain.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			grain.setBrand(sc.next());
//			
//			staff.add(grain);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 4) {
//			Bakery bakery =new Bakery();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== bakery.getUserID()) {
//					bakery.setUserID(bakery.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			bakery.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			bakery.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			bakery.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			bakery.setPromotion(sc.next());
//			System.out.print("\tEnter NumOfItems :");
//			bakery.setNumOfItem(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			bakery.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			bakery.setBrand(sc.next());
//			
//			staff.add(bakery);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 5) {
//			FrozenFoods frozenFoods =new FrozenFoods();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== frozenFoods.getUserID()) {
//					frozenFoods.setUserID(frozenFoods.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			frozenFoods.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			frozenFoods.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			frozenFoods.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			frozenFoods.setPromotion(sc.next());
//			System.out.print("\tEnter NumOfItems :");
//			frozenFoods.setNumOfItem(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			frozenFoods.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			frozenFoods.setBrand(sc.next());
//			
//			staff.add(frozenFoods);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 6) {
//			DiaryProduct diaryProduct =new DiaryProduct();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== diaryProduct.getUserID()) {
//					diaryProduct.setUserID(diaryProduct.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			diaryProduct.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			diaryProduct.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			diaryProduct.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			diaryProduct.setPromotion(sc.next());
//			System.out.print("\tEnter NumOfItems :");
//			diaryProduct.setNumOfItem(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			diaryProduct.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			diaryProduct.setBrand(sc.next());
//			
//			staff.add(diaryProduct);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 7) {
//			SnackAndSweet snackAndSweet =new SnackAndSweet();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== snackAndSweet.getUserID()) {
//					snackAndSweet.setUserID(snackAndSweet.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			snackAndSweet.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			snackAndSweet.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			snackAndSweet.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			snackAndSweet.setPromotion(sc.next());
//			System.out.print("\tEnter NumOfItems :");
//			snackAndSweet.setNumOfItem(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			snackAndSweet.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			snackAndSweet.setBrand(sc.next());
//			
//			staff.add(snackAndSweet);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 8) {
//			Beverage beverage =new Beverage();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== beverage.getUserID()) {
//					beverage.setUserID(beverage.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			beverage.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			beverage.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			beverage.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			beverage.setPromotion(sc.next());
//			System.out.print("\tEnter NumOfItems :");
//			beverage.setNumOfItem(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			beverage.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			beverage.setBrand(sc.next());
//			
//			staff.add(beverage);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 9) {
//			HealthAndBeauty healthAndBeauty =new HealthAndBeauty();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== healthAndBeauty.getUserID()) {
//					healthAndBeauty.setUserID(healthAndBeauty.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			healthAndBeauty.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			healthAndBeauty.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			healthAndBeauty.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			healthAndBeauty.setPromotion(sc.next());
//			System.out.print("\tEnter NumOfItems :");
//			healthAndBeauty.setNumOfItem(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			healthAndBeauty.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			healthAndBeauty.setBrand(sc.next());
//			
//			staff.add(healthAndBeauty);
//			stRepo.saveStaff(staff);
//			
//		}
//		
//		
//		if(num == 10) {
//			CondimentAndSpice condimentAndSpice =new CondimentAndSpice();
//			
//			for(Staff stf:staff) {
//				if(stf.getUserID()== condimentAndSpice.getUserID()) {
//					condimentAndSpice.setUserID(condimentAndSpice.getUserID()+1);
//				}
//			}
//			
//			System.out.print("\n\tEnter Item Name :");
//			condimentAndSpice.setItemName(sc.nextLine());	
//			System.out.print("\tEnter Retail Price :");
//			condimentAndSpice.setRetailPrice(sc.next());
//			System.out.print("\tEnter Discount :");
//			condimentAndSpice.setDiscount(sc.next());
//			System.out.print("\tEnter Promotion :");
//			condimentAndSpice.setPromotion(sc.next());
//			System.out.print("\tEnter NumOfItems :");
//			condimentAndSpice.setNumOfItem(sc.next());
//			System.out.print("\tEnter IsLocal :");
//			condimentAndSpice.setIsLocal(sc.next());
//			System.out.print("\tEnter Brand :");
//			condimentAndSpice.setBrand(sc.next());
//			
//			staff.add(condimentAndSpice);
//			stRepo.saveStaff(staff);
//			
//		}
		
		
		
	}
	
	
}

