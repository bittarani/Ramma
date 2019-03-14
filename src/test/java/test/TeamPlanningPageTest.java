package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Dashboard;
import page.TeamPlanning;

public class TeamPlanningPageTest extends TestBase{
	
	TeamPlanning teamplanning;
	Dashboard dashboard;
	
	@BeforeTest
	public void setUp() {
		initilization();
		dashboard = PageFactory.initElements(driver, Dashboard.class);
		dashboard.login(prop.getProperty("username"), prop.getProperty("password"));
		teamplanning = PageFactory.initElements(driver, TeamPlanning.class);
	}
	@AfterTest
	//Close the browser
	public void shutDownPage() {
		driver.close();
	}
	
	@Test(priority =1)
	public void clickMenubutton() {
		teamplanning.clickMenuButton();
	}
	
	@Test(priority = 2)
	public void isTeamplanningButtonclicked() {
		teamplanning.clickTeamplanningButton();
		Assert.assertEquals(teamplanning.clickTeamplanningButton().equalsIgnoreCase("Team Planning"), true);
	}

}
