package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.Base;

public class RegisterPage extends Base{
	//USING PAGE FACTORY
	
	//Constructor to initialize the elements in this class using page factory
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Object repository
	@FindBy(id="")
	WebElement login_button_landing_page;
			
	@FindBy(xpath = "")
	WebElement login_button;
			
				
	//Features (methods, actions)
	public String verify_continue_noEntries(){
		return login_button_landing_page.getText();
	}
	
	public void verify_existing_user() {
		
	}
	
	public void verify_password_match() {
		
	}
	
	public void verify_continue_nonCheck(){
		
	}

}
