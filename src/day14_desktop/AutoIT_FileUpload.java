package day14_desktop;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AutoIT_FileUpload {
  
	@Test
  public void f() throws IOException {
	  
		
	WebDriver	driver=new FirefoxDriver();
		driver.get("http://www.toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		//Click Browse Button
		driver.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		Runtime.getRuntime().exec("E:\\Selenium10AMto1pm\\AUtoIT\\Auto_Upload.exe");
		  
  }
}



