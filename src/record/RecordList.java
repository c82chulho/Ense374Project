
package record;
import java.util.*;
public class RecordList {
private int numberOfRentals;
private int numberActive;
private int numberCompleted;
private Vector<Record> recordList;

public int getNumberOfRentals()
{
	return numberOfRentals;
}
public void setNumberOfRentals(int newNumb)
{
	numberOfRentals=newNumb;
}
public int getNumberActive()
{
	return numberActive;
}
public void setNumberActive(int newNumb)
{
	numberActive=newNumb;
}
public int getNumberComplete()
{
	return numberCompleted;
}
public void setNumberComplete(int newNumb)
{
	numberCompleted=newNumb;
}
public Vector<Record> getRecordList()
{
	return recordList;
}
public RecordList()
{
numberOfRentals=0;
numberActive=0;
numberCompleted=0;
recordList=new Vector<Record>();

}
// function will need to be changed
public void addRecord(Record newRecord)
{
recordList.addElement(newRecord);
}

public void removeRecord(int reserveID)
{
	if(!recordList.isEmpty())
	{
		Record test=new Record();
		for(int i=0;i<recordList.size();i++)
		{
			test=recordList.get(i);
			if(test.getReserveID()==reserveID)
			{
				recordList.remove(i);
				System.out.println("The record was removed");
				numberOfRentals--;
				if(test.getStatus()=="Active")
				{
					numberActive--;
				}
				else if(test.getStatus()=="Completed")
				{
					numberCompleted--;
				}
				return;
			}
		}
	System.out.println("The record is not in the list");
	}
	else
	{
		System.out.println("List is empty");
	}
}
public void completeRecord(int recordID)
{
	if(!recordList.isEmpty())
	{
		Record test=new Record();
		for(int i=0;i<recordList.size();i++)
		{
			test=recordList.get(i);
			if(test.getReserveID()==recordID)
			{
				test.setStatus("Completed");
				System.out.println("record Archived");
				return;
			}
		}
	}
	else
	{
		System.out.println("list is empty");
	}
}
public Record search(int recordID)
{
	Record test=new Record();
	if(!recordList.isEmpty())
	{
		
		for(int i=0;i<recordList.size();i++)
		{
			test=recordList.get(i);
			if(test.getReserveID()==recordID)
			{
				return test;
			}
			
		}
		
	}
	test=new Record();
	return test;
	
}
public boolean searchBike(int BikeID)
{
	Record test=new Record();
	if(!recordList.isEmpty())
	{
		
		for(int i=0;i<recordList.size();i++)
		{
			test=recordList.get(i);
			if(test.getIDofBike()==BikeID)
			{
				return true;
			}
			
		}
		
	}
	test=new Record();
	return false;
	
}

}
