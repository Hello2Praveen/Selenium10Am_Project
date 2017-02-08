package day20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class JavaScript_TextBox {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
      JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('lst-ib').value='hai hello'" );
		
		Sleeper.sleepTightInSeconds(2);
		
		jse.executeScript("document.getElementById('_fZl').click()");
		
		
		
  }
  
  
  
  
}
