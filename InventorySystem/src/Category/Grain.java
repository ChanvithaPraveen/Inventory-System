package Category;

public class Grain extends Item implements WeightItems {
	
	private String brand;
	private float weight;
	private boolean isLocal;//local or imported

	public Grain() {
		super();
	}

	public Grain( String itemName, float retailPrice, float discount,  float promotion,float weight,boolean isLocal,String brand) {
		super( itemName, retailPrice, discount, promotion);
		this.weight = weight;
		this.isLocal=isLocal;
		this.brand = brand;
	}
	

	public float getWeight() {
		return weight;
	}
	

	public void setWeight(float weight) {
		this.weight = weight;
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
	
	public void increaseWeight(int increment) {
		this.weight += increment;
	}
	public void decreaseWeight(int decrement) {
		this.weight -= decrement;
		
	}
	
	public void printItem() {
		
		System.out.printf("Item ID : %d\n\t", this.getId());
		System.out.printf("Item Name : %s\n\t", this.itemName);
		System.out.printf("Retail Price : %s\n\t", this.getItemName());
		System.out.printf("Discount : %s\n\t", this.getDiscount());
		System.out.printf("Promotion : %s\n\t", this.getPromotion());
		System.out.printf("Weight : %s\n\t", this.weight);
		System.out.printf("Is Local : %s\n\t", this.isLocal);
		System.out.printf("Brand : %s\n\t", this.brand);
	}

	
	
	

}
