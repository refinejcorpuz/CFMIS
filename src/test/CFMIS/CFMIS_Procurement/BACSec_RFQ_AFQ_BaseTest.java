package CFMIS_Procurement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.allMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BACSec_RFQ_AFQ_BaseTest extends allMethods {

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

		t[0] = "chaol1@email.com";
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
		Thread.sleep(5000);

	}

	public void ClickRFQ() throws InterruptedException {

		String Btn = "//span[contains(text(),'Request For Quotation')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "Purchase Request");
		Thread.sleep(1500);

	}

	public void ClickBac() throws InterruptedException {

		String Btn = "//span[contains(text(),'Bac Secretariat')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "Bac Secretariat");
		Thread.sleep(3500);

	}

	public void FilterByDraft() throws InterruptedException {
		String Filter = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]";
		WebElement tck = driver.findElement(By.xpath(Filter));
		tck.click();
		isClicked(Filter, "");
		Thread.sleep(1500);

		String Drft = "//input[@id='draft']";
		WebElement check = driver.findElement(By.xpath(Drft));
		check.click();
		isClicked(Drft, "");
		Thread.sleep(1500);

		String Apply = "//button[contains(text(),'Apply Filter')]";
		WebElement btn = driver.findElement(By.xpath(Apply));
		btn.click();
		isClicked(Apply, "");
		Thread.sleep(3500);

	}

	public void ViewRFQ() throws InterruptedException {

		String Btn = "//button[contains(text(),'View RFQ')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(3500);

	}

	public void AddBidder1() throws InterruptedException {

		// Bidder 1
		String stype = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[1]";

		WebElement Ut = driver.findElement(By.xpath(stype));
		Ut.click();

		String B1 = "//*[contains(text(),'COMPANY 1')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(B1)));

		mouseOverClick(B1, "xpath");
		isSelected(B1, "");

		// Unit Price , date of delivery, option
		String[] t = new String[3];

		t[0] = "200";
		t[1] = "5";
		t[2] = "sample";

		String unit = "//tbody/tr[1]/td[5]";
		String date = "//input[@id='date-of-delivery:-784']";
		String opt = "//input[@id='option:-785']";

		WebElement t0 = driver.findElement(By.xpath(unit));
		t0.sendKeys(t[0]);
		isPopulated(unit, "");

		WebElement t1 = driver.findElement(By.xpath(date));
		t1.sendKeys(t[1]);
		isPopulated(date, "");

		WebElement t2 = driver.findElement(By.xpath(opt));
		t2.sendKeys(t[2]);
		isPopulated(opt, "");

		// add bidder
		String Btn = "//button[contains(text(),'Add Bidder')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(1500);

	}

	public void AddBidder2() throws InterruptedException {

		// Bidder 2
		String stype = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[1]";

		WebElement Ut = driver.findElement(By.xpath(stype));
		Ut.click();

		String B1 = "//*[contains(text(),'COMPANY 2')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(B1)));

		mouseOverClick(B1, "xpath");
		isSelected(B1, "");

		// Unit Price , date of delivery, option
		String[] t = new String[3];

		t[0] = "200";
		t[1] = "5";
		t[2] = "sample";

		String unit = "//input[@id='-679']";
		// date = "//input[@id='date-of-delivery:-784']";
		String opt = "//input[@id='option:-785']";

		WebElement t0 = driver.findElement(By.xpath(unit));
		t0.sendKeys(t[0]);
		isPopulated(unit, "");

		/*
		 * WebElement t1 = driver.findElement(By.xpath(date)); t1.sendKeys(t[1]);
		 * isPopulated(date, "");
		 */

		WebElement t2 = driver.findElement(By.xpath(opt));
		t2.sendKeys(t[2]);
		isPopulated(opt, "");

		// add bidder
		String Btn = "//button[contains(text(),'Add Bidder')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(1500);

	}
	
	public void AddBidder3() throws InterruptedException {

		// Bidder 3
		String stype = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[1]";

		WebElement Ut = driver.findElement(By.xpath(stype));
		Ut.click();

		String B1 = "//*[contains(text(),'COMPANY 3')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(B1)));

		mouseOverClick(B1, "xpath");
		isSelected(B1, "");

		// Unit Price , date of delivery, option
		String[] t = new String[3];

		t[0] = "200";
		t[1] = "5";
		t[2] = "sample";

		String unit = "//input[@id='-679']";
		//String date = "//input[@id='date-of-delivery:-784']";
		String opt = "//input[@id='option:-785']";

		WebElement t0 = driver.findElement(By.xpath(unit));
		t0.sendKeys(t[0]);
		isPopulated(unit, "");

		/*
		 * WebElement t1 = driver.findElement(By.xpath(date)); t1.sendKeys(t[1]);
		 * isPopulated(date, "");
		 */

		WebElement t2 = driver.findElement(By.xpath(opt));
		t2.sendKeys(t[2]);
		isPopulated(opt, "");
	}
	
	public void Save() throws InterruptedException {

		String Btn = "//button[contains(text(),'Save')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(1500);

	}
	
	public void CreateAFQ() throws InterruptedException {

		String Btn = "//button[contains(text(),'Create AFQ')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(3500);

	}
	

	public void ViewAFQ() throws InterruptedException {

		String Btn = "//button[contains(text(),'View AFQ')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(3500);

	}
	public void OpeningDate() throws InterruptedException{
		String Filter = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/fieldset[4]/input[1]";
		WebElement tck = driver.findElement(By.xpath(Filter));
		tck.click();
		isClicked(Filter, "");
		Thread.sleep(1500);

		String Drft = "//*[contains(text(),'Today')]";
		WebElement check = driver.findElement(By.xpath(Drft));
		check.click();
		isClicked(Drft, "");
		Thread.sleep(3500);
	}
	
	public void Passed() throws InterruptedException {

		String Btn = "//thead/tr[8]/th[3]/div[1]/dl[1]/dd[1]/input[1]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(1500);
		
		String Btn2 = "//thead/tr[12]/th[4]/div[1]/dl[1]/dd[1]/input[1]";
		WebElement LognBtn2 = driver.findElement(By.xpath(Btn2));
		LognBtn2.click();
		isClicked(Btn2, "");
		Thread.sleep(3500);
		
	}
	
	public void CreateBidEval() throws InterruptedException {

		String Btn = "//button[contains(text(),'Create Bid Evaluation Sheet')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "");
		Thread.sleep(3500);

	}

}
