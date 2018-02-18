package selenium_final_exam_valio;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver driver;

	public static void startBrowser() {
		System.setProperty(Enums.driverType.getValue(), Enums.driverPath.getValue());
		driver = new ChromeDriver();
		driver.get(Enums.pragmaticURL.getValue());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		driver.close();

	}

	public static void contactform(String name, String email, String equiry) {
		WebElement inputName = Browser.driver.findElement(By.id(Enums.inputNameLocator.getValue()));
		Assert.assertTrue(inputName.isDisplayed());
		inputName.sendKeys(name);

		WebElement inputEmail = Browser.driver.findElement(By.id(Enums.inputEmailLocator.getValue()));
		Assert.assertTrue(inputEmail.isDisplayed());
		inputEmail.sendKeys(email);

		WebElement inputEquiry = Browser.driver.findElement(By.id(Enums.inputEnquiryLocator.getValue()));
		Assert.assertTrue(inputEquiry.isDisplayed());
		inputEquiry.sendKeys(equiry);

	}
}
