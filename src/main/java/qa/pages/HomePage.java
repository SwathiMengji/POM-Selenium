package qa.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import qa.base.Base;

public class HomePage extends Base{
	// NOT USING PAGE FACTORY
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	//Object Repository 
	By search_field_home_page = By.name("search");
	By seach_button_home_page = By.xpath("//*[@id='search']//*[@type='button']");
	By img_title_seach_result = By.xpath("//img[@title='Canon EOS 5D']");
	By price_search_result = By.xpath("//p[@class='price']//span[@class='price-new']");
	
	//Features
	public String search_fucntionality() {
		driver.findElement(search_field_home_page).sendKeys("Canon EOS 5D");
		driver.findElement(seach_button_home_page).click();
		waitUntilElementByLocator(img_title_seach_result);
		String price = driver.findElement(price_search_result).getText();
		return price;
	}
	
}
