package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage {

	public Dashboard(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="j_username")
	WebElement usernameField;
	
	@FindBy(id="j_password")
	WebElement passwordField;
	
	@FindBy(id="login-button")
	WebElement loginField;
	
	
	public void login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginField.click();
	}
	
	

}
