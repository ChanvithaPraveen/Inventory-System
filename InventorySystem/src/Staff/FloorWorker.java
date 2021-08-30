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


public class FloorWorker extends Staff{

	public FloorWorker() {
		super();
		
	}

	public FloorWorker( String userName, String password, String fullName, String joinedDate) {
		super( userName, password, fullName, joinedDate);
		
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
	
	
	public void approveStock() {
		
	}
	
	public void addNewItem() {
		
	}
	public void removeItem() {
		
	}
	
}
