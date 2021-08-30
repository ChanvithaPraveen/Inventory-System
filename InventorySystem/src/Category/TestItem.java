package Category;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Category.Bakery;
import Category.ItemRepository;
import Category.MeatAndSeaFood;
import Category.Produce;
import Category.SnackAndSweet;
import Staff.Cashier;
import Staff.Owner;
import Staff.Staff;

public class TestItem {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Item> items = new ArrayList<>();
		ItemRepository repo  = new ItemRepository();
		
//		Bakery bread = new Bakery(2,"Bread",100,10,0,10,true,"Prima");
//		Grain dal = new Grain(3,"dal",100,10,0,10,true,"Prima");
////		
//		items.add(bread);
//		items.add(dal);
//		
//	
//		repo.saveProduct(items);
		ArrayList<Item> savedItems = repo.getItems();
		
		
		for(Item item:savedItems) {
			
			System.out.println(item.getItemName());
		}
		
		
//		MeatAndSeaFood mas = new MeatAndSeaFood(1,"Chicken",100,10,0,0.5f);
//		repo.saveProduct(mas, "meat_and_sea_food.xml");
	}

}
