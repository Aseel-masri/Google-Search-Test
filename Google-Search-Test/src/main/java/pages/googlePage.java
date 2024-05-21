package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googlePage {
	private WebDriver driver;
	By searchbox = By.name("q");

	By searchbutton = By.name("btnK");
	public googlePage (WebDriver driver) {

		this.driver = driver;

	}
	public void setSearchBoxTilte(String searchtitle) {

		driver.findElement(searchbox).sendKeys(searchtitle);

	}

	public void search() {

		driver.findElement(searchbutton).click();

	}

	public void searchOperation(String searchtitle) {

		this.setSearchBoxTilte(searchtitle);
		this.search();
	}


}
