package CFMIS_Inventory;

import org.testng.annotations.Test;

public class CreateInspectionReport extends CreateInspectionReportBaseTest {

	@Test(priority = 1)
	public void LoginSupplyOfficer() throws Exception {
		browserUsed();
		CredentialsLogin();
		ClickLogin();
		ClickInspectionofDelivery();
		ClickSO();
	}
	
	@Test(priority = 2)
	public void InspectionReport() throws Exception{	
		FilterByForInspection();
		
		Selectallitems();
		CreatIRbtn();
		
}
	
}
