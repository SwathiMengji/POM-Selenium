package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.base.Base;

public class LoginPage extends Base{

	// NOT USING PAGE FACTORY
	
		//Object Repository 
		
		By username = By.xpath("//input[@name='username']");
		By password = By.xpath("//input[@name='password']");
		By login_button = By.xpath("//button[@type='submit']");
		
		//initialize elements
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
		//Features
		
		public HomePage login(String user, String pwd) {
			driver.findElement(username).sendKeys(user);
			driver.findElement(password).sendKeys(pwd);	
			driver.findElement(login_button).click();
			
			return new HomePage(driver);
		}	
}
