package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Verification;

public class YourLogo_SignIn extends Verification {

	public YourLogo_SignIn(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Sign in")
	private WebElement signinlink;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="passwd")
	private WebElement password;
	@FindBy(id="SubmitLogin")
	private WebElement signin;
	@FindBy(linkText="My addresses")
	private WebElement address;
	@FindBy(xpath="//a[@title='Orders']")
	private WebElement myorderlink;
	@FindBy(linkText="T-SHIRTS")
	private WebElement tshirts;
	@FindBy(linkText="Faded Short Sleeve T-shirts")
	private WebElement fadedtshirts;
	@FindBy(id="color_14")
	private WebElement color;
	@FindBy(name="Submit")
	private WebElement addtocart;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement ptc;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement checkout1;
	@FindBy(name="message")
	private WebElement message;
	@FindBy(name="processAddress")
	private WebElement checkout2;
	@FindBy(id="cgv")
	private WebElement agreeterms;
	@FindBy(name="processCarrier")
	private WebElement checkout3;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement paybankwire;
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirmorder;
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement cart;
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement contshop;
	@FindBy(xpath="//a[text()='Evening Dresses']")
	private WebElement evedress;
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement eveaddcart;
	@FindBy(xpath="//a[@title='View my shopping cart']")
	private WebElement shopcart;
	@FindBy(id="search_query_top")
	private WebElement search;
	@FindBy(name="submit_search")
	private WebElement srchbtn;
	@FindBy(linkText="Contact us")
	private WebElement contact;
	@FindBy(id="email")
	private WebElement contactemail;
	@FindBy(id="message")
	private WebElement msgg;
	@FindBy(id="submitMessage")
	private WebElement sendmsgbtn;
	@FindBy(linkText="SYMJISROF")
	private WebElement invoice;
	@FindBy(xpath="//a[text()='Download your invoice as a PDF file.']")
	private WebElement download;
	@FindBy(linkText="Sign out")
	private WebElement signout;
	
	public void clickSignInlink()
	{
		signinlink.click();
	}
	public void setemail(String emaill)
	{
		email.sendKeys(emaill);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickSignin()
	{
		signin.click();
	}
	public void clickAddress()
	{
		address.click();
	}
	public void clickmyOrder()
	{
		myorderlink.click();
	}
	public void clicktshirtlink()
	{
		tshirts.click();
	}
	public void clickfadedlink()
	{
		fadedtshirts.click();
	}
	public void selectcolor()
	{
		color.click();
	}
	public void clickaddcart()
	{
		addtocart.click();
	}
	public void clickpct()
	{
		ptc.click();
	}
	public void clickproceedtocheckout1()
	{
		checkout1.click();
	}
	public void setMessage(String msg)
	{
		message.sendKeys(msg);
	}
	public void clickproceedtocheckout2()
	{
		checkout2.click();
	}
	public void checkagrterms()
	{
		agreeterms.click();
	}
	public void clickproceedtocheckout3()
	{
		checkout3.click();
	}
	public void selectpaybankwire()
	{
		paybankwire.click();
	}
	public void clickconfirmorder()
	{
		confirmorder.click();
	}
	public void clickcart()
	{
		cart.click();
	}
	public void clickcontshop()
	{
		contshop.click();
	}
	public void clickevedress()
	{
		evedress.click();
	}
	public void clickevecart()
	{
		eveaddcart.click();
	}
	public void clickshopcart()
	{
		shopcart.click();
	}
	public void setsearch(String sr)
	{
		search.sendKeys(sr);
	}
	public void clicksrchbtn()
	{
		srchbtn.click();
	}
	public void clickContact()
	{
		contact.click();
	}
	public void setcontactemail(String e)
	{
		contactemail.sendKeys(e);
	}
	public void setmsgg(String msg)
	{
		msgg.sendKeys(msg);
	}
	public void clicksendmsg()
	{
		sendmsgbtn.click();
	}
	public void clickinvoice()
	{
		invoice.click();
	}
	public void clickdownload()
	{
		download.click();
	}
	public void clickSignout()
	{
		signout.click();
	}

}
