package station;

import java.util.Vector;



public class StationList {
public int numberOfStations;
public Vector<Station> listOfStations;
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
		System.out.println("Record not found");
}
	System.out.println("List is empty");
	return test;
}
public Station searchByLocation(int location)
{
	Station test=new Station();
	if(!listOfStations.isEmpty())
	{
		for(int i=0;i<listOfStations.size();i++)
		{
			test=listOfStations.get(i);
			if(test.getLocation()==location)
			{
		
				System.out.println("The station was found");
				
				return test;
			}
		}
		System.out.println("Record not found");
}
	System.out.println("List is empty");
	return test;
}
public void printList()
{
	for (int i=0;i<numberOfStations;i++)
	{
		
		System.out.println(listOfStations.get(i).getStationID());
		System.out.println(listOfStations.get(i).getLocation());
	}
}
public void searchForBike(int bikeID)
{
		for(int i=0;i<listOfStations.size();i++)
		{
			if (listOfStations.get(i).getListOfRecords().searchBike(bikeID))
			{
				System.out.println(listOfStations.get(i).getStationID());
				System.out.println(listOfStations.get(i).getLocation());
			}
		}
	
}
}
