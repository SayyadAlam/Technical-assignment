package Com.ANZ.TESTpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 
{

	public WebDriver driver;
	
	@BeforeMethod 
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"./DriverFilesFolder\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
	