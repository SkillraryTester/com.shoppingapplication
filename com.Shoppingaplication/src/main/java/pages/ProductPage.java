package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement sortdropdown;
	
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement sizechart;
	
	@FindBy(name="layered_id_attribute_group_24")
	private WebElement colorchart;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement deliverybtn;
	
	public WebElement getSortdropdown() {
		return sortdropdown;
	}

	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement selecteddress;
	
	public ProductPage(WebDriver driver)
	{
	 PageFactory.initElements(driver,this);
	 this.driver=driver;
	}
	
	public void delivery() {
		 sizechart.click();
		 colorchart.click();
		 deliverybtn.click();
		 
	}

	public CartPage selectingdress()
	{
		selecteddress.click();
		return new CartPage(driver);
	}
}
