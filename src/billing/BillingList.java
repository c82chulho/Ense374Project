package billing;

import java.util.ArrayList;
import record.Record;

public class BillingList extends Billing{

	private ArrayList<Billing> listBilling = new ArrayList<Billing>();
	
	
	public Billing searchBilling(Record newRecord){
		Billing temp;
		
		int reserveID = newRecord.getReserveID();
		int counter = 0;
		while(counter <= listBilling.size()){
			temp = listBilling.get(counter);
			if(temp.getReserveID() == reserveID)
				return temp;
			counter++;
		}
		return null;
		
	}
	
	public Billing searchBilling(int reserveID){
		Billing temp;
		int counter = 0;
		while(counter != listBilling.size()){
			temp = listBilling.get(counter);
			if(temp.getReserveID() == reserveID)
				return temp;
			counter++;
		}
		return null;
		
	}
	
	
	public boolean addBilling(Billing newBilling){
		listBilling.add(newBilling);
		return true;
	}
	
	
	public boolean removeBilling(int recordID){
		Billing temp = searchBilling(recordID);
		if(temp == null)
			return false;
		
		listBilling.remove(temp);
		return true;
	}
	
	
	public boolean updateBilling(Billing newBilling){
		int reserveID = newBilling.getReserveID();
		Billing oldBilling = searchBilling(reserveID);
		if(oldBilling == null)
			return false;
		listBilling.remove(oldBilling);
		listBilling.add(newBilling);
		return true;
		
	}
	
	
	public float rentPayment(Record newRecord){
		
		Billing temp = searchBilling(newRecord);
		if(temp == null)
			return -1;
		
		float pay = temp.getDeposit() - temp.getRentCost();
		temp.setPayStatus("Done - non-member");
		updateBilling(temp);
		
		return pay;		
	}
	
	
	public float memberPayment(Record newRecord){
		
		Billing temp = searchBilling(newRecord);
		if(temp == null)
			return -1;

		float pay = temp.getDeposit() - temp.getMemberCost();
		temp.setPayStatus("Done - member");
		updateBilling(temp);
		
		return pay;		
	}
	
	
	public Billing makeDeposit(Record newRecord){
		
		
		Billing temp = searchBilling(newRecord);
		if(temp == null){
			temp = new Billing();
			temp.setRecordID(0);
			// comment out until record class is done
			// setRecordID(newRecord.getReocrdID());
			temp.setRentCost(5);
			temp.setMemberCost(2);
			temp.setDeposit(10);
			temp.setPayStatus("Cost Calcuated");
			listBilling.add(temp);
		}
		else{
			temp.setRecordID(0);
			// comment out until record class is done
			// setRecordID(newRecord.getReocrdID());
			temp.setRentCost(5);
			temp.setMemberCost(2);
			temp.setDeposit(10);
			temp.setPayStatus("Cost Calcuated");
			updateBilling(temp);
			
		}
		return temp;
		
	}
	
	public float payDeposit(Record newRecord){
		
		Billing temp = searchBilling(newRecord);
		if(temp == null)
			return -1;
		
		temp.setPayStatus("Deposit paid");
		updateBilling(temp);
		
		return temp.getDeposit();
		
	}	
	
}
