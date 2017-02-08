package day15_Robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_FileDownload {
  
	@Test
  public void f() throws Exception {
		
		WebDriver	driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//click 3.0.1 link
		driver.findElement(By.linkText("3.0.1")).click();
		
		Robot robo=new Robot();
		
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_PERIOD);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
  }
}
