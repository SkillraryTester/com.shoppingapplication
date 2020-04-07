package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibs.Basetest;
import genericlibs.PropertyFile;
import genericlibs.Utilies;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class Deliveryproduct extends Basetest {
	@Test
	public void productdel()
	{
		PropertyFile p=new PropertyFile();
		Utilies u=new Utilies();
		u.waitforelementtobeloaded(driver);
		LoginPage l=new LoginPage(driver);
		Assert.assertEquals(p.getdata("Hometitle"),"My account - My Store");
		HomePage h = l.alternatelogin(p.getdata("Email"));
		u.mousehover(driver,h.getWomen());
		ProductPage pr = h.eveningdresssel();
		pr.delivery();
		Assert.assertEquals(p.getdata("deiverypagetitle"),"Delivery - My Store" );
		
	}
	

}
