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
import org.openqa.selenium.support.ui.WebDriverWait;

import common.allMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLiquidationReportBaseTest extends allMethods {

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

	public void ClickLogin() throws InterruptedException {

		String Btn = "//button[contains(text(),'Login')]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "login Button");
		Thread.sleep(1500);

	}

	public void ClickLiquidation() throws InterruptedException {

		String Btn = "//span[contains(text(),'Liquidation')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Btn)));

		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		// isClicked(Btn, "Requisition sub-module");
		Thread.sleep(1500);
	}

	public void ClickClaimant() throws InterruptedException {

		String Btn = "//span[contains(text(),'Claimant')]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		// isClicked(Btn, "Requestor sub-module");
		Thread.sleep(1500);
	}

	public void FilterByForLiquidation() throws InterruptedException {
		String Filter = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]";
		WebElement tck = driver.findElement(By.xpath(Filter));
		tck.click();
		Thread.sleep(1500);

		String ForApproval = "//input[@id='released']";
		WebElement check = driver.findElement(By.xpath(ForApproval));
		check.click();
		Thread.sleep(1500);

		String Apply = "//button[contains(text(),'Apply Filter')]";
		WebElement btn = driver.findElement(By.xpath(Apply));
		btn.click();
		Thread.sleep(3500);

	}

	public void LiquidateBtn() throws InterruptedException {

		String Btn = "//button[contains(text(),'Liquidate')]";
		WebElement LiqBtn = driver.findElement(By.xpath(Btn));
		LiqBtn.click();
		Thread.sleep(1500);

	}

	public void UploadRequiredDoc() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")));

		String Upload = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]";
		WebElement uploadbutton = driver.findElement(By.xpath(Upload));
		uploadbutton.click();
		isClicked(Upload, "Choose File Button");
		Thread.sleep(2500);

		WebElement uploadDocument = driver.findElement(By.xpath(
				"//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/img[1]"));
		uploadDocument.click();
		Thread.sleep(2500);

		StringSelection file = new StringSelection(
				"C:\\Users\\Xurpas\\OneDrive\\Documents\\CFMIS\\TestData\\house.jpg");
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
		Thread.sleep(2500);

	}

	public void NextBtn() throws InterruptedException {
		String Btn = "//button[contains(text(),'Next')]";
		WebElement NxtBtn = driver.findElement(By.xpath(Btn));
		NxtBtn.click();
		Thread.sleep(1500);

	}

	public void ClickPlusIcon() throws InterruptedException {
		String Plus1 = "//tbody/tr[1]/td[4]/button[1]/*[1]";
		String Plus2 = "//tbody/tr[3]/td[4]/button[1]/*[1]";

		WebElement Pls1 = driver.findElement(By.xpath(Plus1));
		Pls1.click();
		Thread.sleep(1000);

		WebElement Pls2 = driver.findElement(By.xpath(Plus2));
		Pls2.click();
		Thread.sleep(1500);
	}

	public void SubPartandAmount() throws InterruptedException {
		// Sub Particular 1 and 2 and amount
		String[] t = new String[4];

		t[0] = "Sub 1";
		t[1] = "Sub 2";
		t[2] = "123";
		t[3] = "321";

		String sub1 = "//tbody/tr[2]/td[1]/input[1]";
		String sub2 = "//tbody/tr[4]/td[1]/input[1]";
		String amount1 = "//tbody/tr[2]/td[2]/input[1]";
		String amount2 = "//tbody/tr[4]/td[2]/input[1]";
		
		WebElement t1 = driver.findElement(By.xpath(sub1));
		t1.sendKeys(t[0]);

		WebElement t2 = driver.findElement(By.xpath(sub2));
		t2.sendKeys(t[1]);

		WebElement t3 = driver.findElement(By.xpath(amount1));
		t3.sendKeys(t[2]);
		
		WebElement t4 = driver.findElement(By.xpath(amount2));
		t4.sendKeys(t[3]);
	}
	
	public void Uploadsubdocs1() throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//tbody/tr[2]/td[3]/button[1]/*[1]")));

		String Upload = "//tbody/tr[2]/td[3]/button[1]/*[1]";
		WebElement uploadbutton = driver.findElement(By.xpath(Upload));
		uploadbutton.click();
		isClicked(Upload, "Choose File Button");
		Thread.sleep(2500);

		WebElement uploadDocument = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[2]/td[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/img[1]"));
		uploadDocument.click();
		Thread.sleep(2500);

		StringSelection file = new StringSelection(
				"C:\\Users\\Xurpas\\OneDrive\\Documents\\CFMIS\\TestData\\house.jpg");
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
		Thread.sleep(2500);
	}
	
	public void Uploadsubdocs2() throws Exception{
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//tbody/tr[4]/td[3]/button[1]/*[1]")));

		String Upload = "//tbody/tr[4]/td[3]/button[1]/*[1]";
		WebElement uploadbutton = driver.findElement(By.xpath(Upload));
		uploadbutton.click();
		isClicked(Upload, "Choose File Button");
		Thread.sleep(2500);

		WebElement uploadDocument = driver.findElement(By.xpath(
				"//tbody/tr[4]/td[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/img[1]"));
		uploadDocument.click();
		Thread.sleep(2500);

		StringSelection file = new StringSelection(
				"C:\\Users\\Xurpas\\OneDrive\\Documents\\CFMIS\\TestData\\house.jpg");
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
		Thread.sleep(2500);
	}
	
	
	public void submit() throws InterruptedException{
		String Btn = "//button[contains(text(),'Submit for Approval')]";
		WebElement sbmtBtn1 = driver.findElement(By.xpath(Btn));
		sbmtBtn1.click();
		Thread.sleep(1500);
		
		String Btn1 = "//body/div[@id='root']/div[@id='my-confirm-modal']/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]";
		WebElement sbmtBtn2 = driver.findElement(By.xpath(Btn1));
		sbmtBtn2.click();
		Thread.sleep(2000);
		
		String Btn2 = "//body/div[@id='root']/div[@id='modal-root']/div[1]/div[1]/div[1]/button[1]/*[1]";
		WebElement xbtn = driver.findElement(By.xpath(Btn2));
		xbtn.click();
		Thread.sleep(1500);

	}

}
