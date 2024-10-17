package qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.HomePage;
import qa.pages.LeavePage;
import qa.pages.LoginPage;

public class LeavePageTest extends Base{

	LoginPage loginPage;
	HomePage homePage;
    LeavePage leavePage;
    
	public LeavePageTest() {
		super(); 
	}
		
	@BeforeMethod
	public void setup() {
			
		launchBrowser();

		loginPage = new LoginPage(driver);	
		homePage = new HomePage(driver);
		leavePage = new LeavePage(driver);
		
		homePage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
		leavePage = homePage.navigateToLeaveFromHome();		
	}
		
		
	@Test(priority = 1)
	public void verifyHeadingOnLeavePage() {
		
		Assert.assertEquals(leavePage.headingOnLeavePage(), "Leave");
	}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
