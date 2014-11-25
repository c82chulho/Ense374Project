package bike;

import junit.framework.TestCase;

public class BikeTest extends TestCase {
	

	Bike b1 = new Bike();
	Bike b2;
	BikeList BList = new BikeList();
	
	
	public void testBikeList() {

		b1.setBikeID(1);
		b1.setColour("Red");
		b1.setDimensions(1);
		b1.setMaker("N/A");
		b1.setModel("N/A");
		b1.setYear(2014);	
		
		BList.addBike(b1);
		
		b2 = BList.searchBike(1);
		b2.setColour("Blue");
		
		BList.updateBike(b2);
		
		BList.removeBike(1);
		
		}




}
