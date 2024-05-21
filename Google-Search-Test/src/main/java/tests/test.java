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
import pages.googlePage;
import pages.searchResultPage;

public class test {
	private WebDriver driver;
	googlePage objGoogle;

	searchResultPage objSearchResult;

	// Preconditions:
	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver(); // Open Chrome
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// Test
	@Test
	public void searchTest() {
		// TODO Auto-generated method stub
		driver.get("http://google.com");
		objGoogle = new googlePage(driver);

		objGoogle.searchOperation("Selenium Tutorials");
		objSearchResult = new searchResultPage(driver);

		Assert.assertTrue(objSearchResult.getSearchResultTiltle().contains("Selenium Tutorials"), "Failed testing");

	}

	// Post Condition:
	@AfterTest
	public void close() {
		// Close the browser
		driver.quit();

	}

}
