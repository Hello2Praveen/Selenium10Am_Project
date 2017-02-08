package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bing.com");	
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// identify the Sway Hidden link under Office Line link
		WebElement src= driver.findElement(By.xpath(".//*[@id='officemenu_sway_img']"));
		
		Sleeper.sleepTightInSeconds(2);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguement[0].click()", src);
		
		
		

  }
}
