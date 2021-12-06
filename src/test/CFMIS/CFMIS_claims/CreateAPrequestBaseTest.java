package CFMIS_claims;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.allMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAPrequestBaseTest extends allMethods {
	
	public void browserUsed() throws Exception {

		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();  
		}
		else if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://cfmis.multidemos.com/login");
	}
	

	public void CredentialsLogin() throws InterruptedException {

		String[] t = new String[2];

		t[0] = "requesting_clerk@email.com";
		t[1] = "00000000";

		String usrnme = "//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]";
		String psswrd = "//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]";

		WebElement t1 = driver.findElement(By.xpath(usrnme));
		t1.sendKeys(t[0]);
		isPopulated(usrnme, "username");

		WebElement t2 = driver.findElement(By.xpath(psswrd));
		t2.sendKeys(t[1]);
		isPopulated(psswrd, "password");
	}
	
	public void ReqHeadCredentials() throws InterruptedException {

		String[] t = new String[2];

		t[0] = "account_officer@email.com";
		t[1] = "00000000";

		String usrnme = "//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]";
		String psswrd = "//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]";

		WebElement t1 = driver.findElement(By.xpath(usrnme));
		t1.sendKeys(t[0]);
		isPopulated(usrnme, "username");

		WebElement t2 = driver.findElement(By.xpath(psswrd));
		t2.sendKeys(t[1]);
		isPopulated(psswrd, "password");
	}


	public void ClickLogin() throws InterruptedException {

		String Btn = "//button[contains(text(),'Log In')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "login Button");
		Thread.sleep(1500);
		
	}

	public void ClickRequestForPayment() throws InterruptedException {
		String RFP = "//span[contains(text(),'Request for Payment')]";
		
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RFP)));
		
		WebElement Req = driver.findElement(By.xpath(RFP));
		Req.click();
		isClicked(RFP, "Request for Payment sub-module");
		Thread.sleep(3000);
	}

	public void ClickCreateRequestBtn() throws InterruptedException {

		String CreateBtn = "//a[contains(text(),'Create New Request')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CreateBtn)));

		WebElement cBtn = driver.findElement(By.xpath(CreateBtn));
		cBtn.click();
		isClicked(CreateBtn, "Create New Request Button");
		Thread.sleep(2000);
	}
	
	public void SelectTransactionTypeCA() throws InterruptedException {
		String Trans = "//div[contains(text(),'Select Transaction')]";
		String SelectTrans = "//*[contains(text(),'Cash Advance')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Trans)));

		WebElement Tran = driver.findElement(By.xpath(Trans));
		Tran.click();
		isClicked(Trans, "Select Transaction Type");
		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectTrans)));

		mouseOverClick(SelectTrans, "xpath");
		isSelected(SelectTrans, "Transaction Type");
	}

	public void SelectClaimTypeCA() throws InterruptedException {
		String claim = "//div[contains(text(),'Select Claims')]";
		String SelectClaim = "//*[contains(text(),'Cash Advance claim type')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(claim)));

		WebElement claims = driver.findElement(By.xpath(claim));
		claims.click();
		isClicked(claim, "Select Claim Type");
		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectClaim)));

		mouseOverClick(SelectClaim, "xpath");
		isSelected(SelectClaim, "Claim Type");
	}

	public void SelectSubClaimTypeCA() throws InterruptedException {
		String subclaim = "//div[contains(text(),'Select Sub Claims')]";
		String SelectSubClaim = "//div[contains(text(),'Cash Advance subclaim')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subclaim)));

		WebElement claims = driver.findElement(By.xpath(subclaim));
		claims.click();
		isClicked(subclaim, "Select Sub-claim Type");
		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectSubClaim)));

		mouseOverClick(SelectSubClaim, "xpath");
		isSelected(SelectSubClaim, "Sub-claim Type");
		Thread.sleep(2000);
	}
	
	public void SelectTransactionTypeAP() throws InterruptedException {
		String Trans = "//div[contains(text(),'Select Transaction')]";
		String SelectTrans = "//*[contains(text(),'Accounts Payable')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Trans)));

		WebElement Tran = driver.findElement(By.xpath(Trans));
		Tran.click();
		isClicked(Trans, "Select Transaction Type");
		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectTrans)));

		mouseOverClick(SelectTrans, "xpath");
		isSelected(SelectTrans, "Transaction Type");
	}

	public void SelectClaimTypeAP() throws InterruptedException {
		String claim = "//div[contains(text(),'Select Claims')]";
		String SelectClaim = "//*[contains(text(),'Accounts Payable claim type')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(claim)));

		WebElement claims = driver.findElement(By.xpath(claim));
		claims.click();
		isClicked(claim, "Select Claim Type");
		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectClaim)));

		mouseOverClick(SelectClaim, "xpath");
		isSelected(SelectClaim, "Claim Type");
	}

	public void SelectSubClaimTypeAP() throws InterruptedException {
		String subclaim = "//div[contains(text(),'Select Sub Claims')]";
		String SelectSubClaim = "//div[contains(text(),'Accounts Payable subclaim')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subclaim)));

		WebElement claims = driver.findElement(By.xpath(subclaim));
		claims.click();
		isClicked(subclaim, "Select Sub-claim Type");
		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectSubClaim)));

		mouseOverClick(SelectSubClaim, "xpath");
		isSelected(SelectSubClaim, "Sub-claim Type");
		Thread.sleep(2000);
	}

	/*
	 * public void SelectRequirementCategory () throws InterruptedException { String
	 * ReqCategory = "//div[contains(text(),'Select Individual/General')]"; String
	 * SelectReqCateg = "//*[contains(text(),'Individual')][2]";
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 180);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ReqCategory
	 * ))); Thread.sleep(1000);
	 * 
	 * WebElement claims = driver.findElement(By.xpath(ReqCategory));
	 * claims.click(); isClicked(ReqCategory, "Requirement Category");
	 * Thread.sleep(1000);
	 * 
	 * mouseOverClick(SelectReqCateg,"xpath"); isSelected(SelectReqCateg,
	 * "Requirement Category");
	 * 
	 * Thread.sleep(10000); }
	 */

	public void UploadFile() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Upload')]")));
		
		String Upload = "//span[contains(text(),'Upload')]";
		WebElement uploadbutton = driver.findElement(By.xpath(Upload));
		uploadbutton.click();
		isClicked(Upload, "Upload Button");
		Thread.sleep(2500);

		WebElement uploadDocument = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/div[2]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/img[1]"));
		uploadDocument.click();
		Thread.sleep(2500);

		StringSelection file = new StringSelection("C:\\Users\\Xurpas\\OneDrive\\Documents\\CFMIS\\TestData\\house.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		Thread.sleep(2500);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4500);
		
		String Confirm = "//button[contains(text(),'Confirm')]";	
		WebDriverWait wait1 = new WebDriverWait(driver, 360);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Confirm)));

		WebElement ConfirmBtn = driver.findElement(By.xpath(Confirm));
		ConfirmBtn.click();
		isClicked(Confirm, "Upload Confirm Button");
		Thread.sleep(2500);

	}

	public void ProceedToDV() throws Exception {
		String proceedbtn = "//button[contains(text(),'Proceed')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(proceedbtn)));

		WebElement claims = driver.findElement(By.xpath(proceedbtn));
		claims.click();
		isClicked(proceedbtn, "Proceed button");
		Thread.sleep(1500);

	}

	public void ReqOffice() throws Exception {
		// Requesting office - MAIN
		String ReqOffice = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";
		String SelectReqOffice = "//*[contains(text(),'MAIN')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ReqOffice)));

		WebElement RO = driver.findElement(By.xpath(ReqOffice));
		RO.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectReqOffice)));

		mouseOverClick(SelectReqOffice, "xpath");
		isSelected(SelectReqOffice, "Requesting Office");
		Thread.sleep(2000);
	}

	public void DeptOffice() throws Exception {
		// Department Office - Accounting Dept
		String DeptOffice = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]";
		String SelectDeptOffice = "//*[contains(text(),'Accounting Department')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(DeptOffice)));

		WebElement DO = driver.findElement(By.xpath(DeptOffice));
		DO.click();

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectDeptOffice)));

		mouseOverClick(SelectDeptOffice, "xpath");
		isSelected(SelectDeptOffice, "Department Office");
		Thread.sleep(2000);

	}

	public void MOP() throws Exception {
		// Mode of Payment
		String MOP = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]";
		String SelectMOP = "//*[contains(text(),'MDS Check')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MOP)));

		WebElement MOPay = driver.findElement(By.xpath(MOP));
		MOPay.click();

		mouseOverClick(SelectMOP, "xpath");
		isSelected(SelectMOP, "Mode of Payment");
		Thread.sleep(2000);
	}

	public void FUND() throws Exception {
		// FUND
		String Fund = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]";
		String Selectfund = "//*[contains(text(),'Fund cluster 1')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Fund)));

		WebElement fund = driver.findElement(By.xpath(Fund));
		fund.click();

		mouseOverClick(Selectfund, "xpath");
		isSelected(Selectfund, "Fund");
		Thread.sleep(2000);
	}

	public void TaxType() throws Exception {
		// Tax Type
		String Txtype = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]";
		String SelectTxtype = "//*[contains(text(),'Non-VAT')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Txtype)));

		WebElement txtyp = driver.findElement(By.xpath(Txtype));
		txtyp.click();

		mouseOverClick(SelectTxtype, "xpath");
		isSelected(SelectTxtype, "Tax Type");
		Thread.sleep(2000);
	}

	public void TaxITEM() throws Exception {
		// Tax Item
		String TxItem = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]";
		String SelectTxItem = "//*[contains(text(),'Goods')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TxItem)));

		WebElement txItem = driver.findElement(By.xpath(TxItem));
		txItem.click();

		mouseOverClick(SelectTxItem, "xpath");
		isSelected(SelectTxItem, "Tax Item");
		Thread.sleep(2000);

	}

	public void TINpayeeAddress() throws Exception {
		// TIN, Payee, Address
		String[] t = new String[3];

		t[0] = "TIN123";
		t[1] = "Vincent - Jennifer";
		t[2] = "Bacoor City, Cavite";

		String TIN = "//input[@id='tinNo']";
		String Payee = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/input[1]";
		String address = "//input[@id='address']";

		WebElement t1 = driver.findElement(By.xpath(TIN));
		t1.sendKeys(t[0]);
		isPopulated(TIN, "TIN/Employee No.");

		WebElement t2 = driver.findElement(By.xpath(Payee));
		t2.sendKeys(t[1]);
		isPopulated(Payee, "Payee");

		WebElement t3 = driver.findElement(By.xpath(address));
		t3.sendKeys(t[2]);
		isPopulated(address, "Address");

	}

	public void AddParticular() throws Exception {
		// Add particulars
		String Addparticular1 = "//thead/tr[1]/th[6]/button[1]";
		String Addparticular2 = "//thead/tr[1]/th[6]/button[1]/*[1]";

		WebElement pluspart1 = driver.findElement(By.xpath(Addparticular1));
		pluspart1.click();

		WebElement pluspart2 = driver.findElement(By.xpath(Addparticular2));
		pluspart2.click();
	}

	public void ResponsibilityCenter() throws Exception {
		// Responsibility Center 1
		String RespCenter = "//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]";
		String SelectRespCenter = "//*[contains(text(),'Administrative and Finance Division Administrative')]";

		WebElement Rcenter = driver.findElement(By.xpath(RespCenter));
		Rcenter.click();

		mouseOverClick(SelectRespCenter, "xpath");
		isSelected(SelectRespCenter, "Responsibility Center");
		Thread.sleep(2000);

		// Responsibility Center 2
		String RespCenter2 = "//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]/div[1]";
		String SelectRespCenter2 = "//*[contains(text(),'AREA OF THE SUPPORT MANAGER')]";

		WebElement Rcenter2 = driver.findElement(By.xpath(RespCenter2));
		Rcenter2.click();

		mouseOverClick(SelectRespCenter2, "xpath");
		
	}

	
	public void PREB() throws Exception {
		// Program Project 1
		String PREB = "//tbody/tr[1]/td[4]/div[1]/div[1]/div[1]/div[1]";
		String SelectPREB = "//*[contains(text(),'Lorem ipsum dolor 1')]";

		WebElement preb = driver.findElement(By.xpath(PREB));
		preb.click();

		mouseOverClick(SelectPREB, "xpath");
		isSelected(SelectPREB, "Details form PREB");
		Thread.sleep(2000);

		// Program Project 2
		String PREB2 = "//tbody/tr[2]/td[4]/div[1]/div[1]/div[1]/div[1]";
		String SelectPREB2 = "//*[contains(text(),'Lorem ipsum dolor 2')]";

		WebElement preb2 = driver.findElement(By.xpath(PREB2));
		preb2.click();

		mouseOverClick(SelectPREB2, "xpath");
		Thread.sleep(2000);

	}

	public void ParticularAmount() throws Exception {
		String[] t = new String[4];

		t[0] = "First particular 1";
		t[1] = "500";
		t[2] = "Second particular 2";
		t[3] = "800";

		String particular1 = "//tbody/tr[1]/td[1]/input[1]";
		String Amount1 = "//tbody/tr[1]/td[5]/input[1]";

		WebElement t1 = driver.findElement(By.xpath(particular1));
		t1.sendKeys(t[0]);
		isPopulated(particular1, "Particulars");

		WebElement t2 = driver.findElement(By.xpath(Amount1));
		t2.sendKeys(t[1]);
		isPopulated(Amount1, "Amount");

		String particular2 = "//tbody/tr[2]/td[1]/input[1]";
		String Amount2 = "//tbody/tr[2]/td[5]/input[1]";

		WebElement t3 = driver.findElement(By.xpath(particular2));
		t3.sendKeys(t[2]);

		WebElement t4 = driver.findElement(By.xpath(Amount2));
		t4.sendKeys(t[3]);

	}
	public void ProgramProject() throws Exception {
		// Program Project
		String ProgProj = "//tbody/tr[1]/td[3]/div[1]/div[1]/div[1]";
		String SelectProgProj = "//div[contains(text(),'Project 1')]";

		WebElement Prom = driver.findElement(By.xpath(ProgProj));
		Prom.click();
		
		//WebElement Proj = driver.findElement(By.xpath(SelectProgProj));
		//Proj.click();
		mouseOverClick(SelectProgProj, "xpath");
		Thread.sleep(1500);
	
		isSelected(SelectProgProj, "Program/Project");
		Thread.sleep(2000);

		// Program Project 2
		String ProgProj2 = "//tbody/tr[2]/td[3]/div[1]/div[1]/div[1]";
		String SelectProgProj2 = "//*[contains(text(),'Project 2')]";

		WebElement Prom2 = driver.findElement(By.xpath(ProgProj2));
		Prom2.click();
		
		//WebElement Proj2 = driver.findElement(By.xpath(SelectProgProj2));
		//Proj2.click();
		mouseOverClick(SelectProgProj2, "xpath");
		Thread.sleep(1500);
		

	}


	public void NextBtn() throws Exception {
		String Nxt = "//button[contains(text(),'Next')]";

		WebElement DVnxt = driver.findElement(By.xpath(Nxt));
		DVnxt.click();
		isClicked(Nxt, "Next button");
		Thread.sleep(2500);

	}

	public void BURSaddParticular() throws Exception {
		// Add BURS particulars
		String BursAddparticular1 = "//thead/tr[1]/th[6]/button[1]";
		String BursAddparticular2 = "//thead/tr[1]/th[6]/button[1]";
		
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BursAddparticular1)));

		WebElement pluspart1 = driver.findElement(By.xpath(BursAddparticular1));
		pluspart1.click();

		WebElement pluspart2 = driver.findElement(By.xpath(BursAddparticular2));
		pluspart2.click();
	}

	public void BURSResponsibilityCenter() throws Exception {
		// BURS Responsibility Center 1
		String BURSRespCenter = "//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]";
		String SelectBURSRespCenter = "//*[contains(text(),'Administrative and Finance Division Administrative')]";

		WebElement Rcenter = driver.findElement(By.xpath(BURSRespCenter));
		Rcenter.click();

		mouseOverClick(SelectBURSRespCenter, "xpath");
		isSelected(SelectBURSRespCenter, "BURS Responsibility Center");
		Thread.sleep(2000);

		// Responsibility Center 2
		String BURSRespCenter2 = "//tbody/tr[2]/td[2]/div[1]/div[1]/div[1]";
		String SelectBURSRespCenter2 = "//*[contains(text(),'AREA OF THE SUPPORT MANAGER')]";

		WebElement Rcenter2 = driver.findElement(By.xpath(BURSRespCenter2));
		Rcenter2.click();

		mouseOverClick(SelectBURSRespCenter2, "xpath");
		Thread.sleep(2000);
	}

	public void MFO() throws Exception {
		// MFO/PAP
		String MFOPAP = "//tbody/tr[1]/td[3]/div[1]/div[1]/div[1]";
		String SelectMFOPAP = "//*[contains(text(),'MFO/PAP option 1')]";

		WebElement mfo = driver.findElement(By.xpath(MFOPAP));
		mfo.click();

		mouseOverClick(SelectMFOPAP, "xpath");
		isSelected(SelectMFOPAP, "MFO/PAP");
		Thread.sleep(2000);

		// Responsibility Center 2
		String MFOPAP2 = "//tbody/tr[2]/td[3]/div[1]/div[1]/div[1]";
		String SelectMFOPAP2 = "//*[contains(text(),'MFO/PAP option 2')]";

		WebElement mfo2 = driver.findElement(By.xpath(MFOPAP2));
		mfo2.click();

		mouseOverClick(SelectMFOPAP2, "xpath");
		Thread.sleep(2000);
	}

	public void UACSobject() throws Exception {
		// UACS Object
		String Object = "//tbody/tr[1]/td[4]/div[1]/div[1]/div[1]";
		String SelectObject = "//*[contains(text(),'Object Code 1')]";

		WebElement obj = driver.findElement(By.xpath(Object));
		obj.click();

		mouseOverClick(SelectObject, "xpath");
		isSelected(SelectObject, "MFO/PAP");
		Thread.sleep(2000);

		// Responsibility Center 2
		String Object2 = "//tbody/tr[2]/td[4]/div[1]/div[1]/div[1]";
		String SelectObject2 = "//*[contains(text(),'Object Code 2')]";

		WebElement obj2 = driver.findElement(By.xpath(Object2));
		obj2.click();

		mouseOverClick(SelectObject2, "xpath");
		Thread.sleep(2000);
	}

	public void BURSParticularAmount() throws Exception {
		String[] t = new String[4];

		t[0] = "BURS particular 1";
		t[1] = "900";
		t[2] = "BURS particular 2";
		t[3] = "700";

		String BURSparticular1 = "//tbody/tr[1]/td[1]/input[1]";
		String BURSAmount1 = "//tbody/tr[1]/td[5]/input[1]";

		WebElement t1 = driver.findElement(By.xpath(BURSparticular1));
		t1.sendKeys(t[0]);
		isPopulated(BURSparticular1, "Particulars");

		WebElement t2 = driver.findElement(By.xpath(BURSAmount1));
		t2.sendKeys(t[1]);
		isPopulated(BURSAmount1, "Amount");

		String BURSparticular2 = "//tbody/tr[2]/td[1]/input[1]";
		String BURSAmount2 = "//tbody/tr[2]/td[5]/input[1]";

		WebElement t3 = driver.findElement(By.xpath(BURSparticular2));
		t3.sendKeys(t[2]);

		WebElement t4 = driver.findElement(By.xpath(BURSAmount2));
		t4.sendKeys(t[3]);
	}
	
	public void SubmitForApprovalBtn() throws Exception{
		String submitBtn = "//button[contains(text(),'Submit for Approval')]";
		
		WebElement Submit = driver.findElement(By.xpath(submitBtn));
		Submit.click();
		isClicked(submitBtn, "Submit for Approval button");
		Thread.sleep(1500);
		
	}
	
	public void DoneBtn () throws Exception{
		String donebtn = "//button[contains(text(),'Done')]";
		
		WebElement done = driver.findElement(By.xpath(donebtn));
		done.click();
		isClicked(donebtn, "Done button");
		Thread.sleep(2500);
		
	}
	
	public void ClaimantLogout() throws Exception{
		String logoutmain = "//body/div[@id='root']/div[4]/div[1]/div[2]/div[2]/button[1]/*[1]";
		String logoutBtn = "//span[contains(text(),'Logout')]";
		
		WebElement OutMain = driver.findElement(By.xpath(logoutmain));
		OutMain.click();
		Thread.sleep(500);
		
		WebElement OutBtn = driver.findElement(By.xpath(logoutBtn));
		OutBtn.click();
		isClicked(logoutBtn, "Log out Button");
		Thread.sleep(1500);
		
		
	}
}
