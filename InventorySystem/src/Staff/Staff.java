package Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Staff {

		
		

		private int userID;
		private String userName;
		private String password;
		private String fullName;
		private String joinedDate;
		
		public Staff() {
			
//			this.userID = id;
//			id++;
		}
		
		public Staff( String userName, String password, String fullName, String joinedDate) {
			
			
			//this.userID = id;
			this.userName = userName;
			this.password = password;
			this.fullName = fullName;
			this.joinedDate = joinedDate;
			//id++;
		}

		public int getUserID() {
			return userID;
		}

		public void setUserID(int userID) {
			this.userID = userID;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getJoinedDate() {
			return joinedDate;
		}

		public void setJoinedDate(String joinedDate) {
			this.joinedDate = joinedDate;
		}
		
//		
		
		
		public void printStaffMember() {
			System.out.printf("Id : %d\n\t", this.userID);
			//System.out.printf("Name : %s\t", this.fullName);
			System.out.printf("user Name : %s\n\t", this.userName);
			System.out.printf("Full Name : %s\n\t", this.fullName);
			System.out.printf("Joined Date : %s\n\t", this.joinedDate);
			
		}
		
		public void addStaffMember(ArrayList<Staff> staff,Scanner sc,StaffRepository stRepo) {
			
		
			System.out.println("\n\t\tWhat type of staff member you want to add ?");
			System.out.println("\t\t1.Manager\t2.Cashier\t3.Floor worker");
			
			System.out.println("\n\t\tEnter number : ");
			int num = sc.nextInt();
			
			sc.nextLine();
			
			

			
			if(num == 1) {
				Manager manager =new Manager();
				manager.setUserID(staff.size());
				
				
				boolean isUnique;
				do {
					isUnique = true;
					for(Staff stf:staff) {
						if(stf.getUserID()== manager.getUserID()) {
								manager.setUserID(manager.getUserID()+1);
								isUnique = false;
							}
						}
				}while(!isUnique);
				
				System.out.print("\n\tEnter Name :");
				manager.setFullName(sc.nextLine());
				
				System.out.print("\tEnter user name :");
				manager.setUserName(sc.next());
				System.out.print("\tEnter Password :");
				manager.setPassword(sc.next());
				sc.nextLine();
				System.out.print("\tEnter date Joined (yy/mm/dd) :");
				manager.setJoinedDate(sc.nextLine());
				
				staff.add(manager);
				stRepo.saveStaff(staff);
				
				System.out.println("Manager added successfully....\n");
				
			}
			
			
			if(num == 2) {
				Cashier cashier = new Cashier();
				cashier.setUserID(staff.size());
				
				
				
				boolean isUnique;
				do {
					isUnique = true;
					for(Staff stf:staff) {
						if(stf.getUserID()== cashier.getUserID()) {
								cashier.setUserID(cashier.getUserID()+1);
								isUnique = false;
							}
						}
				}while(!isUnique);
				
				System.out.print("\n\tEnter Name :");
//				String name = sc.nextLine();
				cashier.setFullName(sc.nextLine());
				
				System.out.print("\tEnter user name :");
				cashier.setUserName(sc.next());
				System.out.print("\tEnter Password :");
				cashier.setPassword(sc.next());
				
				sc.nextLine();
				System.out.print("\tEnter date Joined (yy/mm/dd) :");
				cashier.setJoinedDate(sc.nextLine());
				
				staff.add(cashier);
				stRepo.saveStaff(staff);
				
				System.out.println("Cashier added successfully....\n");
				
			}
			
			
			if(num == 3) {
				FloorWorker floorWorker = new FloorWorker();
				floorWorker.setUserID(staff.size());
				
				
				boolean isUnique;
				do {
					isUnique = true;
					for(Staff stf:staff) {
						if(stf.getUserID()== floorWorker.getUserID()) {
								floorWorker.setUserID(floorWorker.getUserID()+1);
								isUnique = false;
							}
						}
				}while(!isUnique);
				
				System.out.print("\n\tEnter Name :"); 
//				String name = sc.nextLine();
				floorWorker.setFullName(sc.nextLine());
				
				System.out.print("\tEnter user name :");
				floorWorker.setUserName(sc.next());
				System.out.print("\tEnter Password :");
				floorWorker.setPassword(sc.next());
				sc.nextLine();
				System.out.print("\tEnter date Joined (yy/mm/dd) :");
				floorWorker.setJoinedDate(sc.nextLine());
				
				staff.add(floorWorker);
				stRepo.saveStaff(staff);
				
				System.out.println("Floor worker added successfully....\n");
				
			}
		
			
		}
		
		public void removeStaffMember(ArrayList<Staff> staff,Scanner sc) {
		
			System.out.print("\tEnter the ID of the member you want to delete :");
			int id = sc.nextInt();
			Iterator<Staff> itr = staff.iterator();
			
			while(itr.hasNext()) {
				Staff member = itr.next();
				if(member.getUserID() == id) {
					itr.remove();
					System.out.println("Member removed successfully....\n");
					break;
				}
			}
			
			
			
		}
		
		
}
