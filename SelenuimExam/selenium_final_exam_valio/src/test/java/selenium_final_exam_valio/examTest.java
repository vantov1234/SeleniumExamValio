package selenium_final_exam_valio;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class examTest {

	@Before
	public void setUp() throws Exception {
		Browser.startBrowser();
	}

	@After
	public void tearDown() throws Exception {
		Browser.closeBrowser();
	}

	@Test
	public void customerServicePresentTest() throws InterruptedException {
		WebElement contactUs = Browser.driver.findElement(By.linkText(Enums.contactUsLocator.getValue()));
		Assert.assertTrue(contactUs.isDisplayed());
		contactUs.click();

		Browser.contactform("Valio", "Valio@yahoo.com", "Site is not working");

		WebElement buttonSubmit = Browser.driver.findElement(By.cssSelector(Enums.buttonSubmitLocator.getValue()));
		Thread.sleep(1000);
		buttonSubmit.click();

		Thread.sleep(1000);

		WebElement buttonContinue = Browser.driver.findElement(By.linkText(Enums.buttonContinueLocator.getValue()));
		Assert.assertTrue(buttonContinue.isDisplayed());

	}

	
	
}
