package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement serachbutton;
	
	@FindBy(xpath="//a[.='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[1]")
	private WebElement eveningdress;
	
	public WebElement getWomen() {
		return women;
	}


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public ProductPage eveningdresssel()
	{
		eveningdress.click();
		return new ProductPage(driver);
	}
	
	
	public ProductPage serachingfordress(String dress)
	{
		serachtb.sendKeys(dress);
		serachbutton.click();
		return new ProductPage(driver);
		
	}

	

}
