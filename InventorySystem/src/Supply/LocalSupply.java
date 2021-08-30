package Supply;

import Category.Item;

public class LocalSupply extends Supply{
	
	private String supplierName; 
	private String vehicleType;
	private String vehicleID;
	
	public LocalSupply() {
		super();
		
	}
	public LocalSupply(Item itemType, boolean isPending, String dateOfDepature, String dateOfArrival,String supplierName,String vehicleType,String vehicleID) {
		super(itemType, isPending, dateOfDepature, dateOfArrival);
		this.supplierName = supplierName;
		this.vehicleType = vehicleType;
		this.vehicleID = vehicleID;
		
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleID() {
		return vehicleID;
	}
	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}
	
	public void printSupply(){
		
		System.out.printf("\t%-10s : %s\n","Supply Id",this.id);
		System.out.printf("\t%-10s : %s\n","Item",this.itemType.getItemName());
		System.out.printf("\t%-10s : %s\n","Arrived Date",this.dateOfArrival);
		System.out.printf("\t%-10s : %s\n","Departure Date",this.dateOfDepature);
		System.out.printf("\t%-10s : %s\n","Supplier name",this.supplierName);
		System.out.printf("\t%-10s : %s\n","Vehicle type",this.vehicleType);
		System.out.printf("\t%-10s : %s\n","Vehicle id",this.vehicleID);
		System.out.printf("\t%-10s : %s\n","Is pending",this.isPending);
		
		
		System.out.println();
	}
	
}
