package genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

public void getphoto(WebDriver driver, String  name ) throws IOException {
		// TODO Auto-generated method stub
TakesScreenshot S=  (TakesScreenshot)driver;
File src = S.getScreenshotAs(OutputType.FILE);

Date d = new Date();
String currentdate = d.toString().replaceAll(":", "-");


File dest = new File (Autoconstant.Photopath+currentdate+name+".png");
FileUtils.copyFile(src, dest);

	}

}
