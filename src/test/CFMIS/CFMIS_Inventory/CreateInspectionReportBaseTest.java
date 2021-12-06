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

public class CreateInspectionReportBaseTest extends allMethods {

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

	public void ClickInspectionofDelivery() throws InterruptedException {

		String Btn = "//span[contains(text(),'Inspection of Delivery')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Btn)));

		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		// isClicked(Btn, "Requisition sub-module");
		Thread.sleep(1500);
	}

	public void ClickSO() throws InterruptedException {

		String Btn = "//span[contains(text(),'Supply Officer')]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		isClicked(Btn, "");
		Thread.sleep(1500);
	}
	
	public void FilterByForInspection() throws InterruptedException {
		String Filter = "//body/div[@id='root']/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/*[1]";
		WebElement tck = driver.findElement(By.xpath(Filter));
		tck.click();
		isClicked(Filter, "");
		Thread.sleep(1500);

		String Drft = "//input[@id='for_inspection']";
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
	
	public void Selectallitems () throws InterruptedException{
		String Btn = "//thead/tr[1]/th[1]/input[1]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		isClicked(Btn, "");
		Thread.sleep(1500);
		
	}
	
	public void CreatIRbtn () throws InterruptedException{
		String Btn = "//thead/tr[1]/th[1]/input[1]";
		WebElement RqstrBtn = driver.findElement(By.xpath(Btn));
		RqstrBtn.click();
		isClicked(Btn, "");
		Thread.sleep(1500);
		
	}

}
