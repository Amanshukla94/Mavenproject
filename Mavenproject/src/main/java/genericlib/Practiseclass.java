package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Practiseclass{
public WebDriver driver;
propertyfile pdata = new propertyfile();

@BeforeMethod
public void openapp() throws FileNotFoundException, IOException {
	System.setProperty(null, null);
	FirefoxDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get(pdata.getdata("url"));
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}
@AfterMethod
public void closeapp(ITestResult res) throws IOException {
	int status = res.getStatus();
	String name  =  res.getName();

	
	if ( status  == 2 )
	{
		Screenshot s  = new Screenshot();
		 s.getphoto(driver, name);
		
		
		
	}
	 driver.quit();
	
	
}


	


}


