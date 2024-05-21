package pages;

import org.openqa.selenium.WebDriver;

public class searchResultPage {
	  
	private WebDriver driver;
	    public searchResultPage(WebDriver driver){

	        this.driver = driver;

	    }

	        public String getSearchResultTiltle(){

	         return   driver.getTitle();

	        }


}
