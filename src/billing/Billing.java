package billing;

public class Billing {
	
	private int reserveID;
	private float rentCost;
	private float memberCost;
	private float deposit;
	private String payStatus;
	
	
	public Billing(){
		reserveID = 0;
		rentCost = 0;
		memberCost = 0;
		deposit = 0;
		payStatus ="N/A";
	}
	
	
	public int getReserveID() {
		return reserveID;
	}
	public void setRecordID(int reserveID) {
		this.reserveID = reserveID;
	}	
	public float getRentCost() {
		return rentCost;
	}
	public void setRentCost(float rentCost) {
		this.rentCost = rentCost;
	}
	public float getMemberCost() {
		return memberCost;
	}
	public void setMemberCost(float memberCost) {
		this.memberCost = memberCost;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
		public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	

	
}
