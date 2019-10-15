package Scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.GenericData;
import Generic.GenericUtils;
import Generic.Verification;
import Generic.YourLogo_BrowserAction;
import POM.YourLogo_HomePage;
import POM.YourLogo_SignIn;

public class TestScripts extends YourLogo_BrowserAction
{
	
	@Test(enabled=true)
	public void createAccount() throws InterruptedException
	{
		YourLogo_HomePage home=new YourLogo_HomePage(driver);
		home.clickSignin();
		Verification.pageVerify("Login - My Store");
		home.setemailID("avm45@gmail.com");
		home.clicksubmitBtn();
		Thread.sleep(3000);
		home.selectradiogender();
		home.setFirstname("avm");
		home.setLastname("mva");
		home.setpassword("qwerty");
		GenericUtils.selectByValue(driver.findElement(By.id("days")), "1");
		GenericUtils.selectByIndex(driver.findElement(By.id("months")), 1);
		GenericUtils.selectByValue(driver.findElement(By.id("years")), "2019");
		String fn=home.getfnname();
		Reporter.log(fn,true);
		String ln=home.getlaname();
		Reporter.log(ln,true);
		home.setcompany("CTS");
		home.setaddress1("1 abc street");
		home.setaddress2("apt 1");
		home.setCity("TOR");
		GenericUtils.selectByIndex(driver.findElement(By.id("id_state")), 2);
		home.setPostalCode("12345");
		home.setMobile("234590");
		home.setAlias("agf@gmail.com");
		home.clickRegister();
		Verification.pageVerify("My account - My Store");
	}
	
	@Test(enabled=true)
	public void createAccErr()
	{
		YourLogo_HomePage home=new YourLogo_HomePage(driver);
		home.clickSignin();
		Verification.pageVerify("Login - My Store");
		home.setemailID("avm@gmail.com");
		home.clicksubmitBtn();
		Verification.elementVerify(driver.findElement(By.id("create_account_error")));
	}
	
	
	@Test(enabled=true)
	public void SignIn() throws EncryptedDocumentException, IOException
	{
		YourLogo_SignIn signin=new YourLogo_SignIn(driver);
		signin.clickSignInlink();
		Verification.pageVerify("Login - My Store");
		signin.setemail(GenericData.getData("Sheet1", 0, 1));
		signin.setPassword(GenericData.getData("Sheet1", 1, 1));
		signin.clickSignin();
		Verification.pageVerify("My account - My Store");
		signin.clickAddress();
		Verification.pageVerify("Addresses - My Store");
		signin.clickSignout();
		Verification.pageVerify("Login - My Store");
	}
	@Test(enabled=true)
	public void SigninErr()
	{
		YourLogo_SignIn signin=new YourLogo_SignIn(driver);
		signin.clickSignInlink();
		Verification.pageVerify("Login - My Store");
		signin.setemail("ght@gmail.com");
		signin.setPassword("1ghjtk");
		signin.clickSignin();
		Verification.elementVerify(driver.findElement(By.xpath("//p[text()='There is 1 error']")));
	}
	
	@Test(enabled=true)
	public void placeOrder() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		YourLogo_SignIn order=new YourLogo_SignIn(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		order.clickSignInlink();
		Verification.pageVerify("Login - My Store");
		order.setemail(GenericData.getData("Sheet1", 0, 1));
		order.setPassword(GenericData.getData("Sheet1", 1, 1));
		order.clickSignin();
		Verification.pageVerify("My account - My Store");
		order.clicktshirtlink();
		Verification.pageVerify("T-shirts - My Store");
		order.clickfadedlink();
		Verification.pageVerify("Faded Short Sleeve T-shirts - My Store");
		GenericUtils.selectByIndex(driver.findElement(By.id("group_1")), 1);
		order.selectcolor();
		order.clickaddcart();
		order.clickpct();
		Verification.pageVerify("Order - My Store");
		Thread.sleep(4000);
		order.clickproceedtocheckout1();
		order.setMessage("my  order");
		order.clickproceedtocheckout2();
		order.checkagrterms();
		order.clickproceedtocheckout3();
		order.selectpaybankwire();
		Verification.pageVerify("My Store");
		order.clickconfirmorder();
		Verification.pageVerify("Order confirmation - My Store");
		order.clickSignout();
	}
	
	@Test(enabled=true)
	public void myOrder() throws EncryptedDocumentException, IOException
	{
		YourLogo_SignIn order=new YourLogo_SignIn(driver);
		order.clickSignInlink();
		Verification.pageVerify("Login - My Store");
		order.setemail(GenericData.getData("Sheet1", 0, 1));
		order.setPassword(GenericData.getData("Sheet1", 1, 1));
		order.clickSignin();
		Verification.pageVerify("My account - My Store");
		order.clickmyOrder();
		Verification.pageVerify("Order history - My Store");
		order.clickinvoice();
		Verification.elementVerify(driver.findElement(By.xpath("//strong[text()='Order Reference SYMJISROF -- placed on 10/08/2019']")));
		order.clickdownload();
		order.clickSignout();
		Verification.pageVerify("Login - My Store");
	}
	
	@Test(enabled=true)
	public void mouseHoverWomen() 
	{	
		YourLogo_SignIn bro=new YourLogo_SignIn(driver);
		GenericUtils.mouseHover(driver, driver.findElement(By.xpath("//a[text()='Women']")));
		driver.findElement(By.xpath("//a[text()='Blouses']")).click();
		Verification.pageVerify("Blouses - My Store");
		driver.findElement(By.id("color_8")).click();
		Verification.pageVerify("Blouse - My Store");
	}
	
	@Test(enabled=true)
	public void viewCart()
	{
		YourLogo_SignIn cart=new YourLogo_SignIn(driver);
		cart.clicktshirtlink();
		Verification.pageVerify("T-shirts - My Store");
		cart.clickcart();
		cart.clickcontshop();
		GenericUtils.mouseHover(driver, driver.findElement(By.xpath("//a[text()='Women']")));
		cart.clickevedress();
		Verification.pageVerify("Evening Dresses - My Store");
		cart.clickevecart();
		cart.clickcontshop();
		GenericUtils.mouseHover(driver, driver.findElement(By.xpath("//a[@title='View my shopping cart']")));
		cart.clickshopcart();
		Verification.pageVerify("Order - My Store");
	}
	
	@Test(enabled=true)
	public void search()
	{
		YourLogo_SignIn search=new YourLogo_SignIn(driver);
		search.setsearch("Dress");
		search.clicksrchbtn();
		Verification.pageVerify("Search - My Store");
	}
	
	@Test(enabled=true)
	public void contactUs() throws InterruptedException, IOException
	{
		YourLogo_SignIn contact=new YourLogo_SignIn(driver);
		contact.clickSignInlink();
		Verification.pageVerify("Login - My Store");
		contact.setemail(GenericData.getData("Sheet1", 0, 1));
		contact.setPassword(GenericData.getData("Sheet1", 1, 1));
		contact.clickSignin();
		Verification.pageVerify("My account - My Store");
		contact.clickContact();
		Verification.pageVerify("Contact us - My Store");
		GenericUtils.selectByIndex(driver.findElement(By.name("id_contact")), 0);
		GenericUtils.selectByIndex(driver.findElement(By.name("id_order")), 1);
		GenericUtils.selectByIndex(driver.findElement(By.name("id_product")), 0);
		driver.findElement(By.id("fileUpload")).sendKeys("D:\\IN132482.pdf");
		contact.setmsgg("My order");
		contact.clicksendmsg();
		Verification.elementVerify(driver.findElement(By.xpath("//p[text()='Your message has been successfully sent to our team.']")));
	}
	

}
