package record;

public class Record {
private int IDofRenter;
private int IDofBike;
private int timeOfRental;
private int timeOfReturn;
private int stationID;
private String status;
private int reserveID;
public int getIDofRenter()
{
	return IDofRenter;
}
public void setIDofRenter(int rentID)
{
	IDofRenter=rentID;
}
public int getIDofBike()
{
	return IDofBike;
}
public void setIDofBike(int bikeID)
{
	IDofBike=bikeID;
}
public int getTimeofRental()
{
	return timeOfRental;
}
public void setTimeofRental(int rentTime)
{
	timeOfRental=rentTime;
}
public int getTimeOfReturn()
{
	return timeOfReturn;
}
public void setTimeofReturn(int returnTime)
{
	timeOfReturn=returnTime;
}
public int getStationID()
{
	return stationID;
}
public void setStationID(int ID)
{
	stationID=ID;
}
public String getStatus()
{
	return status;
}
public void setStatus(String aStatus)
{
	status=aStatus;
}
public int getReserveID()
{
	return reserveID;
}
public void setReserveID(int ID)
{
	reserveID=ID;
}
public Record()
{
	IDofRenter=-1;
	IDofBike=-1;
	timeOfRental=-1;
	timeOfReturn=-1;
	stationID=-1;
	status="";
	reserveID=-1;
}
public Record(int rentID,int bikeID, int rentTime, int returnTime, int station,String aStatus,int aReserveID)
{
	IDofRenter=rentID;
	IDofBike=bikeID;
	timeOfRental=rentTime;
	timeOfReturn=returnTime;
	stationID=station;
	status="aStatus";
	reserveID=aReserveID;
}
}
