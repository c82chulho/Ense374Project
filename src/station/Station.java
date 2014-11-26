package station;

import record.Record;
import record.RecordList;
import bike.Bike;
import bike.BikeList;

public class Station {
public BikeList listOfBikes;
public RecordList listOfRecords;
public int stationID;
public int location;
public Station()
{
	listOfBikes= new BikeList();
	listOfRecords= new RecordList();
	stationID=0;
	location=0;
}
public int getStationID()
{
	return stationID;
}
public void setStationID(int newID)
{
	stationID=newID;
}
public int getLocation()
{
	return location;
}
public void setLocation(int newLocation)
{
	location= newLocation;
}
public BikeList getListOfBikes()
{
	return listOfBikes;
}
public RecordList getListOfRecords()
{
	return listOfRecords;
}
public void setBikeList(BikeList newList)
{
	listOfBikes=newList;
}
public void setRecordList(RecordList newList)
{
	listOfRecords=newList;
}
public boolean printAvailable()
{
	boolean print=false;
	for(int i=0;i<listOfBikes.getBikeList().size();i++)
	{
		Bike test=listOfBikes.getBikeList().get(i);
		boolean check=true;
		for(int j=0;j<listOfRecords.getRecordList().size();j++)
		{
			Record recordCheck= listOfRecords.getRecordList().get(j);
			if(recordCheck.getIDofBike()==test.getBikeID() && recordCheck.getStatus()!="Available")
			{
				check=false;
			}
		}
		if(check)
		{
			test.printBike();
			print=true;
		}
		
	}
	return print;
}
}
