package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	private WebElement signin;
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="passwd")
	private WebElement passwordtb;
	
	@FindBy(id="SubmitLogin")
	private WebElement sumbitbtn;
	
	@FindBy(id="newsletter-input")
	private WebElement newslettertb;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement gobtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	public HomePage alternatelogin(String email)
	{
		signin.click();
		newslettertb.sendKeys(email);
		gobtn.click();
		return new HomePage(driver);
		
		
	}
	
	
	public HomePage validlogin(String email,String pass)
	{
		signin.click();
		emailtb.sendKeys(email);
		passwordtb.sendKeys(pass);
		sumbitbtn.click();
		return new HomePage(driver);
		
	}
	

}
