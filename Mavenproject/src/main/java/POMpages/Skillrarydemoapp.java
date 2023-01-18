package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarydemoapp {

	
	@FindBy(xpath="//li//a[@id=\"course\"]")
	private WebElement Courseclick;
	
	
	@FindBy(xpath="//span//a[text()=\"Selenium Training\"]")
	private WebElement Seleniumtraining;
	
	public Skillrarydemoapp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCourseclick() {
		return Courseclick;
	}


	public void Seleniumtraining() {
	Seleniumtraining.click();
	}
	
}
