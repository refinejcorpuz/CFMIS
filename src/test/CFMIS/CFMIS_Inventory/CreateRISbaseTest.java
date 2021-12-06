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

public class CreateRISbaseTest extends allMethods {
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
	
	public void ClickRequisition() throws InterruptedException {
		
		String Btn = "//span[contains(text(),'Requisition')]";
		
		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Btn)));
		
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		isClicked(Btn, "Requisition sub-module");
		Thread.sleep(1500);
	}

	public void ClickRequestor() throws InterruptedException {

		String Btn = "//span[contains(text(),'Requestor')]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		isClicked(Btn, "Requestor sub-module");
		Thread.sleep(1500);
	}

	public void RequestItemButton() throws InterruptedException {

		String Rqs = "//a[contains(text(),'Request Item')]";
		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Rqs)));
		
		WebElement Rqsbtn = driver.findElement(By.xpath(Rqs));
		Rqsbtn.click();
		isClicked(Rqs, "Request Item button");
		Thread.sleep(1500);
	}

	public void Purpose() throws InterruptedException {

		String Purpose = "//input[@id='disbursementNo']";

		WebElement prps = driver.findElement(By.xpath("//input[@id='disbursementNo']"));
		prps.sendKeys("For testing only");
		isPopulated(Purpose, "Searchbox");
	}

	public void AddItem() throws InterruptedException {

		String add = "//thead/tr[1]/th[7]/button[1]";
		WebElement Plus = driver.findElement(By.xpath(add));
		Plus.click();
		isClicked(add, "Plus icon");
		Thread.sleep(1500);

	}

	public void SupplyinListofItem() throws InterruptedException {

		// checkbox -
		String S = "//tbody/tr[1]/td[1]/input[1]";
		
		WebElement check = driver.findElement(By.xpath(S));
		check.click();
		isClicked(S, "Checkbox of item");
		Thread.sleep(1500);

		// Qty
		String sqty = "//tbody/tr[1]/td[6]/input[1]";
		
		WebElement qty = driver.findElement(By.xpath(sqty));
		qty.sendKeys("15");
		isPopulated(sqty, "Quantity");

		// Unit Type click dropdown
		String Stype = "//tbody/tr[1]/td[7]/div[1]/div[1]/div[1]/div[1]";
		
		WebElement Ut = driver.findElement(By.xpath(Stype));
		Ut.click();
		
		//Select Unit type
		String SelctUnitNC = "//*[contains(text(),'Piece')]";
		
		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelctUnitNC)));

		mouseOverClick(SelctUnitNC, "xpath");
		isSelected(SelctUnitNC, "Unit Type");
	}
	
	public void EquipmentinListofItem() throws InterruptedException {

		// checkbox -
		String E = "//tbody/tr[2]/td[1]/input[1]";
		
		WebElement check = driver.findElement(By.xpath(E));
		check.click();
		isClicked(E, "Checkbox of item");
		Thread.sleep(1500);

		// Qty
		String eqty = "//tbody/tr[2]/td[6]/input[1]";
		
		WebElement qty = driver.findElement(By.xpath(eqty));
		qty.sendKeys("15");
		isPopulated(eqty, "Quantity");

		// Unit Type click dropdown
		String Etype = "//tbody/tr[2]/td[7]/div[1]/div[1]/div[1]/div[1]";
		
		WebElement Ut = driver.findElement(By.xpath(Etype));
		Ut.click();
		
		//Select Unit type
		String SelctUnitNC = "//*[contains(text(),'Piece')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelctUnitNC)));

		mouseOverClick(SelctUnitNC, "xpath");
		isSelected(SelctUnitNC, "Unit Type");
	}

	public void RequestSelectedItemBtn() throws InterruptedException {

		String Rqsbtn = "//button[contains(text(),'Request Selected Item/s')]";
		WebElement btn = driver.findElement(By.xpath(Rqsbtn));
		btn.click();
		isClicked(Rqsbtn, "Request Select Item button");
		Thread.sleep(1500);

	}
	
	public void SubmitRIS () throws InterruptedException {
		String Submit = "//button[contains(text(),'Submit')]";
		WebElement btn = driver.findElement(By.xpath(Submit));
		btn.click();
		isClicked(Submit, "Submit button");
		Thread.sleep(1500);
		
		//submit for approval
		String submitforapproval = "//button[contains(text(),'Submit for Approval')]";
		WebElement btn1 = driver.findElement(By.xpath(submitforapproval));
		btn1.click();
		isClicked(submitforapproval, "Submit for approval button");
		Thread.sleep(3000);
	}

}
