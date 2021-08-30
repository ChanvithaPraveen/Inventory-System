package Category;

public class Produce extends Item implements WeightItems{

		private float weight;

		public Produce() {
			super();
		}

		public Produce( String itemName, float retailPrice, float discount,  float promotion,float weight) {
			super( itemName, retailPrice, discount, promotion);
			this.weight = weight;
		}
		

		public float getWeight() {
			return weight;
		}
		

		public void setWeight(float weight) {
			this.weight = weight;
		}
		public void increaseWeight(int increment) {
			this.weight += increment;
		}
		public void decreaseWeight(int decrement) {
			this.weight -= decrement;
			
		}
		
		public void printItem() {
			
			System.out.printf("Item ID : %d\n\t", this.getId());
			System.out.printf("Item Name : %s\n\t", this.getItemName());
			System.out.printf("Retail Price : %s\n\t", this.getRetailPrice());
			System.out.printf("Discount : %s\n\t", this.getDiscount());
			System.out.printf("Promotion : %s\n\t", this.getPromotion());
			System.out.printf("Weight : %s\n\t", this.weight);
		}
		
		
}
