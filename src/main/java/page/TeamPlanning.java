package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamPlanning extends BasePage {

	public TeamPlanning(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css = "a[title='Team Planning']")
	WebElement teamPlanningbutton;
	
    
	@FindBy(css = "h1[class='smb-HeaderGroup-title']")
	WebElement getTitle;
	
	@FindBy(css = "span[aria-label='Open Sidebar']")
	WebElement menuButton;
	
	@FindBy(css = "h1.chr-ComponentsSideBar-headerTitle")
	WebElement verifyMenuButtonisClicked;
	
	
	public String clickTeamplanningButton() {
		teamPlanningbutton.click();
		return getTitle.getText();
	}
	
	public String clickMenuButton() {
		menuButton.click();
		return verifyMenuButtonisClicked.getText();
	}
	
	

}
