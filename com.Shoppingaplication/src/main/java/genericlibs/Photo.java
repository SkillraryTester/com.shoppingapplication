package genericlibs;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Photo  {
	public String getphoto(String photopath,String name,WebDriver driver)
	{
		Date d=new Date();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(photopath+d.toString().replace(":","-")+name+".png");
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			Reporter.log("photo not taken");
		}
		return name;
		
		
	}

}
