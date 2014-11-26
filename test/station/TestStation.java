package station;

import junit.framework.TestCase;

public class TestStation extends TestCase {
	
	Station s1 = new Station();
	Station s2;
	StationList SList = new StationList();
	
	public void testUserList(){
		
		s1.setStationID(1);
		s1.setLocation(1);
		
		SList.addStation(s1);
		s2 = SList.searchStation(1);
		
		SList.removeStation(1);
	}

}
