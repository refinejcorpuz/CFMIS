package CFMIS_claims;

import org.testng.annotations.Test;

public class CreateClaims extends CreateClaimsBaseTest {

	@Test(priority = 1)
	public void LoginClaimant() throws Exception {
		browserUsed();
		CredentialsLogin();
		ClickLogin();
		ClickRequestForPayment(); 
		ClickClaimant();
	}

	@Test (priority = 3)
	public void CreateAP() throws Exception { 

		ClickCreateRequestBtn();
		SelectTransactionTypeAP();
		SelectClaimTypeAP();
		SelectSubClaimTypeAP();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();
		
		//DV Form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();
		
		//BURS Form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeAP();
		SelectClaimTypeAP();
		SelectSubClaimTypeAP();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();
		
		//DV Form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();
		
		//BURS Form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeAP();
		SelectClaimTypeAP();
		SelectSubClaimTypeAP();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();
		
		//DV Form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();
		
		//BURS Form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeAP();
		SelectClaimTypeAP();
		SelectSubClaimTypeAP();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();
		
		//DV Form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();
		
		//BURS Form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeAP();
		SelectClaimTypeAP();
		SelectSubClaimTypeAP();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();
		
		//DV Form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();
		
		//BURS Form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void CreateCA() throws Exception {
		ClickCreateRequestBtn();
		SelectTransactionTypeCA();
		SelectClaimTypeCA();
		SelectSubClaimTypeCA();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();

		// DV form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();

		// BURS form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeCA();
		SelectClaimTypeCA();
		SelectSubClaimTypeCA();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();

		// DV form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();

		// BURS form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeCA();
		SelectClaimTypeCA();
		SelectSubClaimTypeCA();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();

		// DV form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();

		// BURS form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeCA();
		SelectClaimTypeCA();
		SelectSubClaimTypeCA();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();

		// DV form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();

		// BURS form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		//*****************************************
		
		ClickCreateRequestBtn();
		SelectTransactionTypeCA();
		SelectClaimTypeCA();
		SelectSubClaimTypeCA();
		// SelectRequirementCategory();
		UploadFile();
		ProceedToDV();

		// DV form
		ReqOffice();
		DeptOffice();
		MOP();
		FUND();
		TaxType();
		TaxITEM();
		TINpayeeAddress();
		AddParticular();
		ProgramProject();
		ResponsibilityCenter();
		PREB();
		ParticularAmount();
		NextBtn();

		// BURS form
		BURSaddParticular();
		BURSResponsibilityCenter();
		MFO();
		UACSobject();
		BURSParticularAmount();
		SubmitForApprovalBtn();
		DoneBtn();
		Thread.sleep(2000);
		
	}

}
