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

public class ItemCategoryBaseTest extends allMethods{
	
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
	
	
	public void MISAdminCredentialsLogin() throws InterruptedException {

		String[] t = new String[2];

		t[0] = "tiffa@email.com";
		t[1] = "install@1234";

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
	
	public void ClickInventorySetUp() throws InterruptedException {
		String RFP = "//span[contains(text(),'Inventory Setup')]";
		
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RFP)));
		
		WebElement Req = driver.findElement(By.xpath(RFP));
		Req.click();
		isClicked(RFP, "Inventory Set Up sub-module");
		Thread.sleep(3000);
	}
	
	public void ClickItemCategories() throws InterruptedException {
		String ItemCateg = "//span[contains(text(),'Items Categories')]";
		
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ItemCateg)));
		
		WebElement Itemcateg = driver.findElement(By.xpath(ItemCateg));
		Itemcateg.click();
		isClicked(ItemCateg, "Item Categories sub-module");
		Thread.sleep(3000);
	}
	
	public void ClickAddItemCategory() throws InterruptedException {

		String AddBtn = "//button[contains(text(),'Add')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(AddBtn)));

		WebElement cBtn = driver.findElement(By.xpath(AddBtn));
		cBtn.click();
		isClicked(AddBtn, "Add Button");
		Thread.sleep(2000);
	}

	public void ItemCategNameCode() throws Exception {
		
		String[] t = new String[2];

		t[0] = "IC 01";
		t[1] = "CategName 01";

		String ItemCategCode = "//body/div[@id='root']/div[@id='modal-root']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
		String ItemCategName = "//body/div[@id='root']/div[@id='modal-root']/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]";

		WebElement t1 = driver.findElement(By.xpath(ItemCategCode));
		t1.sendKeys(t[0]);
		isPopulated(ItemCategCode, "TIN/Employee No.");

		WebElement t3 = driver.findElement(By.xpath(ItemCategName));
		t3.sendKeys(t[1]);
		isPopulated(ItemCategName, "password");

	}
	
	public void SelectCategory() throws InterruptedException {
		String Categ = "//body/div[@id='root']/div[@id='modal-root']/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]";
		String SelectCateg = "//*[contains(text(),'Consumables')]";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Categ)));

		WebElement claims = driver.findElement(By.xpath(Categ));
		claims.click();
		isClicked(Categ, "Select Claim Type");
		Thread.sleep(500);

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SelectCateg)));

		mouseOverClick(SelectCateg, "xpath");
		isSelected(SelectCateg, "Claim Type");
		
	}



}
