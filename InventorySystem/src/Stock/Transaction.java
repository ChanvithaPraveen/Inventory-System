package Stock;

import java.util.ArrayList;

import Category.Bakery;
import Category.Beverage;
import Category.CondimentAndSpice;
import Category.DiaryProduct;
import Category.FrozenFood;
import Category.Grain;
import Category.HealthAndBeauty;
import Category.Item;
import Category.MeatAndSeaFood;
import Category.NumberItems;
import Category.Produce;
import Category.SnackAndSweet;
import Category.WeightItems;
import Staff.Staff;

public class Transaction {

	String customerName;
	Staff seller;
	ArrayList<Item> cart = new ArrayList<>();
	
	public Transaction() {
		
	}
	
	public Transaction(String customerName, Staff seller, ArrayList<Item> cart) {
	
		this.customerName = customerName;
		this.seller = seller;
		this.cart = cart;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Staff getSeller() {
		return seller;
	}

	public void setSeller(Staff seller) {
		this.seller = seller;
	}

	public ArrayList<Item> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Item> cart) {
		this.cart = cart;
	}

	public float calculateFinalPrice(Transaction transaction) {
		
		float finalPrice = 0;
		for(Item item:transaction.cart) {
			finalPrice+=item.calFinalPrice();
		}
		
		return finalPrice;
	}
	
	public void printBill(Transaction transaction) {
		System.out.println("Welcome to ABC stores");
		
		System.out.printf("Person at cahier is :%s\n",transaction.seller.getFullName());
		
		System.out.print("item\tquantity\tPrice\n");
		
		
		float quantity;
		float billPrice;
		float totalBillPrice=0;
		for(Item item:transaction.cart) {
			
			
			if(item instanceof Bakery) {
				quantity =((Bakery) item).getNumOfItems();
				billPrice = item.calFinalPrice() * quantity;
				totalBillPrice+=billPrice;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
			}
			
			if(item instanceof Beverage) {
				quantity =((Beverage) item).getNumOfItems();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof DiaryProduct) {
				quantity =((DiaryProduct) item).getNumOfItems();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof FrozenFood) {
				quantity =((FrozenFood) item).getNumOfItems();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof Grain) {
				quantity =((Grain) item).getWeight();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof HealthAndBeauty) {
				quantity =((HealthAndBeauty) item).getNumOfItems();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof Produce) {
				quantity =((Produce) item).getWeight();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof SnackAndSweet) {
				quantity =((SnackAndSweet) item).getNumOfItems();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof MeatAndSeaFood) {
				quantity =((MeatAndSeaFood) item).getWeight();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
			}
			
			if(item instanceof CondimentAndSpice) {
				quantity =((CondimentAndSpice) item).getNumOfItems();
				billPrice = item.calFinalPrice() * quantity;
				System.out.printf("%s\t%f\t%f\n",item.getItemName(),quantity,billPrice);
				totalBillPrice+=billPrice;
		}
		
			
	}
		
		System.out.printf("\nTotal bill :%f\n",totalBillPrice);
	}
	
	
	}
