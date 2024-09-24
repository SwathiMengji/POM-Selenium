package qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.util.Utils;

public class Base {
	
	//Initialize web driver
	public static WebDriver driver;
	
	//Initialize properties variable
	public static Properties properties;
	
	
	//base class constructor. 
	//Constructor is a special method that creates an instance of a class and initializes its instance variables. 
	//Constructors are automatically called when an object is created, setting the object's initial state.
	//They are used to: 1. Set initial values for object attributes, 2. Take parameters to initialize attributes, 3. Throw exceptions to prevent invalid objects from being created
	public Base() {
		
		//Read properties from config.properties
		try {
			properties = new Properties();
			FileInputStream input = new FileInputStream("C:/Users/mengj/Documents/QA_Projects/POM-Selenium/src/main/java/qa/config/config.properties");
			properties.load(input);
		}catch (FileNotFoundException error) {
			error.printStackTrace();
		}catch (IOException error) {
			error.printStackTrace();
		}
	}
	

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mengj\\Documents\\QA_Projects\\chromedriver-win64\\chromedriver.exe" );
		driver = new ChromeDriver();  //"driver" - global variable initialized on top of the code
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utils.PAGE_LOAD_TIMEOUT_DURATION));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utils.IMPLICITY_WAIT_DURATION));
		
		driver.get(properties.getProperty("url"));
	}
	
	public static void waitUntilElementByLocator(By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
}
