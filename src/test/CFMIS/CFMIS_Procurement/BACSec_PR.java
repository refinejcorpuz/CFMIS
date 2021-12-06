package CFMIS_Procurement;

import org.testng.annotations.Test;

public class BACSec_PR extends BACSec_PR_BaseTest {

	@Test(priority = 1)
	public void LoginBACSecretariat() throws Exception {
		browserUsed();
		CredentialsLogin();
		ClickLogin();
		
		ClickPR();
		ClickBac();
	}
	
	@Test(priority = 2)
	public void SubmitPR() throws Exception{
		
		ViewItemstoPurchase();
		allcheckbox();
		Proceed();
		Yes();
		Done();
		
		ViewItemstoPurchase();
		allcheckbox();
		Proceed();
		Yes();
		Done();
		
		ViewItemstoPurchase();
		allcheckbox();
		Proceed();
		Yes();
		Done();
		
		ViewItemstoPurchase();
		allcheckbox();
		Proceed();
		Yes();
		Done();
		
		ViewItemstoPurchase();
		allcheckbox();
		Proceed();
		Yes();
		Done();
		
		ViewItemstoPurchase();
		allcheckbox();
		Proceed();
		Yes();
		Done();
		
		ViewItemstoPurchase();
		allcheckbox();
		Proceed();
		Yes();
		Done();
	}
}
