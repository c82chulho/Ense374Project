package station;

import java.util.Vector;

import bike.Bike;
import record.Record;



public class StationList {
public int numberOfStations;
public Vector<Station> listOfStations= new Vector<Station>();
public StationList()
{
	numberOfStations=0;
	listOfStations= new Vector<Station>();
}
public int getNumberOfStations()
{
	return numberOfStations;
}
public void setNumberOfStations(int newNumb)
{
	numberOfStations=newNumb;
}
public Vector<Station> getListOfStations()
{
	return listOfStations;
}
public void addStation(Station newStation)
{
	listOfStations.addElement(newStation);
	numberOfStations++;
}
public void removeStation(int stationID)
{
	if(!listOfStations.isEmpty())
	{
		Station test=new Station();
		for(int i=0;i<listOfStations.size();i++)
		{
			test=listOfStations.get(i);
			if(test.getStationID()==stationID)
			{
				listOfStations.remove(i);
				System.out.println("The station was removed");
				numberOfStations--;
				return;
			}
		}
		System.out.println("Record not found");
}
	System.out.println("List is empty");
}
public Station searchStation(int stationID)
{
	Station test=new Station();
	if(!listOfStations.isEmpty())
	{
		for(int i=0;i<listOfStations.size();i++)
		{
			test=listOfStations.get(i);
			if(test.getStationID()==stationID)
			{
		
				System.out.println("The station was found");
				
				return test;
			}
		}
		System.out.println("Station not found");
}
	System.out.println("List is empty");
	return test;
}
public Vector<Station> searchByLocation(int location)
{
	Vector<Station> test=new Vector<Station>();
	if(!listOfStations.isEmpty())
	{
		for(int i=0;i<listOfStations.size();i++)
		{
			
			if(listOfStations.get(i).getLocation()==location||test.get(i).getLocation()==location||test.get(i).getLocation()==location-1)
			{
				test.addElement(listOfStations.get(i));
			}
		}
		
}
	
	return test;
}
public void printList()
{
	for (int i=0;i<listOfStations.size();i++)
	{
		System.out.println("\nStation ID: "+listOfStations.get(i).getStationID());
		System.out.println("Station location: "+listOfStations.get(i).getLocation());
	}
}
public Bike searchForBike(int bikeID)
{
	Bike temp1= new Bike();
		for(int i=0;i<listOfStations.size();i++)
		{
			Bike test= new Bike();
		    test=listOfStations.get(i).getListOfBikes().searchBike(bikeID);
			if (test.getBikeID()==bikeID)
			{
				temp1=test;
			}
		}
		return temp1;
}

	


public Record searchReserve(int reserveID)
{
	Record search = new Record();
	for(int i=0;i<listOfStations.size();i++)
	{
		if (listOfStations.get(i).getListOfRecords().searchRecord(reserveID).getReserveID()==reserveID)
		{
			search=listOfStations.get(i).getListOfRecords().searchRecord(reserveID);
		}

	}
	return search;
}
}

