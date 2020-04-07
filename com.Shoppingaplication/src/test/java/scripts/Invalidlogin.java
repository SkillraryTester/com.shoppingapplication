package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibs.Basetest;
import genericlibs.PropertyFile;
import genericlibs.Utilies;
import pages.HomePage;
import pages.LoginPage;

public class Invalidlogin  extends Basetest{
	
	@Test
	public void invalid()
	{
	PropertyFile p=new PropertyFile();
	Utilies u=new Utilies();
	u.waitforelementtobeloaded(driver);
	LoginPage l=new LoginPage(driver);
	Assert.assertEquals(p.getdata("Hometitle"),"My account");
	HomePage h = l.validlogin(p.getdata("inemail"),p.getdata("inpassword"));
	

}}
