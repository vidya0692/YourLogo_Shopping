package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Verification {
	
	public static WebDriver driver;
	public Verification(WebDriver driver)
	{
		this.driver=driver;
	}
	public static void pageVerify(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,20); 
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("Page displayed is: " +title,true);
	}
	public static void elementVerify(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element found was: "+element,true);
	}
	
	public static void elementIsSelected(WebElement element)
	{
		if(element.isSelected())
		{
			Reporter.log("Element is selected" ,true);
		}
		else
		{
			Reporter.log("Element is not selected",true);
		}
	}

}
