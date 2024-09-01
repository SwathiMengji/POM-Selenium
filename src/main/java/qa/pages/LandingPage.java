package qa.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.Base;

public class LandingPage extends Base{
	
	// NOT USING PAGE FACTORY
	
	//Object Repository 
	
	By login_button_landing_page = By.id("login2");
	By username = By.id("loginusername");
	By password = By.id("loginpassword");
	By login_button = By.xpath("//button[@onclick='logIn()']");
	
	//initialize elements
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Features
	
	public String validateLoginText() {
		return driver.findElement(login_button_landing_page).getText();
	}
	
	public HomePage login(String user, String pwd) {
		driver.findElement(login_button_landing_page).click();
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);	
		driver.findElement(login_button).click();
		
		return new HomePage(driver);
	}
	
	
	

	/*
	//Using Page factory
	
	@FindBy(id="login2")
	WebElement login_button_landing_page;
		
	@FindBy(id="loginusername")
	WebElement username;
		
	@FindBy(id="loginpassword")
	WebElement password;
		
	@FindBy(xpath = "//button[@onclick='logIn()']")
	WebElement login_button;
		
	//Constructor to initialize the elements in this class using page factory
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
		
		
	//Features (methods, actions)
	
	public String validateLoginText(){
		return login_button_landing_page.getText();
	}
		
	public HomePage login(String user, String pwd) {
		login_button_landing_page.click();
		username.sendKeys(user);
	    password.sendKeys(pwd);	
	    login_button.click();
	        
	    return new HomePage();
	}
	*/
	
}
