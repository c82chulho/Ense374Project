package record;

import junit.framework.TestCase;

public class TestRecord extends TestCase {

	public void testRecordList(){
		Record r1 = new Record();
		Record r2;
		RecordList RList = new RecordList();
		
		r1.setReserveID(1);
		r1.setIDofBike(1); // Bike ID
		r1.setIDofRenter(1); // user ID
		r1.setStationID(1);
		r1.setStatus("test");
		r1.setTimeofRental(1212);
		r1.setTimeofReturn(1213);
		
		RList.addRecord(r1);
		
		r2 = RList.searchRecord(1);
		
		RList.removeRecord(1);
		
	}
}
