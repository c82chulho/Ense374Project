package billing;

public class Billing {
	
	private int recordID;
	private float rentCost;
	private float memberCost;
	private float deposit;
	private String payStatus;
	
	public int getRecordID() {
		return recordID;
	}
	public void setRecordID(int recordID) {
		this.recordID = recordID;
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
