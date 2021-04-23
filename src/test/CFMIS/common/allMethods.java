package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allMethods {

	protected static int FIND_ELEMENT_TIMEOUT = 1;
	public static String browser = "chrome";
	public static WebDriver driver;

	@BeforeTest
	public void browserUsed() throws Exception {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://cfmis.multidemos.com/login");

	}

	@AfterTest
	public void browserClose() throws Exception {
		driver.close();
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
			System.out.println(ElementDescription + " button was clicked");
		} catch (Exception e) {
			System.out.println(ElementDescription + " button was not clicked");
		}
	}

	public void isPopulated(String locator, String ElementDescription) throws InterruptedException {

		try {
			driver.findElement(By.xpath(locator)).isDisplayed();
			System.out.println(ElementDescription + " is populated in the textbox");
		} catch (Exception e) {
			System.out.println(ElementDescription + " is not populated in the textbox");
		}
	}

	public void isDisplayed(String locator, String ElementDescription) throws InterruptedException {

		try {
			driver.findElement(By.xpath(locator)).isEnabled();
			System.out.println(ElementDescription + " was displayed.");
		} catch (Exception e) {
			System.out.println(ElementDescription + " was not displayed.");
		}

	}

	public void isSelected(String locator, String ElementDescription) throws InterruptedException {

		try {
			driver.findElement(By.xpath(locator)).isSelected();
			System.out.println(ElementDescription + " was selected.");
		} catch (Exception e) {
			System.out.println(ElementDescription + " was not selected.");
		}

	}

	public static void mouseOverClick(String elementId, String locType) throws InterruptedException {
		Actions builder = new Actions(driver);

		WebElement object = findElement(elementId, locType);
		Action MoveToAcertainObject = builder.moveToElement(object).click().build();
		MoveToAcertainObject.perform();
	}

}
