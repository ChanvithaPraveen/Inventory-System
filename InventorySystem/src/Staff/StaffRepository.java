package Staff;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class StaffRepository {
	
	
	XMLDecoder decoder=null;
	XMLEncoder encoder=null;
	
	public void saveStaff(Object object) {
		
		try{
		encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("staff.xml")));
		}catch(FileNotFoundException fileNotFound){
			System.out.println("ERROR: While Creating or Opening the File staff.xml");
		}
		encoder.writeObject(object);
		//encoder.writeObject(cashier2);
		encoder.close();
	}

	public ArrayList<Staff> getStaff() {
		//ArrayList<Cashier> cashiers = new ArrayList<>();
		ArrayList<Staff> staff = null;
		try{
			decoder=new XMLDecoder(new BufferedInputStream(new FileInputStream("staff.xml")));
			
			do {
				staff = (ArrayList<Staff>) decoder.readObject();
				//cashiers.add(cashier);
			}
			while(null!=staff);
			
			
			}catch(FileNotFoundException fileNotFound){
				System.out.println("ERROR: While finding or Opening the File user.xml");
			}
			catch(ArrayIndexOutOfBoundsException ex){
				
			}
		
			

			finally {
			decoder.close();}
				

		return staff;
			
			
	}
	
}
