package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericlib.propertyfile; // @   =

public class Skillrarylogin {

	
	@FindBy(xpath="(//li//a[@data-toggle='dropdown'])[1]")
	private WebElement dropdownclick;
	
	
	@FindBy(xpath="//*[@id=\"front-header\"]/div[3]/header/div/div/div[3]/ul/li[3]/ul/li[7]/a/text()")
	private WebElement dropdown;
	
public Skillrarylogin (WebDriver driver) {
PageFactory.initElements(driver,this);

}
public void elementclick()
{dropdownclick.click();
	}
public void Dropdown() {
	dropdown.click();
}



}
