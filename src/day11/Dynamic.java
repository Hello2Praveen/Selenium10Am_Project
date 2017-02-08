package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Dynamic {
 
	@Test
  public void f() {
		
		  FirefoxDriver d=new FirefoxDriver();
			d.get("https://in.yahoo.com/?p=us");
			d.manage().window().maximize();
			
			Sleeper.sleepTightInSeconds(2);
			//search box
			d.findElement(By.id("UHSearchBox")).sendKeys("selenium");
			
			Sleeper.sleepTightInSeconds(2);
			
			//identify the Ajax elements
			List<WebElement> links= d.findElements(By.xpath
					("//*[starts-with(@id,'yui_3_12_0_3_14835')]/a"));
			
			// ( OR )    xpath("//*[contains(@id,'ui_3_12_0_3_14835')]/a")
			Sleeper.sleepTightInSeconds(2);
			
			//click selenium tutorial
			links.get(0).click();
		
  }
	
}


