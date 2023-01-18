package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;


public class baseclass {
	public WebDriver driver;
 public propertyfile pdata = new propertyfile();
 public Webdriveutilities utilities = new Webdriveutilities();
 
 @BeforeMethod

	 public void Openapp() throws FileNotFoundException, IOException {
	 FirefoxDriverManager.firefoxdriver().setup();
	 FirefoxDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getdata("url"));
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 }
 @AfterMethod
 public void closeapp(ITestResult res) throws IOException {
	 
	 int Status = res.getStatus();
	 String name  = res.getName(); 
	 
	 if (Status ==2)
	 {
		 Screenshot s = new Screenshot();
		 s.getphoto(driver, name);	 
	 }
	
	 driver.quit();
	 
 }
	

}
