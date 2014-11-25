package bike;

import java.util.ArrayList;

public class BikeList extends Bike{


	private ArrayList<Bike> bikeList = new ArrayList<Bike>();
		
	public Bike searchBike(int BikeID){
		int counter =0;
		Bike temp;
		System.out.println(bikeList.size());
		while(counter <= bikeList.size()){
			temp =bikeList.get(counter);
			if(temp.getBikeID() == BikeID){
				return temp;
			}
			counter++;
		}
		return null;
		
	}
	
	public boolean addBike(Bike newBike){
		bikeList.add(newBike);
		return true;		
	}
	
	public boolean removeBike(int bikeID){
		
		Bike temp = searchBike(bikeID);
		if(temp == null)
			return false;
		
		bikeList.remove(temp);
		return true;	
	}
	
	public boolean updateBike(Bike newBike){
		int newBikeID = newBike.getBikeID();
		Bike oldBike = searchBike(newBikeID);
		if(oldBike == null)
			return false;
		bikeList.remove(oldBike);
		bikeList.add(newBike);
		return true;
	}
	
}
