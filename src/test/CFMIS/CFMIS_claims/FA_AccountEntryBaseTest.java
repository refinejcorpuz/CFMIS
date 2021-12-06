package CFMIS_claims;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.allMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FA_AccountEntryBaseTest extends allMethods {
	
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

		t[0] = "chyler@email.com";
		t[1] = "install@123";

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

		String Btn = "//button[contains(text(),'Login')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "login Button");
		Thread.sleep(1500);
		
	}
	
public void ClickReq() throws InterruptedException {
		
		String Btn = "//span[contains(text(),'Request for Payment')]";
		
		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Btn)));
		
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		//isClicked(Btn, "Requisition sub-module");
		Thread.sleep(1500);
	}

	public void ClickFA() throws InterruptedException {

		String Btn = "//span[contains(text(),'Financial Analyst')]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		//isClicked(Btn, "Requestor sub-module");
		Thread.sleep(1500);
	}
	
	public void ClickForEval() throws InterruptedException {
		String Btn = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		
		Thread.sleep(1500);
	}
	
	public void TagASComplete() throws InterruptedException{
		String SelctEval = "//button[contains(text(),'Complete')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelctEval)));

		mouseOverClick(SelctEval, "xpath");
		//isSelected(SelctUnit, "Unit Type");
		Thread.sleep(2000);
	}
	public void SetUpAccountingEntrybtn() throws InterruptedException{
		String Btn = "//button[contains(text(),'Setup Accounting Entry')]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		
		Thread.sleep(1500);
		
		
	}
	
	public void scroll () throws InterruptedException{
		String scr = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]";
		scrollToElementPlusScrollDown(scr);
	}
	public void plusICon() throws InterruptedException{
		String Btn = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[13]/button[1]/*[1]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		
		Thread.sleep(1500);
	}

	public void Accts() throws InterruptedException{
		String Btn = "//tbody/tr[1]/td[1]/button[1]/input[1]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		
		Thread.sleep(3500);
		
		String acct = "//b[contains(text(),'Petty Cash')]";
		WebElement accts = driver.findElement(By.xpath(acct));
		accts.click();
		
		Thread.sleep(1500);
		
		String ok = "//button[contains(text(),'Okay')]";
		WebElement oks = driver.findElement(By.xpath(ok));
		oks.click();
		
		Thread.sleep(2500);
		
	}
	public void InputFields() throws InterruptedException{
		String[] t = new String[5];

		t[0] = "Test Acct";
		t[1] = "Acct 123";
		t[2] = "400";
		t[3]= "300";
		t[4] = "test";
		

		String Field1 = "//tbody/tr[1]/td[1]/button[1]/input[1]";
		String Field2 = "//tbody/tr[1]/td[2]/button[1]/input[1]";
		String Field3 = "//tbody/tr[1]/td[3]/input[1]";
		String Field4 = "//tbody/tr[1]/td[4]/input[1]";
		String Field5 = "//tbody/tr[1]/td[5]/input[1]";

		/*
		 * WebElement t0 = driver.findElement(By.xpath(Field1)); t0.sendKeys(t[0]);
		 * //isPopulated(Field1, "TIN/Employee No.");
		 * 
		 * WebElement t1 = driver.findElement(By.xpath(Field2)); t1.sendKeys(t[1]);
		 * //isPopulated(Field2, "Payee");
		 */
		WebElement t2 = driver.findElement(By.xpath(Field3));
		t2.sendKeys(t[2]);
		//isPopulated(Field3, "Address");
		
		WebElement t3 = driver.findElement(By.xpath(Field4));
		t3.sendKeys(t[3]);
		
		WebElement t4 = driver.findElement(By.xpath(Field5));
		t4.sendKeys(t[4]);

	}
	
	
	public void SetupSubs() throws InterruptedException{
		String Btn = "//button[contains(text(),'Setup Subsidiary Ledger')]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		
		Thread.sleep(1500);
		
		String Btn1 = "//button[contains(text(),'Submit')]";
		WebElement RqstrBtn1 = driver.findElement(By.xpath(Btn1));
		RqstrBtn1.click();
		
		Thread.sleep(3000);
	}
	
	
	
	
	
}
