package day15_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class UploadFile_Robot {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver	driver=new FirefoxDriver();
		driver.get("http://www.toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		StringSelection path=new StringSelection
				    ("E:\\Selenium10AMto1pm\\Screens\\xyzggg.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		driver.findElement(By.id("photo")).click();
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.delay(2000);
		// press ctrl + V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		// release V +Ctrl
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	
		
		
		
		
	  
  }
}
