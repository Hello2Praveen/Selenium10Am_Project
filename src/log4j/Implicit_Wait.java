package log4j;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Implicit_Wait {
  
	
	@Test
  public void f() throws Exception {
	  
		WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		
	  
  }
}







