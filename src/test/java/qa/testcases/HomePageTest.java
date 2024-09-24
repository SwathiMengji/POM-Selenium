package qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.HomePage;

public class HomePageTest extends Base{
	
	HomePage homePage;
	
	public HomePageTest() {
		super(); 
	}

	@BeforeMethod
	public void setup() {
		launchBrowser();
		homePage = new HomePage(driver);
	}
	
	
	@Test(priority = 1)
	public void SearchFunctionalityVaidation() {
		Assert.assertEquals(homePage.search_fucntionality(), "$98.00");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
