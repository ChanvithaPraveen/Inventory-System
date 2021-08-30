package Supply;

import Category.Item;

public class InternationalSupply extends Supply{

		private String shipNumber;
		private String dateToHabour;
		private String origin;
		
		public InternationalSupply() {
			super();
			
		}
		
		public InternationalSupply(Item itemType, boolean isPending, String dateOfDepature,
				String dateOfArrival,String shipNumber,String dateToHabour,String origin) {
			super(itemType, isPending, dateOfDepature, dateOfArrival);
			this.shipNumber = shipNumber;
			this.dateToHabour = dateToHabour;
			this.origin = origin;
			
		}
		public String getShipNumber() {
			return shipNumber;
		}
		public void setShipNumber(String shipNumber) {
			this.shipNumber = shipNumber;
		}
		public String getDateToHabour() {
			return dateToHabour;
		}
		public void setDateToHabour(String dateToHabour) {
			this.dateToHabour = dateToHabour;
		}
		
		public void printSupply(){
			
			System.out.printf("\t%-15s : %s\n","Supply Id",this.id);
			System.out.printf("\t%-15s : %s\n","Item",this.itemType.getItemName());
			System.out.printf("\t%-15s : %s\n","Arrived Date",this.dateOfArrival);
			System.out.printf("\t%-15s : %s\n","Departure Date",this.dateOfDepature);
			System.out.printf("\t%-15s : %s\n","Supplier name",this.shipNumber);
			System.out.printf("\t%-15s : %s\n","Date to Harbour",this.dateToHabour);
			System.out.printf("\t%-15s : %s\n","Origin",this.origin);
			System.out.printf("\t%-15s : %s\n","Is pending",this.isPending);
			
			
			System.out.println();
		}
		
	
}
