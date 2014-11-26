package billing;

import junit.framework.TestCase;

public class BillingTest extends TestCase {

	
	Billing b1 = new Billing();
	Billing b2;
	BillingList BList = new BillingList();
	
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	
	public void testBikeList() {
		
		b1.setRecordID(1);
		b1.setRentCost(3);
		b1.setMemberCost(2);
		b1.setDeposit(10);
		b1.setPayStatus("test");
		
		BList.addBilling(b1);
		
		b2= BList.searchBilling(1);
		b2.setPayStatus("test22");
		
		BList.updateBilling(b2);
		
		BList.removeBilling(1);
		
		}
}
