package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class TextBox_JavaScript {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://bing.com/");
		driver.manage().window().maximize();
		
		//identify the Calander Link
		WebElement src=driver.findElement(By.id("officemenu_calendar_img"));
		
		//identify the Excel Link
		WebElement src12=driver.findElement(By.
				xpath(".//*[@id='officemenu_excel_img']"));
		
		Sleeper.sleepTightInSeconds(2);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].click()", src);
		
		Sleeper.sleepTightInSeconds(2);
		
		js.executeScript("arguments[1].click()", src12);
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
}
