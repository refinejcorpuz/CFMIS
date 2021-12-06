package CFMIS_claims;

import org.testng.annotations.Test;

public class CA_Approval extends CA_ApprovalBaseTest{

	@Test (priority = 1)
	public void LoginBH () throws Exception{
		browserUsed();
		CredentialsLogin();
		ClickLogin();
		ClickRequestForPayment(); 
		ClickCA();
	}
	
	@Test (priority = 2)
	public void CA_Approve () throws Exception{
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2500);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2500);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2500);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2500);
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2500);
		
		
		FilterByForApproval();
		ForApproval();
		Forward();
		Thread.sleep(2500);
		
	}
}
