package Category;

public class DiaryProduct extends Item implements NumberItems {
	
	private String brand;
	private int numOfItems;
	private boolean isLocal;//local or imported

	public DiaryProduct() {
		super();
	}

	public DiaryProduct( String itemName, float retailPrice, float discount,  float promotion,int numOfItems,boolean isLocal,String brand) {
		super( itemName, retailPrice, discount, promotion);
		this.numOfItems = numOfItems;
		this.isLocal=isLocal;
		this.brand = brand;
	}
	

	

	public int getNumOfItems() {
		return numOfItems;
	}

	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isLocal() {
		return isLocal;
	}

	public void setLocal(boolean isLocal) {
		this.isLocal = isLocal;
	}
	public void increaseNoItems(int increment) {
		this.numOfItems += increment;
	}
	public void decreaseNoItems(int decrement) {
		this.numOfItems -= decrement;
		
	}

	
public void printItem() {
		System.out.printf("Item ID : %d\n\t", this.getId());
		System.out.printf("Item Name : %s\n\t", this.getItemName());
		System.out.printf("Retail Price : %s\n\t", this.getRetailPrice());
		System.out.printf("Discount : %s\n\t", this.getDiscount());
		System.out.printf("Promotion : %s\n\t", this.getPromotion());
		System.out.printf("Number of items : %s\n\t", this.numOfItems);
		System.out.printf("Is Local : %s\n\t", this.isLocal);
		System.out.printf("Brand : %s\n\t", this.brand);
	}
	

}
