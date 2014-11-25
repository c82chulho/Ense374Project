package bike;

public class Bike {
	
	protected int bikeID;
	protected int dimensions;
	protected String colour;
	protected String model;
	protected String maker;
	protected int year;
	protected int station;
	
	
	public Bike(){
		bikeID = 0;
		dimensions = 0;
		colour = "N/A";
		model = "N/A";
		maker = "N/A";
		year = 2014;
		station = 0;
	}
	
	public int getBikeID() {
		return bikeID;
	}
	public void setBikeID(int bikeID) {
		this.bikeID = bikeID;
	}
	public int getDimensions() {
		return dimensions;
	}
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}
	

}
