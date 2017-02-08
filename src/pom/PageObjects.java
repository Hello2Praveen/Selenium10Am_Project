package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement un;
	
	@FindBy(id="txtPassword")
	@CacheLookup
	WebElement psd;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement logbtn;
	

	public void loginApp()
	{
		un.sendKeys("Admin");
		psd.sendKeys("admin");
		logbtn.click();
	}
	
	
	
	
	
	
	
	
	

}
