package demo;

import java.util.Scanner;
import java.util.Vector;
import java.io.* ;

import bike.*;
import billing.*;
import record.*;
import station.*;
import user.*;



public class Demo {


	
	public static void main(String[] args){
	int baseID=0;
	int thisStationID=50;
		BikeList BList = new BikeList();
		BillingList BiList = new BillingList();
		RecordList RList = new RecordList();
		StationList SList = new StationList();
		UserList UList = new UserList();
		
		
		Bike b= new Bike();
		Bike b2= new Bike();
		Bike b3= new Bike();
		b.setBikeID(123);
		b2.setBikeID(456);
		b3.setBikeID(789);
		b.setColour("Blue");
		b2.setColour("Yellow");
		b3.setColour("Red");
		b.setDimensions(1);
		b2.setDimensions(2);
		b3.setDimensions(3);
		b.setMaker("maker1");
		b2.setMaker("maker2");
		b3.setMaker("maker3");
		b.setModel("model1");
		b2.setModel("model2");
		b3.setModel("model3");
		b.setStation(1);
		b2.setStation(1);
		b3.setStation(1);
		b.setYear(2014);
		b2.setYear(2014);
		b3.setYear(2014);
		BList.addBike(b);
		BList.addBike(b2);
		BList.addBike(b3);
		
		Billing bi= new Billing();
		Record r= new Record();
		Station s= new Station();
		Station s2= new Station();
		
		s.setStationID(50);
		s.setBikeList(BList);
		s.setRecordList(RList);
		s2.setStationID(24);
		SList.addStation(s);
		SList.addStation(s2);
		User u1 = new User();
		u1.setName("Bob");
		u1.setAddress("123 fake Street");
		u1.setID(1);
		u1.setMembership(true);
		u1.setMembershipExpiration("end of time");
		//UList.addUser(u1);
		
		
		
		
		
		
		
		
		Scanner in = new Scanner(System.in);
		int menuInput =0;
		
		while(menuInput != 6){
			//System.out.println("1. setup");
			System.out.println("2. reserve bike");
			System.out.println("3. pick up bike");
			System.out.println("4. return bike");
			System.out.println("5. update reservation");
			System.out.println("6. exit");
			menuInput = in.nextInt();
			
			
			//if(menuInput == 1){
				//int userMenu =0;
				/*
				while(userMenu != 5){
					System.out.flush();
					System.out.println("1. add user");
					System.out.println("2. get user");
					System.out.println("3. update user");
					System.out.println("4. remove user");
					System.out.println("5. exit");
					userMenu = in.nextInt();
					if(userMenu==1)
					{
						u= new User();
						UList.addUser(u);
						System.out.println("what is your name?");
						String newName= in.toString();
						u.setName(newName);
						System.out.println("What is your address");
						String newAddress= in.toString();
						u.setAddress(newAddress);
						System.out.println("What is your user ID");
						int newID= in.nextInt();
						u.setID(newID);
						
					}
				}
				*/
				
			//}
			if(menuInput == 2){
				System.out.println("2. reserve bike");
				SList.printList();
				System.out.println("select a station");
				int stationID= in.nextInt();
				Station yourStation= SList.searchStation(stationID);
				if(yourStation.printAvailable())
				{
				System.out.println("enter the bike ID you want");
				int bikeChoice= in.nextInt();
				r= new Record(u1.getID(),bikeChoice,4,5,yourStation.getStationID(),"Reserved",baseID);
				System.out.print("Your reserve ID number is:   ");
				System.out.println(baseID);
				baseID++;
				yourStation.getListOfRecords().addRecord(r);
				}
				else{
					System.out.println("No available bikes");
				}
			}
			if(menuInput == 3){
				System.out.println("3. pick up bike");
				System.out.println("What is your reserve ID");
				int reserveID= in.nextInt();
				
				SList.searchStation(thisStationID).getListOfRecords().searchRecord(reserveID).setStatus("picked-up");
			}
			if(menuInput == 4){
				System.out.println("4. return bike");
				System.out.println("Please enter your reserveID");
				
				int returnID= in.nextInt();
				SList.searchReserve(returnID).setStatus("Available");
				System.out.println(SList.searchStation(thisStationID).getListOfRecords().searchRecord(returnID).getStatus());
				int bikeNumber = SList.searchStation(thisStationID).getListOfRecords().searchRecord(returnID).getIDofBike();
				Bike returnedBike=SList.searchForBike(bikeNumber);
				returnedBike.setStation(thisStationID);
				int oldStationID=SList.searchReserve(returnID).getStationID();
				SList.searchStation(oldStationID).getListOfBikes().removeBike(bikeNumber);
				SList.searchStation(thisStationID).getListOfBikes().addBike(returnedBike);
				
			if(menuInput == 5){
				System.out.println("5. update reservation");
			}
			
		
		}
		

		
		
		
		
		
	}
	
}
}