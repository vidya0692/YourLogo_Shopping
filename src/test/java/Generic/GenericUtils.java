package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class GenericUtils extends YourLogo_BrowserAction {
	
	public static void mouseHover(WebDriver driver,WebElement toElement)
	{
		Actions action=new Actions(driver);
		action.moveToElement(toElement).perform();
		
	}
	public static void compare(String actual,String expected)
	{
		if(actual.equals(expected))
		{
			Reporter.log("Names are matching",true);
		}
		else
		{
			Reporter.log("Names are not matching",true);
		}
	}
	public static void selectByValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
		
	}
	public static void selectByIndex(WebElement element,int n)
	{
		Select select=new Select(element);
		select.selectByIndex(1);
	}
}