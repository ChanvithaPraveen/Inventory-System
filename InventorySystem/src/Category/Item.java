package Category;

public class Item implements Cloneable {
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	private int id;
	protected String itemName;
	protected float retailPrice;
	protected float discount;
	protected float finalPrice;
	protected float promotion;
	
	public Item() {
		
	}
	
	
	public Item( String itemName, float retailPrice, float discount, float promotion) {
	
		
		this.itemName = itemName;
		this.retailPrice = retailPrice;
		this.discount = discount;
		this.promotion = promotion;
	}
	
	public Item copyItem(Item item) {
		
		return item;
	} 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(float retailPrice) {
		this.retailPrice = retailPrice;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getFinalPrice() {
		return finalPrice;
	}
	
	public void setFinalPrice(float finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public float getPromotion() {
		return promotion;
	}
	
	public void setPromotion(float promotion) {
		this.promotion = promotion;
	}
	
	
	public float calFinalPrice() {
		this.finalPrice = this.retailPrice - this.retailPrice*this.discount/100- this.retailPrice*this.promotion/100;
		return finalPrice;
	}
	
	public void printItem() {
		
	}
	

}
