package record;

import junit.framework.TestCase;

public class TestRecord extends TestCase {
	Record r1 = new Record();
	Record r2;
	RecordList RList = new RecordList();
	
	
	public void testRecordListInsert(){
		r1.setReserveID(1);
		r1.setIDofBike(1); // Bike ID
		r1.setIDofRenter(1); // user ID
		r1.setStationID(1);
		r1.setStatus("test");
		r1.setTimeofRental(1212);
		r1.setTimeofReturn(1213);
		
		RList.addRecord(r1);
	}
	
	public void testRecordListSearch(){
		r2 = RList.searchRecord(1);
	}	

	public void testRecordListRemove(){
		r2 = RList.searchRecord(1);
		RList.removeRecord(r2.getReserveID());
	}


}
