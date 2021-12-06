package common;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class allMethods {
	
	protected static int FIND_ELEMENT_TIMEOUT = 1;
	public static String browser = "chrome";
	public static WebDriver driver;
	ExtentReports extent;
	ExtentTest ReporterTest;

	@BeforeTest
	public void startReport() {
		extent = new ExtentReports(System.getProperty("user.dir") +"/reports/CFMIS.html", true);
		extent
		.addSystemInfo("Project", "Philpost - CFMIS")
		.addSystemInfo("Application","CFMIS")
		.addSystemInfo("User Name", "JenCorpuz");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
		
		ReporterTest=extent.startTest("CFMIS");
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			ReporterTest.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(ReporterTest);
		
	}
	
	@AfterTest
	public void endreport() {
		extent.flush();
		extent.close();
		
	}	
	

	@AfterSuite
	public void browserClose() {
		driver.quit();
	}


	public static void log(String message) {
		System.out.println(message);
		Reporter.log(message);
	}

	public void Takescreenshot() throws IOException {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(
					"C:\\eclipse-MYworkspace\\CFMIS\\screenshot\\" + getFileName(this.getClass().getSimpleName())));
		} catch (Exception e) {
			log("Screenshot is not created.");
			e.printStackTrace();
		}
	}

	public String getFileName(String nameTest) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy_hh.mm.ss");
		Date date = new Date();
		return dateFormat.format(date) + "_" + nameTest + ".png";
	}
	public static WebElement findElement(String elementId, String locType) {
		WebElement element = null;
		try {
			if (locType.equalsIgnoreCase("id")) {
				return new WebDriverWait(driver, FIND_ELEMENT_TIMEOUT)
						.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
			} else if (locType.equalsIgnoreCase("name")) {
				return new WebDriverWait(driver, FIND_ELEMENT_TIMEOUT)
						.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementId)));
			} else if (locType.equalsIgnoreCase("linktext")) {
				return new WebDriverWait(driver, FIND_ELEMENT_TIMEOUT)
						.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(elementId)));
			} else if (locType.equalsIgnoreCase("partiallinktext")) {
				return new WebDriverWait(driver, FIND_ELEMENT_TIMEOUT)
						.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(elementId)));
			} else if (locType.equalsIgnoreCase("css")) {
				return new WebDriverWait(driver, FIND_ELEMENT_TIMEOUT)
						.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(elementId)));
			} else if (locType.equalsIgnoreCase("class")) {
				return new WebDriverWait(driver, FIND_ELEMENT_TIMEOUT)
						.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementId)));
			} else {
				return new WebDriverWait(driver, FIND_ELEMENT_TIMEOUT)
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementId)));
			}
		} catch (Exception e) {
			System.out.println("Element is not found");
			return element;
		}
	}

	public void isClicked(String locator, String ElementDescription) throws InterruptedException {

		try {
			driver.findElement(By.xpath(locator)).isDisplayed();
			ReporterTest.log(LogStatus.PASS, ElementDescription + " button was clicked");
		} catch (Exception e) {
			ReporterTest.log(LogStatus.FAIL, ElementDescription + " button was not clicked");
		}
	}

	public void isPopulated(String locator, String ElementDescription) throws InterruptedException {

		try {
			driver.findElement(By.xpath(locator)).isDisplayed();
			ReporterTest.log(LogStatus.PASS, ElementDescription + " is populated in the textbox");
		} catch (Exception e) {
			ReporterTest.log(LogStatus.FAIL,ElementDescription + " is not populated in the textbox");
		}
	}

	public void isDisplayed(String locator, String ElementDescription) throws InterruptedException {

		try {
			driver.findElement(By.xpath(locator)).isEnabled();
			ReporterTest.log(LogStatus.PASS, ElementDescription + " was displayed.");
		} catch (Exception e) {
			ReporterTest.log(LogStatus.FAIL, ElementDescription + " was not displayed.");
		}

	}

	public void isSelected(String locator, String ElementDescription) throws InterruptedException {

		try {
			driver.findElement(By.xpath(locator)).isSelected();
			ReporterTest.log(LogStatus.PASS, ElementDescription + " was selected.");
		} catch (Exception e) {
			ReporterTest.log(LogStatus.FAIL, ElementDescription + " was not selected.");
		}

	}

	public static void mouseOverClick(String elementId, String locType) throws InterruptedException {
		Actions builder = new Actions(driver);

		WebElement object = findElement(elementId, locType);
		Action MoveToAcertainObject = builder.moveToElement(object).click().build();
		MoveToAcertainObject.perform();
	}
	
	public void scrollToElementPlusScrollDown(String string){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(string));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		js.executeScript("javascript:window.scrollBy(0,-200)");
	}
	


}
