package CFMIS_AP;

import org.testng.annotations.Test;

public class CreateAPrequest extends CreateAPrequestBaseTest {

	@Test(priority = 1)
	public void LoginClaimant() throws Exception {

		CredentialsLogin();
		ClickLogin();
		ClickRequestForPayment();

	}

	@Test(priority = 2)
	public void ClaimsSelection() throws Exception {

		ClickCreateRequestBtn();
		SelectClaimType();
		SelectSubClaimType();
		// SelectRequirementCategory();

		UploadFile();
		ProceedToDV();
	}

	@Test(priority = 3)
	public void DVFormPage() throws Exception {
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ResponsibilityCenter();
		ProgramProject();
		PREB();
		ParticularAmount();
		NextBtn();
	}

	@Test(priority = 4)
	public void BURSFormPage() throws Exception {
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
	}

	@Test(priority = 5)
	public void LogoutClaimant() throws Exception {
		ClaimantLogout();

	}

	public void ReqHeadLogin() throws Exception {
		ReqHeadCredentials();
		ClickLogin();
		ClickRequestForPayment();

	}

}
