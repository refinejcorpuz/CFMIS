package CFMIS_Inventory;

import org.testng.annotations.Test;

public class CreatePR extends CreatePRbaseTest {

	@Test(priority = 1)
	public void LoginRequestor() throws Exception {
		browserUsed();
		CredentialsLogin();
		ClickLogin();
	}

	@Test(priority = 2)
	public void ClickSubModuleUser() throws Exception {
		ClickPR();
		ClickRequestor();
	}

	@Test(priority = 3)
	public void EquipmentPR() throws Exception {
		CreatePRBtn();
		Purpose();
		AddItem();
		EquipmentinListofItem1();
		EquipmentinListofItem2();
		EquipmentUnit1();
		EquipmentUnit2();
		RequestSelectedItemBtn();
		CostFields1();
		CostFields2();
		SubmitRIS();
		SubmitForApproval();
		Xbutton();

		
		
	}

	@Test(priority = 4)
	public void SupplyPR() throws Exception {
		CreatePRBtn();
		Purpose();
		AddItem();
		SupplyinListofItem1();
		SupplyinListofItem2();
		SupplyUnit1();
		SupplyUnit2();
		RequestSelectedItemBtn();
		CostFields1();
		CostFields2();
		SubmitRIS();
		SubmitForApproval();
		Xbutton();
		
		
		
	}

}
