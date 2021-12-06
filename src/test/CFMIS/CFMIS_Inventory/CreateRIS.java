package CFMIS_Inventory;

import org.testng.annotations.Test;

public class CreateRIS extends CreateRISbaseTest {

	@Test(priority = 1)
	public void LoginRequestor() throws Exception {
		browserUsed();
		CredentialsLogin();
		ClickLogin();
	}

	@Test(priority = 3)
	public void CreateSupply() throws Exception {
		ClickRequisition();
		ClickRequestor();

		RequestItemButton();
		Purpose();
		AddItem();
		SupplyinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();

		RequestItemButton();
		Purpose();
		AddItem();
		SupplyinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();

		RequestItemButton();
		Purpose();
		AddItem();
		SupplyinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();

		RequestItemButton();
		Purpose();
		AddItem();
		SupplyinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();
	}

	// --------------------
	@Test(priority = 2)
	public void CreateEquipment() throws Exception {
		ClickRequisition();
		ClickRequestor();

		RequestItemButton();
		Purpose();
		AddItem();
		EquipmentinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();

		RequestItemButton();
		Purpose();
		AddItem();
		EquipmentinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();

		RequestItemButton();
		Purpose();
		AddItem();
		EquipmentinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();

		RequestItemButton();
		Purpose();
		AddItem();
		EquipmentinListofItem();
		RequestSelectedItemBtn();
		SubmitRIS();
	}

}
