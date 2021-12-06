package CFMIS_claims;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.allMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CA_ApprovalBaseTest extends allMethods {
	public void browserUsed() throws Exception {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://cfmis.multidemos.com/login");
	}

	public void CredentialsLogin() throws InterruptedException {

		String[] t = new String[2];

		t[0] = "freya@email.com";
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
		Thread.sleep(3000);
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
	
	public void ClickCA() throws InterruptedException {
		String CA = "//span[contains(text(),'Chief Accountant')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CA)));

		WebElement Chief = driver.findElement(By.xpath(CA));
		Chief.click();
		isClicked(CA, "Request for Payment sub-module");
		Thread.sleep(3000);
	}
	
	public void FilterByForApproval() throws InterruptedException{
		String Filter = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]";
		WebElement tck = driver.findElement(By.xpath(Filter));
		tck.click();
		isClicked(Filter, "Filter");
		Thread.sleep(1500);
		
		String ForApproval = "//input[@id='for_approval']";
		WebElement check = driver.findElement(By.xpath(ForApproval));
		check.click();
		isClicked(ForApproval, "Checkbox of item");
		Thread.sleep(1500);
		
		String Apply = "//button[contains(text(),'Apply Filter')]";
		WebElement btn = driver.findElement(By.xpath(Apply));
		btn.click();
		isClicked(Apply, "Apply");
		Thread.sleep(3500);	
		
	}
	
	public void ForApproval() throws InterruptedException{
		//tagging
		String CashAvailable = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[18]/input[1]";
		WebElement tck1 = driver.findElement(By.xpath(CashAvailable));
		tck1.click();
		isClicked(CashAvailable, "Cash Available");
		Thread.sleep(500);
		
		String subj = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[19]/input[1]";
		WebElement tck2 = driver.findElement(By.xpath(subj));
		tck2.click();
		isClicked(subj, "Subject to Authority to debit");
		Thread.sleep(500);
		
		String sup = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[20]/input[1]";
		WebElement tck3 = driver.findElement(By.xpath(sup));
		tck3.click();
		isClicked(sup, "Supporting document");
		Thread.sleep(500);
		
		//For Approval dropdown
		String ForApp = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/small[1]/div[1]/div[1]/div[1]/button[1]";
		WebElement drop = driver.findElement(By.xpath(ForApp));
		drop.click();
		isClicked(ForApp, "For Approval dropdown");
		Thread.sleep(1500);
		
		
		String Approved = "//button[contains(text(),'Approve')]";
	//	String CCunit = "//tbody/tr[4]/td[7]/div[1]/div[1]/div[1]/div[1]";

		WebElement app = driver.findElement(By.xpath(Approved));
		app.click();
		isClicked(Approved, "");
		Thread.sleep(1500);
	
		
	}
	
	public void Forward () throws InterruptedException{
		String Forwrd = "//button[contains(text(),'Forward')]";

		WebElement check = driver.findElement(By.xpath(Forwrd));
		check.click();
		isClicked(Forwrd, "Checkbox of item");
		Thread.sleep(3000);
	}

	

}
