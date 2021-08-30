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
import Category.MeatAndSeaFood;
import Category.Produce;
import Category.SnackAndSweet;
import Staff.Staff;

public class HandleTransaction {

	
	
	public static void getTransactionDetails(ArrayList<Item> items,Staff loggedInMember) throws CloneNotSupportedException {
		Transaction transaction = new Transaction();
		transaction.setSeller(loggedInMember);
		Scanner sc = new Scanner(System.in);
		
		Stock.showItemList(items);
		boolean cont = true;
		
		do {
		System.out.print("Enter the id of the item :");
		
		int id = sc.nextInt();
		Item addingItem =new Item();
		Item stockItem = new Item();
		for(Item item:items) {
			
			if(id == item.getId()) {
				stockItem = item;
				addingItem = (Item) item.clone();
			}
		}
		
		if(addingItem instanceof Grain)
		{			
			System.out.print("Enter the weight :");
			float weight = sc.nextFloat();
			
		((Grain) addingItem).setWeight(weight);
		((Grain)stockItem).setWeight(((Grain)stockItem).getWeight() - weight);
		
		}
		

		
		if(addingItem instanceof MeatAndSeaFood)
		{
			System.out.print("Enter the weight :");
			float weight = sc.nextFloat();
		
		((MeatAndSeaFood) addingItem).setWeight(weight);
		((MeatAndSeaFood)stockItem).setWeight(((MeatAndSeaFood)stockItem).getWeight() - weight);
		
		}
		
		if(addingItem instanceof Produce)
		
		{
			System.out.print("Enter the weight :");
			float weight = sc.nextFloat();
			
		((Produce) addingItem).setWeight(weight);	
		((Produce)stockItem).setWeight(((Produce)stockItem).getWeight() - weight);
		
		
		}
		
		if(addingItem instanceof Bakery)
		{
			System.out.print("Enter number of items :");
			int noItems = sc.nextInt();
			
		((Bakery) addingItem).setNumOfItems(noItems);
		((Bakery)stockItem).setNumOfItems(((Bakery)stockItem).getNumOfItems()-noItems);
		
		}
		
		if(addingItem instanceof FrozenFood)
		{
			System.out.print("Enter number of items :"); 
			int noItems = sc.nextInt();
			
		((FrozenFood) addingItem).setNumOfItems(noItems);
		((FrozenFood)stockItem).setNumOfItems(((FrozenFood)stockItem).getNumOfItems()-noItems);
		
		
		}
		 
		
		if(addingItem instanceof DiaryProduct)
		{ 
			System.out.print("Enter number of items :"); 
			int noItems = sc.nextInt();
		((DiaryProduct) addingItem).setNumOfItems(noItems);
		((DiaryProduct)stockItem).setNumOfItems(((DiaryProduct)stockItem).getNumOfItems()-noItems);
		}
		
		
		if(addingItem instanceof SnackAndSweet)
		{
			System.out.print("Enter number of items :"); 
			int noItems = sc.nextInt();
		((SnackAndSweet) addingItem).setNumOfItems(noItems);
		((SnackAndSweet)stockItem).setNumOfItems(((SnackAndSweet)stockItem).getNumOfItems()-noItems);
		}
		
		
		if(addingItem instanceof Beverage)
		{
			System.out.print("Enter number of items :"); 
			int noItems = sc.nextInt();
		((Beverage) addingItem).setNumOfItems(noItems);
		((Beverage)stockItem).setNumOfItems(((Beverage)stockItem).getNumOfItems()-noItems);
		}
		
		
		if(addingItem instanceof HealthAndBeauty)
		{
			System.out.print("Enter number of items :"); 
			int noItems = sc.nextInt();
		((HealthAndBeauty) addingItem).setNumOfItems(noItems);
		((HealthAndBeauty)stockItem).setNumOfItems(((HealthAndBeauty)stockItem).getNumOfItems()-noItems);
		}
		
		
		if(addingItem instanceof CondimentAndSpice)
		{
			System.out.print("Enter number of items :"); 
			int noItems = sc.nextInt();
		((CondimentAndSpice) addingItem).setNumOfItems(noItems);
		((CondimentAndSpice)stockItem).setNumOfItems(((CondimentAndSpice)stockItem).getNumOfItems()-noItems);
		}
		
		transaction.cart.add(addingItem);
		
		System.out.print("Are you finished picking items... 1)yes  2)No");
		int num = sc.nextInt();
		
		if(num == 1)cont = false;
		
		//Iterator<Item> itr = items.iterator();
		
//		while(itr.hasNext()) {
//			Item item = itr.next();
//			if(item.getId() == id) {
//				itr.remove();
//			}
//		}
		System.out.println();}
		while(cont);
		
		
		printTransactionDetails(transaction);
	}
	
	public static void printTransactionDetails(Transaction transaction) {
		transaction.printBill(transaction);
	}
	
}
