package demo;

import java.util.Scanner;
import java.io.* ;
import bike.*;
import billing.*;
import record.*;
import station.*;
import user.*;



public class Demo {


	
	public static void main(String[] args){
	
		BikeList BList = new BikeList();
		BillingList BiList = new BillingList();
		RecordList RList = new RecordList();
		StationList SList = new StationList();
		UserList UList = new UserList();
		
		
		Bike b;
		Billing bi;
		Record r;
		Station s;
		User u;
		
		Scanner in = new Scanner(System.in);
		int menuInput =0;
		
		while(menuInput != 6){
			System.out.println("1. setup");
			System.out.println("2. reserve bike");
			System.out.println("3. pick up bike");
			System.out.println("4. return bike");
			System.out.println("5. update reservation");
			System.out.println("6. exit");
			menuInput = in.nextInt();
			
			
			if(menuInput == 1){
				int userMenu =0;
				
				while(userMenu != 5){
					System.out.flush();
					System.out.println("1. add user");
					System.out.println("2. get user");
					System.out.println("3. update user");
					System.out.println("4. remove user");
					System.out.println("5. exit");
					userMenu = in.nextInt();
				}
				
			}
			if(menuInput == 2){
				System.out.println("2. reserve bike");
			}
			if(menuInput == 3){
				System.out.println("3. pick up bike");
			}
			if(menuInput == 4){
				System.out.println("4. return bike");
			}	
			if(menuInput == 5){
				System.out.println("5. update reservation");
			}
			
		
		}
		

		
		
		
		
		
	}
	
}
