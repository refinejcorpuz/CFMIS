package CFMIS_Procurement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.allMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BACSec_PR_BaseTest extends allMethods{

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
		
		public void ClickPR() throws InterruptedException {

			String Btn = "//span[contains(text(),'Purchase Request')]";
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
		
		public void ViewItemstoPurchase() throws InterruptedException {

			String Btn = "//button[contains(text(),'View Items to Purchase')]";
			WebElement LognBtn = driver.findElement(By.xpath(Btn));
			LognBtn.click();
			isClicked(Btn, "View items to Purchase");
			Thread.sleep(3000);

		}
		
		public void allcheckbox() throws InterruptedException {

			String Btn = "//thead/tr[1]/th[1]/input[1]";
			WebElement LognBtn = driver.findElement(By.xpath(Btn));
			LognBtn.click();
			isClicked(Btn, "All in checkbox");
			Thread.sleep(1500);

		}
		
		public void Proceed() throws InterruptedException {

			String Btn = "//button[contains(text(),'Proceed')]";
			WebElement LognBtn = driver.findElement(By.xpath(Btn));
			LognBtn.click();
			isClicked(Btn, "Proceed");
			Thread.sleep(1500);

		}
		
		public void Yes() throws InterruptedException {

			String Btn = "//button[contains(text(),'Yes')]";
			WebElement LognBtn = driver.findElement(By.xpath(Btn));
			LognBtn.click();
			isClicked(Btn, "Yes");
			Thread.sleep(3000);

		}
		
		public void Done() throws InterruptedException {

			String Btn = "//button[contains(text(),'Done')]";
			WebElement LognBtn = driver.findElement(By.xpath(Btn));
			LognBtn.click();
			isClicked(Btn, "Done");
			Thread.sleep(3500);

		}
		
		
	
}
