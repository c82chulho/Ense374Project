package bike;

import junit.framework.TestCase;

public class BikeTest extends TestCase {
	

	Bike b1 = new Bike();
	Bike b2;
	BikeList BList = new BikeList();
	
	
	public void testBikeListInsert() {

		b1.setBikeID(1);
		b1.setColour("Red");
		b1.setDimensions(1);
		b1.setMaker("N/A");
		b1.setModel("N/A");
		b1.setYear(2014);	
		b1.setStation(1);
		
		BList.addBike(b1);
		
		
	}

	public void testBikeListSearch() {

		b2 = BList.searchBike(1);
	}

	public void testBikeListRemove() {
		b2 = BList.searchBike(1);
		BList.removeBike(b2.getBikeID());
	}



}
