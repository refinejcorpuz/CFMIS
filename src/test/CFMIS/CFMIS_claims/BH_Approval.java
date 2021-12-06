package CFMIS_claims;

import org.testng.annotations.Test;

public class BH_Approval extends BH_ApprovalBaseTest {
	
	
	@Test (priority = 1)
	public void LoginBH () throws Exception{
		browserUsed();
		CredentialsLogin();
		ClickLogin();
		ClickRequestForPayment(); 
	}
		
	@Test (priority = 2)
	public void BHApprove () throws Exception{
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2000);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2000);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2000);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2000);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2000);
	}
}
