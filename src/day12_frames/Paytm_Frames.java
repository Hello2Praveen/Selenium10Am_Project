package day12_frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Paytm_Frames {
 
	@Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		//Click Login Link
		d.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div"))
		                                           .click();
		
		//identify the frames
	   List<WebElement> frame=	d.findElements(By.tagName("iframe"));
	   System.out.println(frame.size());
	   
	
	   for (int i = 0; i < frame.size(); i++) 
	   {
		   d.switchTo().frame(i);
		   
		   try {
			   //username
			   d.findElement(By.id("input_0")).sendKeys("dfdfdfdfdf");
			   d.findElement(By.id("input_1")).sendKeys("dfdfdfdfdf");
			d.findElement(By.className("md-raised .......lt-theme")).click();
			   
		} 
		   catch (Exception e) {
			   
			   //Switch from frame to window
			d.switchTo().defaultContent();
			   
		}
		   
		
	}
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
}
