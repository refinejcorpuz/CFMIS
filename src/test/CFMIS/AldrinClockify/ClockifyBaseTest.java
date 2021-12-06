package AldrinClockify;

import java.awt.AWTException;
import java.awt.Robot;
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

public class ClockifyBaseTest extends allMethods {

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
		driver.get("https://clockify.me/tracker");
		
		Thread.sleep(3500);
	}

	public void CredentialsLogin() throws InterruptedException {

		String[] t = new String[2];

		t[0] = "aldrinjohn.alcance@stefanini.com";
		t[1] = "Stefanini2021";

		String usrnme = "//input[@id='email']";
		String psswrd = "//input[@id='password']";

		WebElement t1 = driver.findElement(By.xpath(usrnme));
		t1.sendKeys(t[0]);
		isPopulated(usrnme, "username");

		WebElement t2 = driver.findElement(By.xpath(psswrd));
		t2.sendKeys(t[1]);
		isPopulated(psswrd, "password");
	}

	public void ClickLogin() throws InterruptedException {

		String Btn = "//body/app-root[1]/register-layout[1]/div[1]/div[1]/div[1]/div[1]/div[2]/login[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[5]/button[1]";
		WebElement LognBtn = driver.findElement(By.xpath(Btn));
		LognBtn.click();
		isClicked(Btn, "login Button");
		Thread.sleep(3500);

	}

	public void TicketNum() throws InterruptedException {
		String TicketField = "//*[@id=\"layout-main\"]/tracker2/div/div/div/time-tracker-recorder/div/div/div/div[1]/div/form/autocomplete-input/div/input";

		WebElement tckt = driver.findElement(By.xpath(TicketField));
		tckt.sendKeys("Task 123");
		isPopulated(TicketField, "Ticket name");
	}

	public void AddTask() throws InterruptedException {
		//task click dropdown
		String task = "//body/app-root[1]/default-layout[1]/div[1]/main[1]/tracker2[1]/div[1]/div[1]/div[1]/time-tracker-recorder[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/project-picker-label[1]/div[1]/div[1]/a[1]/span[1]";

		WebElement Ut = driver.findElement(By.xpath(task));
		Ut.click();

		// Select Unit type
		String Selcttask = "//*[contains(text(),'Piece')]";

		WebDriverWait wait1 = new WebDriverWait(driver, 180);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Selcttask)));

		mouseOverClick(Selcttask, "xpath");
		isSelected(Selcttask, "Task");
	}
	
	public void Duplicate() throws InterruptedException {
		
		String Threedot = "//body/app-root[1]/default-layout[1]/div[1]/main[1]/tracker2[1]/div[1]/div[1]/div[1]/div[1]/entry-group[1]/div[1]/time-tracker-entry[1]/div[1]/div[4]/div[1]/div[3]/div[1]/img[1]";
		String Dupli = "//*[contains(text(),'Duplicate')]";
		
		WebElement dot = driver.findElement(By.xpath(Threedot));
		dot.click();
		Thread.sleep(1000);
		
		WebElement dup = driver.findElement(By.xpath(Dupli));
		dup.click();
		Thread.sleep(1500);
		
	}
	
	public void ClickMainticket () throws InterruptedException{
		
		String main = "//body/app-root[1]/default-layout[1]/div[1]/main[1]/tracker2[1]/div[1]/div[1]/div[1]/div[1]/entry-group[1]/div[1]/parent-tracker-entry[1]/div[1]/div[1]/span[1]/a[1]/span[1]";
		
		WebElement dot = driver.findElement(By.xpath(main));
		dot.click();
		Thread.sleep(1500);
		
	}
	
	public void EnterTicketNums() throws InterruptedException, AWTException {

		String[] t = new String[2];

		t[0] = "tsk234";
		t[1] = "Stefanini2021";

		String Input = "//*[@id=\"layout-main\"]/tracker2/div/div/div/div/entry-group[1]/div/div[1]/time-tracker-entry/div/div[1]/span/div/input";

		WebElement t1 = driver.findElement(By.xpath(Input));
		t1.clear();
		t1.sendKeys(t[0]);
		
		Robot robot = new Robot ();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);			
		Thread.sleep(2500);
		
		
		WebElement t2 = driver.findElement(By.xpath(Input));
		t2.clear();
		t2.sendKeys(t[1]);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);			
		Thread.sleep(2500);

	}
	
	public void Time () throws InterruptedException, AWTException {

		String[] t = new String[2];

		t[0] = "0400";
		t[1] = "0415";

		String startTime = "//*[@id=\"layout-main\"]/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry[1]/div/div[4]/div/single-date-picker2/div[1]/input-time-ampm[1]/input";
		String endTime = "//*[@id=\"layout-main\"]/tracker2/div/div/div/div/entry-group[1]/div/time-tracker-entry[1]/div/div[4]/div/single-date-picker2/div[1]/input-time-ampm[2]/input";
		
		WebElement t1 = driver.findElement(By.xpath(startTime));
		t1.clear();
		t1.sendKeys(t[0]);
		
		WebElement t2 = driver.findElement(By.xpath(endTime));
		t2.clear();
		t2.sendKeys(t[1]);
		
		Robot robot = new Robot ();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);			
		Thread.sleep(2500);
	}
	
	
}
