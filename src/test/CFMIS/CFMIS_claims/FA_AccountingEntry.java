package CFMIS_claims;

import org.testng.annotations.Test;

public class FA_AccountingEntry extends FA_AccountEntryBaseTest {

	@Test (priority =1)
	public void LoginCA() throws Exception {

		browserUsed();
		CredentialsLogin();
		ClickLogin();
	}

	@Test (priority = 2)
	public void SetUpAccountingEntry () throws Exception{
			ClickReq();
			ClickFA();
			
			ClickForEval();
			
			TagASComplete();
			SetUpAccountingEntrybtn();
			scroll();
			plusICon();
			
			Accts();
			InputFields();
			SetupSubs();
			Thread.sleep(2000);
		}
	
	@Test (priority = 3)
	public void SetUpAccountingEntry1 () throws Exception{
			ClickReq();
			ClickFA();
			
			Thread.sleep(2000);
			
			ClickForEval();
			
			TagASComplete();
			SetUpAccountingEntrybtn();
			scroll();
			plusICon();
			
			Accts();
			InputFields();
			SetupSubs();
		}
	
	@Test (priority = 4)
	public void SetUpAccountingEntry2 () throws Exception{
			ClickReq();
			ClickFA();
			
			Thread.sleep(2000);
			
			ClickForEval();
			
			TagASComplete();
			SetUpAccountingEntrybtn();
			scroll();
			plusICon();
			
			Accts();
			InputFields();
			SetupSubs();
		}
	}

