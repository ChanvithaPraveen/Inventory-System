package Stock;

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
import Staff.Owner;
import Staff.Staff;
import Staff.StaffRepository;

public class Stock {
	ArrayList<Transaction> transactions= new ArrayList<>();
	

	public static void showItemList(ArrayList<Item> items) {
		
		ArrayList<Bakery> bakery =new ArrayList<>();
		ArrayList<Beverage> beverage =new ArrayList<>();
		ArrayList<DiaryProduct> diaProduct =new ArrayList<>();
		ArrayList<FrozenFood> froFood =new ArrayList<>();
		ArrayList<Grain> grain =new ArrayList<>();
		ArrayList<HealthAndBeauty> healthBeauty =new ArrayList<>();
		ArrayList<Produce> produce =new ArrayList<>();
		ArrayList<SnackAndSweet> snackSweet =new ArrayList<>();
		ArrayList<MeatAndSeaFood> meatSeaFood =new ArrayList<>();
		ArrayList<CondimentAndSpice> condimentAndSpice =new ArrayList<>();
		
		
		for(Item item:items) {
			
			if(item instanceof Bakery) {
				bakery.add((Bakery) item);
			}
			
			if(item instanceof Beverage) {
				beverage.add((Beverage) item);
			}
			
			if(item instanceof DiaryProduct) {
				diaProduct.add((DiaryProduct) item);
			}
			
			if(item instanceof FrozenFood) {
				froFood.add((FrozenFood) item);
			}
			
			if(item instanceof Grain) {
				grain.add((Grain) item);
			}
			
			if(item instanceof HealthAndBeauty) {
				healthBeauty.add((HealthAndBeauty) item);
			}
			
			if(item instanceof Produce) {
				produce.add((Produce) item);
			}
			
			if(item instanceof SnackAndSweet) {
				snackSweet.add((SnackAndSweet) item);
			}
			
			if(item instanceof MeatAndSeaFood) {
				meatSeaFood.add((MeatAndSeaFood) item);
			}
			
			if(item instanceof CondimentAndSpice) {
				condimentAndSpice.add((CondimentAndSpice) item);
			}
	
	}
		
		
		System.out.println("---Bakery Items---\n");
		for(Bakery ba:bakery) {
			ba.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("---Beverage Items---\n");
		for(Beverage be:beverage) {
			be.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("---Diary Products---\n");
		for(DiaryProduct dp:diaProduct) {
			dp.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("---Frozen Food---\n");
		for(FrozenFood ff:froFood) {
			ff.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("---Grain---\n");
		for(Grain g:grain) {
			g.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("---Health and Beauty---\n");
		for(HealthAndBeauty hb:healthBeauty) {
			hb.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		
		System.out.println("---Meat and Seafood---\n");
		for(MeatAndSeaFood ms : meatSeaFood) {
			ms.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		
		System.out.println("---Produce---\n");
		for(Produce p:produce) {
			p.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		
		System.out.println("---Snack And Sweet---\n");
		for(SnackAndSweet ss:snackSweet) {
			ss.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
		
		
		System.out.println("---Condiments And Spice---\n");
		for(CondimentAndSpice cs:condimentAndSpice) {
			cs.printItem();
			System.out.println();
		}
		
		System.out.println("\n");
	
	}
	
	
	
	
public static void addNewItem(ArrayList<Item> items,ItemRepository itRepo) {
		Scanner sc =new Scanner(System.in);
		//System.out.println("\n\t***************INVENTORY MANAGEMENT SYSTEM***************");
		System.out.println("\n\tWhat type of category you want to add ?");
		System.out.println("\t1.Produce\t\t2.Meat and Sea Food\t3.Grains\t4.Bakery\t\t5.Frozen Foods");
		System.out.println("\t6.Dairy Products\t7.Snacks and Sweets\t8.Beverages\t9.Beauty Products\t10.Spices and Condiments");
		
		System.out.print("\n\tEnter number : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		if(num == 1) {
			Produce produce =new Produce();
			produce.setId(items.size());
			
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== produce.getId()) {
						produce.setId(produce.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			produce.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			produce.setRetailPrice(sc.nextInt());
			System.out.print("\tEnter Discount :");
			produce.setDiscount(sc.nextInt());
			System.out.print("\tEnter Promotion :");
			produce.setPromotion(sc.nextInt());
			System.out.print("\tEnter Weight (in kg) :");
			produce.setWeight(sc.nextFloat());
			
			items.add(produce);
			itRepo.saveProduct(items);
			
		}
		
		if(num == 2) {
			MeatAndSeaFood meatAndSeaFood =new MeatAndSeaFood();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== meatAndSeaFood.getId()) {
						meatAndSeaFood.setId(meatAndSeaFood.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			meatAndSeaFood.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			meatAndSeaFood.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			meatAndSeaFood.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			meatAndSeaFood.setPromotion(sc.nextFloat());
			System.out.print("\tEnter Weight (in kg) :");
			meatAndSeaFood.setWeight(sc.nextFloat());
			
			items.add(meatAndSeaFood);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 3) {
			Grain grain =new Grain();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== grain.getId()) {
						grain.setId(grain.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			grain.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			grain.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			grain.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			grain.setPromotion(sc.nextFloat());
			System.out.print("\tEnter Weight (in kg) :");
			grain.setWeight(sc.nextFloat());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			grain.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			grain.setBrand(sc.next());
			
			items.add(grain);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 4) {
			Bakery bakery =new Bakery();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== bakery.getId()) {
						bakery.setId(bakery.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			bakery.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			bakery.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			bakery.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			bakery.setPromotion(sc.nextFloat());
			System.out.print("\tEnter NumOfItems :");
			bakery.setNumOfItems(sc.nextInt());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			bakery.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			bakery.setBrand(sc.next());
			
			items.add(bakery);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 5) {
			FrozenFood frozenFood =new FrozenFood();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== frozenFood.getId()) {
						frozenFood.setId(frozenFood.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			frozenFood.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			frozenFood.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :"); 
			frozenFood.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			frozenFood.setPromotion(sc.nextFloat());
			System.out.print("\tEnter NumOfItems :");
			frozenFood.setNumOfItems(sc.nextInt());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			frozenFood.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			frozenFood.setBrand(sc.next());
			
			items.add(frozenFood);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 6) {
			DiaryProduct diaryProduct =new DiaryProduct();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== diaryProduct.getId()) {
						diaryProduct.setId(diaryProduct.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			diaryProduct.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			diaryProduct.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			diaryProduct.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			diaryProduct.setPromotion(sc.nextFloat());
			System.out.print("\tEnter NumOfItems :");
			diaryProduct.setNumOfItems(sc.nextInt());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			diaryProduct.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			diaryProduct.setBrand(sc.next());
			
			items.add(diaryProduct);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 7) {
			SnackAndSweet snackAndSweet =new SnackAndSweet();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== snackAndSweet.getId()) {
						snackAndSweet.setId(snackAndSweet.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			snackAndSweet.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			snackAndSweet.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			snackAndSweet.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			snackAndSweet.setPromotion(sc.nextFloat());
			System.out.print("\tEnter NumOfItems :");
			snackAndSweet.setNumOfItems(sc.nextInt());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			snackAndSweet.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			snackAndSweet.setBrand(sc.next());
			
			items.add(snackAndSweet);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 8) {
			Beverage beverage =new Beverage();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== beverage.getId()) {
						beverage.setId(beverage.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			beverage.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			beverage.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			beverage.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			beverage.setPromotion(sc.nextFloat());
			System.out.print("\tEnter NumOfItems :");
			beverage.setNumOfItems(sc.nextInt());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			beverage.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			beverage.setBrand(sc.next());
			
			items.add(beverage);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 9) {
			HealthAndBeauty healthAndBeauty =new HealthAndBeauty();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== healthAndBeauty.getId()) {
						healthAndBeauty.setId(healthAndBeauty.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			healthAndBeauty.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			healthAndBeauty.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			healthAndBeauty.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			healthAndBeauty.setPromotion(sc.nextFloat());
			System.out.print("\tEnter NumOfItems :");
			healthAndBeauty.setNumOfItems(sc.nextInt());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			healthAndBeauty.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			healthAndBeauty.setBrand(sc.next());
			
			items.add(healthAndBeauty);
			itRepo.saveProduct(items);
			
		}
		
		
		if(num == 10) {
			CondimentAndSpice condimentAndSpice =new CondimentAndSpice();
			
			boolean isUnique;
			do {
				isUnique = true;
				for(Item item:items) {
					if(item.getId()== condimentAndSpice.getId()) {
						condimentAndSpice.setId(condimentAndSpice.getId()+1);
						isUnique=false;
					}
				}
			}while(!isUnique);
			
			System.out.print("\n\tEnter Item Name :");
			condimentAndSpice.setItemName(sc.nextLine());	
			System.out.print("\tEnter Retail Price (per kg) :");
			condimentAndSpice.setRetailPrice(sc.nextFloat());
			System.out.print("\tEnter Discount :");
			condimentAndSpice.setDiscount(sc.nextFloat());
			System.out.print("\tEnter Promotion :");
			condimentAndSpice.setPromotion(sc.nextFloat());
			System.out.print("\tEnter NumOfItems :");
			condimentAndSpice.setNumOfItems(sc.nextInt());
			System.out.print("\tEnter IsLocal (\"true\" or \"false\") :");
			condimentAndSpice.setLocal(sc.nextBoolean());
			System.out.print("\tEnter Brand :");
			condimentAndSpice.setBrand(sc.next());
			
			items.add(condimentAndSpice);
			itRepo.saveProduct(items);
			
		}
		
		System.out.println("Item added successfully....\n");
		
	}


public static void removeItem(ArrayList<Item> items) {
	Scanner sc = new Scanner(System.in);
	System.out.print("\nEnter the ID of the item you want to delete :");
	int id = sc.nextInt();
	Iterator<Item> itr = items.iterator();
	
	while(itr.hasNext()) {
		Item item = itr.next();
		if(item.getId() == id) {
			itr.remove();
		}
	}
	System.out.println("Item removed successfully....\n");
}

public static void showStockInterface(ArrayList<Item> items,ItemRepository itRepo,Staff loggedInMember) throws CloneNotSupportedException {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\t1.Show item list\n\t2.Add item\n\t3.Remove item\n\t4.Sell order\n\t5.Back");
	int input ;
	
	do {
		System.out.print("\tEnter:");
		input = sc.nextInt();
		if(input<1 || input >5) {
			System.out.println("\tInvalid input...Enter again.");
		
		}
	}
	while(input<1 || input >5);
	
	if(input == 1) {showItemList(items);
	showStockInterface(items, itRepo,loggedInMember);
	}
	if(input == 2) {addNewItem(items, itRepo);;
	showStockInterface(items, itRepo,loggedInMember);
	}
	if(input == 3) {removeItem(items);
	showStockInterface(items, itRepo,loggedInMember);
	}
	if(input == 4)sellOrder(loggedInMember,items);
	
	if(input==5)return;
	
	
	
}




private static void sellOrder(Staff loggedInMember,ArrayList<Item> items) throws CloneNotSupportedException {
//	Transaction transaction = new Transaction();
//	ArrayList<Item> cart = new ArrayList<>();
//	
//	showItemList(items);
//	
//	transaction.setSeller(loggedInMember);
//	transaction.setCustomerName("Gunadasa");
	
	
	HandleTransaction.getTransactionDetails(items,loggedInMember);
	
}
}
