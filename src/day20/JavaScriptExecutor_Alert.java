package day20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor_Alert {
 
	
	@Test
  public void f() {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com/");
		driver.manage().window().maximize();
		
	 JavascriptExecutor	js= ((JavascriptExecutor)driver);
	 
	 js.executeScript("alert('ram')");
	 
	 driver.switchTo().alert().accept();
  }
}















