package CFMIS_Inventory;

import org.testng.annotations.Test;

import PageObject.PageObject;

public class ItemCategory extends ItemCategoryBaseTest {
	PageObject obj;

	@Test(priority = 1)
	public void LoginMISadmin() throws Exception {
		browserUsed();
		MISAdminCredentialsLogin();
		ClickLogin();
		ClickInventorySetUp();
	}

	@Test(priority =2)
	public void ItemCategories() throws Exception {
		ClickItemCategories();
		ClickAddItemCategory();
		ItemCategNameCode();
		SelectCategory();
	}

}
