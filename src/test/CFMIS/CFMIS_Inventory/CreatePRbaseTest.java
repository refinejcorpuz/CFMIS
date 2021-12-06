package CFMIS_Inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.allMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatePRbaseTest extends allMethods {
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

		t[0] = "lynch@email.com";
		t[1] = "123123123";

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

	public void ClickPR() throws InterruptedException {

		String Btn = "//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/a[3]/div[1]/span[1]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Btn)));

		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		// isClicked(Btn, "Requisition sub-module");
		Thread.sleep(1500);
	}

	public void ClickRequestor() throws InterruptedException {

		String Btn = "//span[contains(text(),'Requestor')]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		isClicked(Btn, "Requestor sub-module");
		Thread.sleep(1500);
	}

	public void CreatePRBtn() throws InterruptedException {

		String Rqs = "//a[contains(text(),'Create Purchase Request')]";
		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Rqs)));

		WebElement Rqsbtn = driver.findElement(By.xpath(Rqs));
		Rqsbtn.click();
		isClicked(Rqs, "Request Item button");
		Thread.sleep(3000);
	}

	public void Purpose() throws InterruptedException {

		String Purpose = "//input[@id='disbursementNo']";

		WebElement prps = driver.findElement(By.xpath(Purpose));
		prps.sendKeys("For testing only");
		isPopulated(Purpose, "Searchbox");
	}

	public void AddItem() throws InterruptedException {

		String add = "//body[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[7]/table[1]/thead[1]/tr[1]/th[8]/button[1]";
		WebElement Plus = driver.findElement(By.xpath(add));
		Plus.click();
		isClicked(add, "Plus icon");
		Thread.sleep(2000);

	}

	public void SupplyinListofItem1() throws InterruptedException {

		// checkbox -
		String S = "//tbody/tr[1]/td[1]/input[1]";

		WebElement check = driver.findElement(By.xpath(S));
		check.click();
		isClicked(S, "Checkbox of item");
		Thread.sleep(1500);

		// Qty
		String sqty = "//tbody/tr[1]/td[6]/input[1]";

		WebElement qty = driver.findElement(By.xpath(sqty));
		qty.sendKeys("25");
		isPopulated(sqty, "Quantity");

	}
	
	public void SupplyUnit1() throws InterruptedException {

		// Unit Type click dropdown
		String stype = "//tbody/tr[1]/td[7]/div[1]/div[1]/div[1]/div[1]";

		WebElement Ut = driver.findElement(By.xpath(stype));
		Ut.click();

		// Select Unit type
		String SelctUnitNC = "//*[contains(text(),'Bundle')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelctUnitNC)));

		mouseOverClick(SelctUnitNC, "xpath");
		isSelected(SelctUnitNC, "Unit Type");
	}
	
	public void SupplyinListofItem2() throws InterruptedException {

		// checkbox -
		String S1 = "//tbody/tr[4]/td[1]/input[1]";

		WebElement check1 = driver.findElement(By.xpath(S1));
		check1.click();
		isClicked(S1, "Checkbox of item");
		Thread.sleep(1500);

		// Qty
		String sqty1 = "//tbody/tr[4]/td[6]/input[1]";

		WebElement qty1 = driver.findElement(By.xpath(sqty1));
		qty1.sendKeys("50");
		isPopulated(sqty1, "Quantity");

	}
	
	public void SupplyUnit2() throws InterruptedException {

		// Unit Type click dropdown
		String stype1 = "//tbody/tr[4]/td[7]/div[1]/div[1]/div[1]/div[1]";

		WebElement Ut1 = driver.findElement(By.xpath(stype1));
		Ut1.click();

		// Select Unit type
		String SelctUnitNC1 = "//*[contains(text(),'Ream')]";

		WebDriverWait wait11= new WebDriverWait(driver, 180);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelctUnitNC1)));

		mouseOverClick(SelctUnitNC1, "xpath");
		isSelected(SelctUnitNC1, "Unit Type");
	}


	public void EquipmentinListofItem1() throws InterruptedException {

		// checkbox -
		String E = "//tbody/tr[2]/td[1]/input[1]";

		WebElement check = driver.findElement(By.xpath(E));
		check.click();
		isClicked(E, "Checkbox of item");
		Thread.sleep(1500);

		// Qty
		String sqty = "//tbody/tr[2]/td[6]/input[1]";

		WebElement qty = driver.findElement(By.xpath(sqty));
		qty.sendKeys("50");
		isPopulated(sqty, "Quantity");
		
	}
	
	public void EquipmentinListofItem2() throws InterruptedException {

		// checkbox -
		String E1 = "//tbody/tr[3]/td[1]/input[1]";

		WebElement check1 = driver.findElement(By.xpath(E1));
		check1.click();
		isClicked(E1, "Checkbox of item");
		Thread.sleep(1500);

		// Qty
		String sqty1 = "//tbody/tr[3]/td[6]/input[1]";

		WebElement qty1 = driver.findElement(By.xpath(sqty1));
		qty1.sendKeys("40");
		isPopulated(sqty1, "Quantity");

	}
	
	public void EquipmentUnit1() throws InterruptedException {

		// Unit Type click dropdown
		String Etype = "//tbody/tr[2]/td[7]/div[1]/div[1]/div[1]/div[1]";

		WebElement Ut = driver.findElement(By.xpath(Etype));
		Ut.click();

		// Select Unit type
		String SelctUnitNC = "//*[contains(text(),'Piece')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelctUnitNC)));

		mouseOverClick(SelctUnitNC, "xpath");
		isSelected(SelctUnitNC, "Unit Type");
		
	}
	
	public void EquipmentUnit2() throws InterruptedException {
		// Unit Type click dropdown
		String Etype1 = "//tbody/tr[3]/td[7]/div[1]/div[1]/div[1]/div[1]";

		WebElement Ut1 = driver.findElement(By.xpath(Etype1));
		Ut1.click();

		// Select Unit type
		String SelctUnitNC1 = "//*[contains(text(),'Box')]";

		WebDriverWait wait11 = new WebDriverWait(driver, 180);
		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelctUnitNC1)));

		mouseOverClick(SelctUnitNC1, "xpath");
		isSelected(SelctUnitNC1, "Unit Type");
		Thread.sleep(1500);
	}

	public void RequestSelectedItemBtn() throws InterruptedException {

		String Rqsbtn = "//button[contains(text(),'Request Selected Item/s')]";
		WebElement btn = driver.findElement(By.xpath(Rqsbtn));
		btn.click();
		isClicked(Rqsbtn, "Request Select Item button");
		Thread.sleep(1500);

	}

	public void CostFields1() throws InterruptedException {

		// Estimated Unit cost
		String Cst = "//tbody/tr[1]/td[6]/input[1]";

		WebElement cost = driver.findElement(By.xpath(Cst));
		cost.sendKeys("150");
		isPopulated(Cst, "Quantity");

		/*
		 * // Estimated Total cost String ttl = "//tbody/tr[1]/td[7]/input[1]";
		 * 
		 * WebElement cost1 = driver.findElement(By.xpath(ttl)); cost1.sendKeys("300");
		 * isPopulated(ttl, "Quantity"); Thread.sleep(1500);
		 */
	}

	
	public void CostFields2() throws InterruptedException {

		// Estimated Unit cost
		String Cst = "//tbody/tr[2]/td[6]/input[1]";

		WebElement cost = driver.findElement(By.xpath(Cst));
		cost.sendKeys("100");
		isPopulated(Cst, "Quantity");

		
	}
	public void SubmitRIS() throws InterruptedException {
		String Submit = "//button[contains(text(),'Submit')]";
		WebElement btn = driver.findElement(By.xpath(Submit));
		btn.click();
		isClicked(Submit, "Submit button");
		Thread.sleep(1500);

			}

	public void SubmitForApproval () throws InterruptedException{
		String Xbtn = "//button[contains(text(),'Submit for Approval')]";
		WebElement btn = driver.findElement(By.xpath(Xbtn));
		btn.click();
		isClicked(Xbtn, "Submit For Approval button");
		Thread.sleep(3000);
	}
	
	public void Xbutton () throws InterruptedException{
		String Xbtn = "//body/div[@id='root']/div[@id='modal-root']/div[1]/div[1]/div[1]/button[1]/*[1]";
		WebElement btn = driver.findElement(By.xpath(Xbtn));
		btn.click();
		isClicked(Xbtn, "X button");
		Thread.sleep(2000);
	}
}
