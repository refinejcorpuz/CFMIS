package CFMIS_claims;

import org.testng.annotations.Test;

public class CreateLiquidationReport extends CreateLiquidationReportBaseTest{
	
	@Test (priority =1)
	public void LoginCA() throws Exception {

		browserUsed();
		CredentialsLogin();
		ClickLogin();
		ClickLiquidation();
		ClickClaimant();
	}
	
	@Test (priority =2)
	public void CreateLiquidation () throws Exception {
		FilterByForLiquidation();
		LiquidateBtn();
		UploadRequiredDoc();
		NextBtn();
		ClickPlusIcon();
		SubPartandAmount();
		Uploadsubdocs1();
		Uploadsubdocs2();
		submit();
		Thread.sleep(1500);
		
		
		
	}

}
