package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Dashboard;

public class DashboardTest extends TestBase{
	
	Dashboard dashboard;
	
	public DashboardTest() {
		super();
	}
	
	@BeforeTest()
	public void setUp() {
		initilization();
		dashboard = PageFactory.initElements(driver, Dashboard.class);
	}
	
	@AfterTest()
	public void close() {
		driver.close();
	}
	
	@Test()
	public void Login() {
		dashboard.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	

}
