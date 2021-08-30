package Category;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import Staff.Cashier;
import Staff.Staff;

public class ItemRepository {
	
	XMLEncoder encoder=null;
	ArrayList<Cashier> cashiers = new ArrayList<>();
	XMLDecoder decoder=null;
	
	public void saveProduct(ArrayList<Item> items) {
		
		try{
		encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("category.xml")));
		}catch(FileNotFoundException fileNotFound){
			System.out.println("ERROR: While Creating or Opening the File user.xml");
		}
		encoder.writeObject(items);
		//encoder.writeObject(cashier2);
		encoder.close();
	}

	public Produce getProduce() {
		
		Produce produce = null;
		try{
		decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("produce.xml")));
		
		do {
			produce = (Produce) decoder.readObject();
			//add a product to array here
		}
		while(null!=produce);
		
		
		}catch(FileNotFoundException fileNotFound){
			System.out.println("ERROR: While finding or Opening the File user.xml");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("All added to the list");
		}
		

		finally {
		decoder.close();}
		
		return produce;
	}
	
	
public ArrayList<Item> getItems() {
		ArrayList<Item> items = null;
		
		try{
		decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("category.xml")));
		
		do {
			items = (ArrayList<Item>) decoder.readObject();
			//add a product to array here
		}
		while(null!=items);
		
		
		}catch(FileNotFoundException fileNotFound){
			System.out.println("ERROR: While finding or Opening the File category.xml");
		}
		catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println("All added to the list");
		}
		

		finally {
		decoder.close();}
		
		return items;
	}
	


}
