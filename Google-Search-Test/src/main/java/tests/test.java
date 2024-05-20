package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	private WebDriver driver;

	// Preconditions:
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver(); // Open Chrome Browser
	}

	// Test
	@Test
	public void searchTest() {
		// TODO Auto-generated method stub

		driver.get("https://www.google.com/"); // Navigate to Google

		WebElement element = driver.findElement(By.name("q")); // find searchbox element
		element.sendKeys("Selenium Tutorials"); // Type the following word “Selenium Tutorials”

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement element2 = driver.findElement(By.name("btnK"));
		element2.click(); // click on Google search button

		// Validate the title of the search results page.
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Selenium Tutorials"), "Failed testing");

	}

	// Post Condition:
	@AfterTest
	public void close() {
		// Close the browser
		driver.quit();

	}

}
