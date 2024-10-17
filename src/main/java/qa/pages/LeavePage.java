package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.base.Base;

public class LeavePage extends Base{
	//initialize elements
	public LeavePage(WebDriver driver) {
		this.driver = driver;
	}
		
	//Object Repository 
	By heading = By.xpath("//h6");
	By leaveListOption = By.xpath("//nav[@aria-label='Topbar Menu']//a[contains(text(),'Leave List')]");
	By applyOption = By.xpath("//nav[@aria-label='Topbar Menu']//a[contains(text(),'Apply')]");
	By applyOptionApplyHeading = By.xpath("//div[@class='orangehrm-card-container']/h6");
	
	//Features
			
	public String headingOnLeavePage() {
		waitUntilElementByLocator(leaveListOption);
		return driver.findElement(heading).getText();
	}	
	
	public void applyForLeave() {
		driver.findElement(applyOption).click();
		for (int i=0;i<100;i++) {
			waitUntilElementByLocator(applyOptionApplyHeading);
			if(driver.findElement(applyOptionApplyHeading).getText().equals("Apply Leave")) {
				break;
			}else {
				System.out.print("Issue with apply for leave section");
			}
		}
		
	}
	
}
