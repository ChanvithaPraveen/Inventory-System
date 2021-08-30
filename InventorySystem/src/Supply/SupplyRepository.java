package Supply;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import Staff.Staff;

public class SupplyRepository {
	

	XMLDecoder decoder=null;
	XMLEncoder encoder=null;
	
	public void saveSupply(Object object) {
		
		try{
		encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("supply.xml")));
		}catch(FileNotFoundException fileNotFound){
			System.out.println("ERROR: While Creating or Opening the File supply.xml");
		}
		encoder.writeObject(object);
		//encoder.writeObject(cashier2);
		encoder.close();
	}

	public ArrayList<Supply> getSupply() {
		//ArrayList<Cashier> cashiers = new ArrayList<>();
		ArrayList<Supply> supply = null;
		try{
			decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("supply.xml")));
			
			do {
				supply = (ArrayList<Supply>) decoder.readObject();
				//cashiers.add(cashier);
			}
			while(null!=supply);
			
			
			}catch(FileNotFoundException fileNotFound){
				System.out.println("ERROR: While finding or Opening the File supply.xml");
			}
			catch(ArrayIndexOutOfBoundsException ex){
				
			}
		
			

			finally {
			decoder.close();}
				

		return supply;
			
			
	}

}
