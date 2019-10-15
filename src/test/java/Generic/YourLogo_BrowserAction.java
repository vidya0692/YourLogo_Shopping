package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class YourLogo_BrowserAction implements Constants {
	public static WebDriver driver;
	@BeforeMethod
	public static void preCondition()
	{
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://automationpractice.com/index.php");
	}
	@AfterMethod
	public static void postCondition()
	{
		driver.close();
	}

}
