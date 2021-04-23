package CFMIS_Inventory;

import org.testng.annotations.Test;

public class ItemCategory extends ItemCategoryBaseTest{

	@Test (priority =1)
	public void LoginMISadmin () throws Exception{
		
		MISAdminCredentialsLogin();
		ClickLogin();
		ClickInventorySetUp();	
	}
	@Test (priority = 2)
	public void ItemCategories() throws Exception{
		ClickItemCategories();
		ClickAddItemCategory();
		ItemCategNameCode();
		SelectCategory();
	}
}
