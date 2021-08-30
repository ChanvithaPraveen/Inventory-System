package Staff;

import Category.Bakery;
import Category.Beverage;
import Category.CondimentAndSpice;
import Category.DiaryProduct;
import Category.FrozenFood;
import Category.Grain;
import Category.HealthAndBeauty;
import Category.MeatAndSeaFood;
import Category.Produce;
import Category.SnackAndSweet;

public class Cashier extends Staff{

	public Cashier() {
		super();
	}

	public Cashier( String userName, String password, String fullName, String joinedDate) {
		super( userName, password, fullName, joinedDate);
		
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
	public void handleOrder() {
		
	}
	
}
