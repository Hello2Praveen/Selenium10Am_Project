package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_Execution {
  
	@Test
  public void f() {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		PageObjects obj=PageFactory.initElements(driver, PageObjects.class);
		
		obj.loginApp();
	
	  
  }
}
