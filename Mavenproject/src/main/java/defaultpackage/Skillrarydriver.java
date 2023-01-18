package defaultpackage;

import org.testng.annotations.Test;

import POMpages.Seleniumtrainingpage;
import POMpages.Skillrarydemoapp;
import POMpages.Skillrarylogin;
import genericlib.baseclass;

public class Skillrarydriver extends baseclass {

	@Test
	
	public void tc1(){
		// TODO Auto-generated method stub

		Skillrarylogin S =new Skillrarylogin(driver);
		S.elementclick();
		S.Dropdown();
		
		
		utilities.switchtabs(driver);
		Skillrarydemoapp P = new Skillrarydemoapp(driver);
		utilities.mousehover(driver, P.getCourseclick());
		P.Seleniumtraining();
		
		utilities.switchtabs(driver);
		Seleniumtrainingpage T = new Seleniumtrainingpage(driver);
		T.getPlusbutton();
		T.Addtocart();
		
		
		
		
		
	
	  
		
	}

}
