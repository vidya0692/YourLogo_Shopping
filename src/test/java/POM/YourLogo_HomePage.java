package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.Verification;

public class YourLogo_HomePage extends Verification
{

	public YourLogo_HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Sign in")
	private WebElement signinlink;
	@FindBy(id="email_create")
	private WebElement emailID;
	@FindBy(id="SubmitCreate")
	private WebElement submitBtn;
	@FindBy(id="email")
	private WebElement emaill;
	@FindBy(id="id_gender1")
	private WebElement genderradio;
	@FindBy(id="customer_firstname")
	private WebElement firstname;
	@FindBy(id="customer_lastname")
	private WebElement lastname;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="passwd")
	private WebElement password;
	@FindBy(id="firstname")
	private WebElement fnname;
	@FindBy(id="lastname")
	private WebElement laname;
	@FindBy(id="company")
	private WebElement company;
	@FindBy(id="address1")
	private WebElement address1;
	@FindBy(id="address2")
	private WebElement address2;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(id="postcode")
	private WebElement postalcode;
	@FindBy(id="other")
	private WebElement other;
	@FindBy(id="phone_mobile")
	private WebElement mobile;
	@FindBy(id="alias")
	private WebElement alias;
	@FindBy(id="submitAccount")
	private WebElement registerbtn;
	public void clickSignin()
	{
		signinlink.click();
	}
	public void setemailID(String email)
	{
		emailID.sendKeys(email);
		
	}
	public void clicksubmitBtn()
	{
		submitBtn.click();
	}
	public String getEmailID()
	{
		String emailch=emaill.getText();
		return emailch;
	}
	public void selectradiogender()
	{
		genderradio.click();
	}
	public void setFirstname(String fn)
	{
		firstname.sendKeys(fn);
		 
	}
	public void setLastname(String ln)
	{
		lastname.sendKeys(ln);
	}
	
	public void setpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public String getfnname()
	{
		String fname=fnname.getText();
		return fname;
	}
	public String getlaname()
	{
		String lname=laname.getText();
		return lname;
	}
	public void setcompany(String com)
	{
		company.sendKeys(com);
	}
	public void setaddress1(String add1)
	{
		address1.sendKeys(add1);
	}
	public void setaddress2(String add2)
	{
		address2.sendKeys(add2);
	}
	public void setCity(String ci)
	{
		city.sendKeys(ci);
	}
	public void setPostalCode(String po)
	{
		postalcode.sendKeys(po);
	}
	public void setOther()
	{
		other.sendKeys("good");
	}
	public void setMobile(String ph)
	{
		mobile.sendKeys(ph);
	}
	public void setAlias(String al)
	{
		alias.sendKeys(al);
	}
	public void clickRegister()
	{
		registerbtn.click();
	}
}
