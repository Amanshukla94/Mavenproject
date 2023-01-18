package genericlib;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Webdriveutilities {
public WebDriver driver;	
	public void dropdown(WebElement ele, String text)
	{
		

		Select S  = new Select(ele);
		S.selectByValue("");
		S.selectByIndex(0);
		S.selectByVisibleText("");
	}
	public void mousehover(WebDriver driver,WebElement ele)
	{
		
		Actions A  = (Actions) driver;
		A.moveToElement(ele).perform();
	}
	public void doubleclick(WebElement ele)
	{
		
		Actions A = (Actions) driver;
		A.doubleClick(ele).perform();
	}
	public void switchtoframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchbacktoframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchtabs (WebDriver driver) {
		String Parent = driver.getWindowHandle();
		Set  <String> child = driver.getWindowHandles();
		child.remove(Parent);
		for (String b : child) {
		driver.switchTo().window(b);
	}}
	public void AutoIT(WebElement ele) throws IOException
	{
		
	Runtime.getRuntime().exec("");
	}
	
	public void scrollbar(WebElement ele ) {
		
		Point location = ele.getLocation();
		int x =location.getX();
		int y=location.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(x,y)", "");
		
		
		
		
		
		
		
		
		
		
		
	}
}
