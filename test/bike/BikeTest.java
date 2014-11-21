package bike;

import junit.framework.TestCase;

public class BikeTest extends TestCase {
	
	BikeList BList = new BikeList();

	protected void setUp() throws Exception {
		super.setUp();
	}
/*
	protected int bikeID;
	protected int dimensions;
	protected String colour;
	protected String model;
	protected String maker;
	protected int year;
*/
	public void testAddBike() {
		Bike b1 = new Bike();
		b1.setBikeID(1);
		b1.setColour("Red");
		b1.setDimensions(1);
		b1.setMaker("N/A");
		b1.setModel("N/A");
		b1.setYear(2014);
		
		BList.addBike(b1);
		
		}

	public void testSearchBike() {
		fail("Not yet implemented");
	}	
	
	
	public void testRemoveBike() {
		fail("Not yet implemented");
	}

	public void testUpdateBike() {
		fail("Not yet implemented");
	}

}
