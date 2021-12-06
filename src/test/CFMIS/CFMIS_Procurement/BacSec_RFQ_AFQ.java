package CFMIS_Procurement;

import org.testng.annotations.Test;

public class BacSec_RFQ_AFQ extends BACSec_RFQ_AFQ_BaseTest{

	
	@Test(priority = 1)
	public void LoginBACSecretariat() throws Exception {
		browserUsed();
		CredentialsLogin();
		ClickLogin();
		
		ClickRFQ();
		ClickBac();
	}
	
	@Test(priority = 2)
	public void SubmitRFQ() throws Exception{
		FilterByDraft();
		
		ViewRFQ();
		AddBidder1();
		AddBidder2();
		AddBidder3();
		Save();
		CreateAFQ();
		
	}
	
	@Test(priority = 3)
	public void SubmitAFQ() throws Exception{
		
		ViewAFQ();
		Passed();
		OpeningDate();
		CreateBidEval();
		
	
	}
}
