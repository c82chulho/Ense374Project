package station;

import record.RecordList;
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
}
