package Com.ANZ.TESTpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 
{

	public WebDriver driver;
	
	@BeforeMethod 
	public void Setup()
	{
		System.setProperty("webdriver.edge.driver",
				"./Drivers\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
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
	