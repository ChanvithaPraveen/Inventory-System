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


public class Manager extends Staff{

	public Manager() {
	super();
		
	}

	public Manager(String userName, String password, String fullName, String joinedDate) {
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
	public void addNewItem() {
		
	}
public void removeItem() {
		
	}
	
	
}
