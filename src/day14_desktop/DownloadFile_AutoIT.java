package day14_desktop;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadFile_AutoIT {
  
	
	@Test
  public void f() throws IOException, Exception {
		
		WebDriver	driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//click 3.0.1 link
		driver.findElement(By.linkText("3.0.1")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E:\\Selenium10AMto1pm\\AUtoIT\\AutoIt_Save.exe");
		
  }
}



