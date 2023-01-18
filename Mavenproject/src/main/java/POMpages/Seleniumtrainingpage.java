package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Seleniumtrainingpage {

	
	@FindBy(xpath="//button[@id='add']")
	private WebElement plusbutton ;
	
	
	@FindBy(xpath="//button[@ondblclick='addtocart()']")
	private WebElement Addtocartbutton ;
	
	public Seleniumtrainingpage(WebDriver driver)
	{PageFactory.initElements(driver, this);
		
	}

	public WebElement getPlusbutton() {
		return plusbutton;
	}
	
	public void Addtocart() {
		Addtocartbutton.click();
	}
}
