package Base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MainCoding {

	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com");

	}
	
	@AfterMethod
	public void postCodition()
	
	{
		driver.quit();
	}
	
	

}
