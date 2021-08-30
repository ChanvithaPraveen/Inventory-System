package Supply;

import Category.Item;
import Category.Produce;

public class Supply {
	
	protected Item itemType;
	protected int id;
	protected boolean isPending;
	protected String dateOfDepature;
	protected String dateOfArrival;
	
	public Supply() {
		
	}
	
	public Supply(Item itemType, boolean isPending, String dateOfDepature, String dateOfArrival) {
		super();
		this.itemType = itemType;
		this.isPending = isPending;
		this.dateOfDepature = dateOfDepature;
		this.dateOfArrival = dateOfArrival;
	}

	public Item getItemType() {
		return itemType; 
	}

	public void setItemType(Item itemType) {
		this.itemType = itemType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPending() {
		return isPending;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}

	public String getDateOfDepature() {
		return dateOfDepature;
	}

	public void setDateOfDepature(String dateOfDepature) {
		this.dateOfDepature = dateOfDepature;
	}

	public String getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(String dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	
	public void printSupply(){
		System.out.printf("%-10s : %s\n","Item",this.itemType.getItemName());
		System.out.printf("%-10s : %s\n","Id",(this.itemType).getId());
		System.out.printf("%-10s : %s\n","Arrived Date",this.getDateOfArrival());
		System.out.printf("%-10s : %s\n","Departure Date",this.getDateOfDepature());
		System.out.printf("%-10s : %s\n","Is pending",this.isPending);
		
		
		System.out.println();
	}
	
	
}
