import java.util.ArrayList;
import java.util.Scanner;

import Category.Item;
import Category.ItemRepository;
import Staff.Cashier;
import Staff.FloorWorker;
import Staff.Manager;
import Staff.Owner;
import Staff.Staff;
import Staff.StaffRepository;
import Stock.Stock;
import Supply.Supply;
import Supply.SupplyHandler;
import Supply.SupplyRepository;


public class SystemRunner {
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//load data from xml to the arraylist
		StaffRepository stRepo = new StaffRepository();
		ArrayList<Staff> staff =new ArrayList<>();
		ItemRepository itRepo = new ItemRepository();
		ArrayList<Item> items = new ArrayList<>();
		ArrayList<Supply> supply = new ArrayList<>();
		SupplyRepository spRepo = new SupplyRepository();
		

		staff = stRepo.getStaff();
		items = itRepo.getItems();
		supply = spRepo.getSupply(); 
		
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n\t\t------------------------------------------------");
		System.out.println("\t\t************ WELCOME TO ABC STORES *************");
		System.out.println("\t\t************************************************");
		System.out.println("\t\t********** PROJECT BY PREMIUM HACKERS **********");
		System.out.println("\t\t------------------------------------------------\n\n");
		
	
		//get the user input for login to the system
		System.out.print("\tEnter user name :");
		String userName = sc.nextLine();
		System.out.print("\tEnter Password :");
		String password = sc.nextLine();
		
		Staff loggedInUser = new Staff();
		boolean loggedIn=false;
		for(Staff stMember:staff) {
			if((userName.equals(stMember.getUserName())) && (password.equals(stMember.getPassword()))) {
				 loggedInUser = stMember;
				System.out.print("\tLogin successful...");
				loggedIn = true;
				break;
			}
			
		
		}
		
		if(!loggedIn) {
			System.out.print("\tCreditionals dont match...");
			main(args);
		}
		
		else {
			
			if(loggedInUser instanceof Owner) {
				Owner own = (Owner) loggedInUser;
				System.out.println("\tOwner logged in\n");
				
				while(true) {
					System.out.println("\t\t 1.Stock\t 2.Supply\t 3.Staff\t 4.Exit");
					System.out.print("\tEnter :");
					
					int input = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					if(input == 1)	
					{
						while(true) 
						{
							
							Stock.showStockInterface(items, itRepo,loggedInUser);
							
							break;
							
						}
					}
					
					if(input == 2)	
					{
						while(true) 
						{
							
							SupplyHandler.showSupplyInterface(supply,items,loggedInUser);
							break;
						}
					}
					
				if(input == 3)	
				{
					while(true) 
					{
						showStaffInterface(staff,own,stRepo);
						break;
					}
				}
					
				if(input == 4)System.exit(0);
				}
			
				
			
				
			}
			
			if(loggedInUser instanceof Manager) {
				System.out.println("\tManager logged in");
				Manager manager = (Manager) loggedInUser;
				
				while(true) {
					System.out.println("\t\t 1.Stock\t 2.Supply\t 3.Staff\t 4.Exit");
					System.out.print("\tEnter :");
					
					int input = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					if(input == 1)	
					{
						while(true) 
						{
							//showStaffInterface(staff,own,stRepo);	
							Stock.showStockInterface(items, itRepo,loggedInUser);
							
							break;
							
						}
					}
					
					if(input == 2)	
					{
						while(true) 
						{
							SupplyHandler.showSupplyInterface(supply,items,loggedInUser);
							break;
						}
					}
					
				if(input == 3)	
				{
					while(true) 
					{
						showStaffInterface(staff,manager,stRepo);
						break;
					}
				}
					
				if(input == 4)System.exit(0);
				}
			}
			
			
			//cashier
			if(loggedInUser instanceof Cashier) {
				System.out.println("\tCashier logged in");
				Cashier cashier = (Cashier) loggedInUser;
				
				while(true) {
					System.out.println("\t\t 1.Stock\t 2.Supply\t 3.Exit");
					System.out.print("\tEnter :");
					
					int input = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					if(input == 1)	
					{
						while(true) 
						{
							//showStaffInterface(staff,own,stRepo);	
							Stock.showStockInterface(items, itRepo,loggedInUser);
							
							break;
							
						}
					}
					
					if(input == 2)	
					{
						while(true) 
						{
							SupplyHandler.showSupplyInterface(supply,items,loggedInUser);	
							break;
						}
					}
					
				if(input == 3)System.exit(0);
				}
			}
			
			
			//floorWorker
			if(loggedInUser instanceof FloorWorker) {
				System.out.println("\tFloor worker logged in");
				FloorWorker floorWorker = (FloorWorker) loggedInUser;
				
				
				while(true) {
					System.out.println("\t\t 1.Supply\t 2.Exit");
					System.out.print("\tEnter :");
					
					int input = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					if(input == 1)	
					{
						while(true) 
						{
							//showStaffInterface(staff,own,stRepo);	
							SupplyHandler.showSupplyInterface(supply,items,loggedInUser);
							
							break;
							
						}
					}
					
					if(input == 2)System.exit(0);
				
				}
			}
			
		}
		
	
		
	}
	
	
	
	public static void showStaffInterface(ArrayList<Staff> staff,Staff stf,StaffRepository stRepo) {
		
		Scanner sc = new Scanner(System.in);
		
		if(stf instanceof Owner)
		{System.out.println("\t1.Show Member list\n\t2.Add staff member\n\t3.Remove Staff member\n\t4.Back");}
		if(stf instanceof Manager)
		{System.out.println("\t1.Show Member list\n\t4.Back");}
		
		
		int input ;
		
		do {
			System.out.print("\tEnter:");
			input = sc.nextInt();
			if(input<1 || input >4) {
				System.out.println("\tInvalid input...Enter again.");
			
			}
		}
		while(input<1 || input >4);
		
		if(input == 1) {showMemberList(staff);
		showStaffInterface(staff, stf, stRepo);
		}
		if(input == 2) {stf.addStaffMember(staff,sc,stRepo);
		showStaffInterface(staff, stf, stRepo);
		}
		if(input == 3) {stf.removeStaffMember(staff,sc);
		showStaffInterface(staff, stf, stRepo);
		}
		if(input == 4)return;
		
		
		
		
		
	}

	
	public static void showMemberList(ArrayList<Staff> staff) {
		for(Staff staffMem:staff) {
			staffMem.printStaffMember();
			System.out.println("\n");
			
		}
		
		
		
	}
	
	public static void showItemList(ArrayList<Item> items) {
		for(Item item:items) {
			item.printItem();
			System.out.println("\n");
	}
	
	}
	
}
