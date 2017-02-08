package aui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Double_Click {

	public static void main(String[] args) throws Exception {
	
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
       WebElement rc= d.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		act.doubleClick(rc).perform();
		
	}

}


