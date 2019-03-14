package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:/Users/vivth/Rally/src/main/java/com/rally/config/config.properties" );
			prop.load(ip);
		}catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public void initilization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "B:/Driver/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("WebDriver.firefox.driver", "B:/Driver/geckodriver-v0.23.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	

}
